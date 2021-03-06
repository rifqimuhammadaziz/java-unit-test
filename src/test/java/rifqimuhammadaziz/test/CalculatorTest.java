package rifqimuhammadaziz.test;

import org.junit.jupiter.api.*;
import org.opentest4j.TestAbortedException;
import rifqimuhammadaziz.test.generator.SimpleDisplayNameGenerator;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

@DisplayNameGeneration(SimpleDisplayNameGenerator.class)
public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before All");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After All");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("Before each");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("After each");
    }

    @Test
    // @DisplayName("Test Success for method add(Integer, Integer)")
    public void testAddSuccess() {
        var result = calculator.add(100, 20);
        assertEquals(120, result);
    }

    @Test
    // @DisplayName("Test Failed for method add(Integer, Integer)")
    public void testAddFailed() {
        var result = calculator.add(100, 20);
        assertNotEquals(1, result);
    }

    @Test
    // @DisplayName("Test Success for method divide(Integer, Integer)")
    public void testDivideSuccess() {
        var result = calculator.divide(100, 20);
        assertEquals(5, result);
    }

    @Test
    // @DisplayName("Test Failed for method divide(Integer, Integer)")
    public void testDivideFailed() {
        // if running on main class it will throw exception
        // For test, the method must throw an error
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(100, 0);
        });
    }

    @Test
    @Disabled
    public void testComingSoon() {
        // Disabled test
    }

    @Test
    public void testAborted() {
        var profile = System.getenv("PROFILE");
        if (!"DEV".equals(profile)) {
            // cancel test | to success, add env var in edit configuration
            throw new TestAbortedException("Test aborted because environment is not DEV!");
        }
        // unit test
    }

    @Test
    public void testAssumptions() {
        assumeTrue("DEV".equals(System.getenv("PROFILE")));
        // unit test for DEV
    }
}

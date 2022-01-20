package rifqimuhammadaziz.test;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import rifqimuhammadaziz.test.generator.SimpleDisplayNameGenerator;

import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(SimpleDisplayNameGenerator.class)
public class CalculatorTest {

    private Calculator calculator = new Calculator();

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

}

package rifqimuhammadaziz.test;

import org.junit.jupiter.api.*;

//@TestInstance(TestInstance.Lifecycle.PER_METHOD) // DEFAULT (Each method create new test instance)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTest {

    private int counter = 0;

    // TestInstance lifecycle per class can use BeforeAll & AfterAll without static method
    @BeforeAll
    void beforeAll() {

    }

    @AfterAll
    void afterAll() {

    }

    @Test
    @Order(2)
    void test5() {
        counter++;
        System.out.println(counter);
    }

    @Test
    @Order(1)
    void test4() {
        counter++;
        System.out.println(counter);
    }

    @Test
    @Order(4)
    void test3() {
        counter++;
        System.out.println(counter);
    }

    @Test@Order(5)
    void test2() {
        counter++;
        System.out.println(counter);
    }

    @Test
    @Order(3)
    void test1() {
        counter++;
        System.out.println(counter);
    }
}

package rifqimuhammadaziz.test;

import org.junit.jupiter.api.Test;

public class LifecycleTest {

    private String temp;

    @Test
    void test1() {
        // create new test
        temp = "Xenosty";
    }

    @Test
    void test2() {
        // lifecycle test (independent between methods)
        // create new test object even in test1 temp var has been set
        System.out.println(temp); // null
    }
}

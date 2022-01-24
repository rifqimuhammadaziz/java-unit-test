package rifqimuhammadaziz.test;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTest {

    @Test
    @Order(2)
    void test5() {

    }

    @Test
    @Order(1)
    void test4() {

    }

    @Test
    @Order(4)
    void test3() {

    }

    @Test@Order(5)
    void test2() {

    }

    @Test
    @Order(3)
    void test1() {

    }
}

package rifqimuhammadaziz.test;

import org.junit.jupiter.api.*;


@DisplayName("Information Test")
public class InformationTest {

    @Test
    @Tags({
            @Tag("infotest1")
    })
    @DisplayName("Test 1")
    void test1(TestInfo info) {
        System.out.println("Display name: " + info.getDisplayName());
        System.out.println("Tags: " + info.getTags());
        System.out.println("Class name: " + info.getTestClass().orElse(null));
        System.out.println("Method name: " + info.getTestMethod().orElse(null));
    }
}

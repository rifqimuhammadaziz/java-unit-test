package rifqimuhammadaziz.test;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

// can be run based on tags $mvn test -Dgroups=tagName
@Tags({
        @Tag("integration-test")
})
public class SampleIntegrationTest {

    @Test
    void testIntegration1() {
        System.out.println();
    }

    @Test
    void testIntegration2() {

    }
}

package rifqimuhammadaziz.test;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import java.util.Properties;

@Tag("condition-test")
public class ConditionTest {

    @Test
    @EnabledOnOs({OS.WINDOWS})
    void testRunOnlyOnWindows() {
        // run if os is windows
        System.out.println("This test only run on Windows");
    }

    @Test
    @DisabledOnOs({OS.WINDOWS})
    void testNotRunOnWindows() {
        // skip if os is Windows
    }

    @Test
    @EnabledOnJre({JRE.JAVA_8})
    void testEnabledOnJava8() {
        // run only on Java8
    }

    @Test
    @DisabledOnJre({JRE.JAVA_8})
    void testDisabledOnJava8() {
        // skip on Java8
        System.out.println("This test cannot in in JRE JAVA 8");
    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_12, max = JRE.JAVA_15)
    void testEnabledOnJava12To15() {
        // run only on Java12 to Java15
        System.out.println("This test can be run on JRE JAVA 12 until JAVA 15");
    }

    @Test
    @DisabledForJreRange(min = JRE.JAVA_12, max = JRE.JAVA_15)
    void testDisabledOnJava12To15() {
        // skip on Java12 To Java15
        System.out.println("This test cannot be run on JRE JAVA 12 until JAVA 15");
    }

    @Test
    void testSystemProperty() {
        // Get system properties
        Properties properties = System.getProperties();
        properties.forEach((key, value) -> System.out.println(key + ":" + value));
    }

    @Test
    @EnabledIfSystemProperties({
            @EnabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    })
    void testEnabledOnJavaVendorOracle() {
        // run if system property java.vendor is Oracle Corporation
    }

    @Test
    @DisabledIfSystemProperties({
            @DisabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    })
    void testDisabledOnJavaVendorOracle() {
        // skip if system property java.vendor is Oracle Corporation
    }

    @Test
    @EnabledIfEnvironmentVariables(
            @EnabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    )
    void testEnabledOnProfileDev() {
        // run if env PROFILE is DEV
    }

    @Test
    @DisabledIfEnvironmentVariables(
            @DisabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    )
    void testDisabledOnProfileDev() {
        // skip if env PROFILE is DEV
    }
}

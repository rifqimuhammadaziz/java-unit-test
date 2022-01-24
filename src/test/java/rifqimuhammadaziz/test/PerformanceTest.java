package rifqimuhammadaziz.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.util.concurrent.TimeUnit;

// Parallel test execution (running all test at the same time)
@Execution(ExecutionMode.CONCURRENT)
public class PerformanceTest {
    /**
     * Timeout
     * The test is failed when executed beyond the timeout
     */
    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS) // test is failed if exceeds 5 second
    void testSlow1() throws InterruptedException{
        Thread.sleep(4_000); // 4 second
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS) // test is failed if exceeds 5 second
    void testSlow2() throws InterruptedException{
        Thread.sleep(4_000); // 4 second
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS) // test is failed if exceeds 5 second
    void testSlow3() throws InterruptedException{
        Thread.sleep(4_000); // 4 second
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS) // test is failed if exceeds 5 second
    void testSlow4() throws InterruptedException{
        Thread.sleep(4_000); // 4 second
    }
}

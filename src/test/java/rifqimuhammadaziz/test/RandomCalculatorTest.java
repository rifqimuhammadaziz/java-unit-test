package rifqimuhammadaziz.test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import rifqimuhammadaziz.test.resolver.RandomParameterResolver;

import java.util.Random;

@Extensions({
        @ExtendWith(RandomParameterResolver.class)
})
public class RandomCalculatorTest extends AbstractCalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    void testRandom(Random random) {
        var a = random.nextInt();
        var b = random.nextInt();
        var result = calculator.add(a, b);
        var expected = a + b;

        Assertions.assertEquals(expected, result);
    }

    /**
     * RepeatedTest
     * value to repeat test
     * name to change of each test
     * @param random
     */
    @RepeatedTest(
            value = 10,
            name = "{displayName} ke {currentRepetition} dari {totalRepetitions}"
    )
    @DisplayName("Test random calculator")
    void testRandomRepeat(Random random) {
        var a = random.nextInt();
        var b = random.nextInt();
        var result = calculator.add(a, b);
        var expected = a + b;

        Assertions.assertEquals(expected, result);
    }

    @RepeatedTest(value = 10, name = "{displayName}")
    @DisplayName("Test random calculator")
    void testRandomRepeatInfo(Random random, TestInfo info, RepetitionInfo repetitionInfo) {
        System.out.println(info.getDisplayName() + " Ke " + repetitionInfo.getCurrentRepetition() + " Dari " + repetitionInfo.getTotalRepetitions());
        var a = random.nextInt();
        var b = random.nextInt();
        var result = calculator.add(a, b);
        var expected = a + b;

        Assertions.assertEquals(expected, result);
    }
}

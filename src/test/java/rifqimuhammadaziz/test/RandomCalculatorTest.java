package rifqimuhammadaziz.test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import rifqimuhammadaziz.test.resolver.RandomParameterResolver;

import java.util.List;
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

    /**
     * Test with Parameter (value source)
     */
    @DisplayName("Test calculator")
    @ParameterizedTest(name = "{displayName} with parameter {0}")
    @ValueSource(ints = {1,2,3,4,5,6,20,49,82,97})
    void testWithParameter(int value) {
        var expected = value + value;
        var result = calculator.add(value, value);
        Assertions.assertEquals(expected, result);
    }

    /**
     * Test with Parameter (method source)
     */
    public static List<Integer> parameterSource() {
        return List.of(1,2,23,29,36,44,52);
    }

    @DisplayName("Test calculator")
    @ParameterizedTest(name = "{displayName} with parameter {0}")
    @MethodSource({"parameterSource"})
    void testWithMethodSource(int value) {
        var expected = value + value;
        var result = calculator.add(value, value);
        Assertions.assertEquals(expected, result);
    }
}

package rifqimuhammadaziz.test;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testAddSuccess() {
        var result = calculator.add(100, 20);
    }


}

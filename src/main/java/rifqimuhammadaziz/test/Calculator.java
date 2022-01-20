package rifqimuhammadaziz.test;

public class Calculator {

    public Integer add(Integer number1, Integer number2) {
        return number1 + number2;
    }

    public Integer divide(Integer number1, Integer number2) {
        if (number1 == 0 || number2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        } else {
            return number1 / number2;
        }
    }
}

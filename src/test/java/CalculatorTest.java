import org.junit.jupiter.api.Assertions;

public class CalculatorTest {
    @org.junit.jupiter.api.Test
    public void test_plus_success() {
        // given:
        int x = 2;
        int y = 3;

        // when:
        Calculator calculator = Calculator.instance.get();
        int result = calculator.plus.apply(x, y);

        // then:
        Assertions.assertEquals(5, result);
    }

    @org.junit.jupiter.api.Test
    public void test_minus_success() {
        // given:
        int x = 2;
        int y = -3;

        // when:
        Calculator calculator = Calculator.instance.get();
        int result = calculator.minus.apply(x, y);

        // then:
        Assertions.assertEquals(5, result);
    }

    @org.junit.jupiter.api.Test
    public void test_multiply_success() {
        // given:
        int x = 2;
        int y = -3;

        // when:
        Calculator calculator = Calculator.instance.get();
        int result = calculator.multiply.apply(x, y);

        // then:
        Assertions.assertEquals(-6, result);
    }

    @org.junit.jupiter.api.Test
    public void test_divide_success() {
        // given:
        int x = 225;
        int y = 15;

        // when:
        Calculator calculator = Calculator.instance.get();
        int result = calculator.devide.apply(x, y);

        // then:
        Assertions.assertEquals(15, result);
    }

    @org.junit.jupiter.api.Test
    public void test_divideByZero_success() {
        // given:
        int x = 225;
        int y = 0;

        // when:
        Calculator calculator = Calculator.instance.get();
        int result = calculator.devide.apply(x, y);

        // then:
        Assertions.assertEquals(0, result);
    }
}

import org.example.Adder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class AdderTest {
    @Test
    public void adder_SHOULD_return_correct_result_WHEN_add_positive_values() {
        // arrange
        Adder adder = new Adder();
        double op1 = 5;
        double op2 = 10;
        double expected = op1+op2;
        // act
        double actual = adder.add(op1,op2);

        // assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void adder_SHOULD_return_correct_result_WHEN_add_negative_values() {
        // arrange
        Adder adder = new Adder();
        double op1 = -5;
        double op2 = -10;
        double expected = op1+op2;
        // act
        double actual = adder.add(op1,op2);

        // assert
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void adder_SHOULD_return_correct_result_WHEN_add_zeroes() {
        // arrange
        Adder adder = new Adder();
        double op1 = 0;
        double op2 = 0;
        double expected = op1+op2;
        // act
        double actual = adder.add(op1,op2);

        // assert
        Assertions.assertEquals(expected, actual);
    }
}

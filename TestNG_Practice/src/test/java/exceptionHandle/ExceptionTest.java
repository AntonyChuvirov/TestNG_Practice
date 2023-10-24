package exceptionHandle;

import org.testng.annotations.Test;

import static org.testng.Assert.assertThrows;

public class ExceptionTest {
    @Test/*(expectedExceptions = ArithmeticException.class)*/
    public void some1Test() {
        assertThrows(
                ArithmeticException.class,
                () -> divide(1, 0));
    }

    int divide(int input, int divide) {
        return input / divide;
    }
}

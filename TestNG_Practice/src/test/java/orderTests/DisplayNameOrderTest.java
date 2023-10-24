package orderTests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DisplayNameOrderTest {
    private static final StringBuilder output = new StringBuilder();

    @Test(priority = 1)
    public void firstTest() {
        output.append("a");
    }

    @Test(priority = 2)
    public void secondTest() {
        output.append("b");
    }

    @Test(priority = 3)
    public void thirdTest() {
        output.append("c");
    }

    @AfterTest
    public static void assertOutput() {
        assertEquals("abc", output.toString());
    }
}

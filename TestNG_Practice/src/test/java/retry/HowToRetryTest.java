package retry;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HowToRetryTest {
    private static int num = 0;

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void retryingTest() {
        Assert.assertEquals(2, num++);
    }
}

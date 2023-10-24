package parallel;

import org.testng.annotations.Test;

@Test(threadPoolSize = 3, invocationCount = 1, timeOut = 15000)
public class CheckParallelTest {
    @Test
    public void parallel1Test() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Test
    public void parallel2Test() throws InterruptedException {
        Thread.sleep(2000);
    }
}

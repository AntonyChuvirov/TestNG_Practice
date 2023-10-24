package suites;

import org.testng.annotations.Test;

public class Suite2Test {
    @Test(groups = {"group1"})
    public void suite1Test() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Test 1 from class 2 started");
    }

    @Test(groups = {"group1"})
    public void suite2Test() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Test 2 from class 2 started");
    }

    @Test(groups = {"group1"})
    public void suite3Test() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Test 3 from class 2 started");
    }
}

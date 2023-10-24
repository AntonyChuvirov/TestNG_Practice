package instance;

import org.testng.annotations.Test;

public class TestNGTestInstance {
    public TestNGTestInstance() {
        System.out.println("Start Instance");
    }

    @Test public void testOne(){}
    @Test public void testTwo(){}
    @Test public void testThree(){}
}

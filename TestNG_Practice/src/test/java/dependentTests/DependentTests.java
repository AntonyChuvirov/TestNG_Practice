package dependentTests;

import org.testng.annotations.Test;

public class DependentTests {
    @Test
    public void authorization() throws Exception {
//        throw new Exception();
    }

    @Test(dependsOnMethods = {"authorization"})
    public void writeMail() {
        //code
    }

    @Test(dependsOnMethods = {"authorization"})
    public void sendMail() {
        //code
    }
}

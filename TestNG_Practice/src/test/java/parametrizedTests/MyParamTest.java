package parametrizedTests;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MyParamTest {
    @DataProvider(parallel = true)
    private Object[][] dataProvider() {
        return new Object[][] {
                { "Cedric", 36},
                { "Anne", 37},
                { "Anne", 38},
                { "Anne", 39},
                { "Anne", 40},
        };
    }

    @Test(dataProvider = "dataProvider")
    public void testDataProvider(String name, int age) throws InterruptedException {
        Thread.sleep(2000);
        System.out.printf("My name is %s and I`m %d years old%n", name, age);
    }
}

package annotations;

import org.testng.annotations.*;


public class AnnotationsTest {
    @BeforeSuite
    public static void beforeSuite() {
        System.out.println("Before Suite method started");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test method started");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class method started");
    }

    @BeforeGroups(groups = {"someGroup"})
    public void beforeGroups() {
        System.out.println("Before Groups method started");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("\nBefore Method method started");
    }

    @Test
    public void annotation1Test() {
        System.out.println("Test 1 started");
    }

    @Test
    public void annotation2Test() {
        System.out.println("Test 2 started");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method method started\n");
    }

    @AfterGroups(groups = {"someGroup"})
    public void afterGroups() {
        System.out.println("After Groups method started");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class method started");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test method started");
    }

    @AfterSuite
    public static void afterSuite() {
        System.out.println("After Suite method started");
    }
}

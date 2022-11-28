import org.testng.annotations.*;

public class testngAnnotation {
    @Test(groups = "group")
    public void testCase1() {
        System.out.println("TEST 1");
    }

    @Test(groups = "group")
    public void testCase2() {
        System.out.println("TEST 2");
    }

    @BeforeGroups("group")
    public void beforeGroup() {
        System.out.println("BeforeGroups");
    }

    @AfterGroups("group")
    public void afterGroup() {
        System.out.println("AfterGroups");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("BeforeMethod");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("AfterMethod");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("BeforeClass");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("AfterClass");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("BeforeTest");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("AfterTest");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("BeforeSuite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("AfterSuite");
    }

}

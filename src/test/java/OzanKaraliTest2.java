import org.testng.annotations.*;

public class OzanKaraliTest2 {
    @BeforeClass
    void beforeClass(){
        System.out.println("This will execute before the class");
    }
    @AfterClass
    void afterClass( ){
        System.out.println("This will execute after the class");
    }
    @BeforeMethod
    void beforeMethod(){
        System.out.println("This will execute before every method");
    }
    @AfterMethod
    void afterMethod(){
        System.out.println("This will execute after every method");
    }

    @Test
    void test3(){
        System.out.println("This is test three");
    }
    @Test
    void test4(){
        System.out.println("This is test four");
    }
    @BeforeSuite
    void beforeSuite(){
        System.out.println("This will execute before test suite");
    }
    @AfterSuite
    void afterSuite(){
        System.out.println("This will execute before test suite");
    }

}

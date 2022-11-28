import org.testng.annotations.*;

public class OzanKaraliTest {
    @BeforeClass
    void beforeClass(){
        System.out.println("This will execute before the class");
    }
    @AfterClass
    void afterClass(){
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
    void test1(){
        System.out.println("This is test one");
    }
    @Test
    void test2(){
        System.out.println("This is test two");
    }
    @BeforeTest
     void beforeTest(){
         System.out.println("This will execute before the test");
    }
    @AfterTest
    void AfterTest(){
        System.out.println("This will execute after the test");
    }

}

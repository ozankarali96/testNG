import org.testng.Assert;
import org.testng.annotations.Test;

public class priority {
    @Test(priority = 1)
    void setup() {
        System.out.println("This is setup test");
    }

    @Test(priority = 450)
    void login() {
        System.out.println("This is login test");

    }

    @Test(priority = 205,enabled = false)
    void tearDown() {
        System.out.println("Closing browser");
    }
}

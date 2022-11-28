import org.testng.Assert;
import org.testng.annotations.Test;

public class dependencyExample {
    @Test
    void login(){
        System.out.println("This is login step");
    }
    @Test(dependsOnMethods = {"login"})
    void searchProduct(){
        System.out.println("This is search product step");
    }
    @Test(dependsOnMethods = {"searchProduct", "login"})
    void addToBasket(){
        System.out.println("This is add to basket step");
        Assert.fail();
    }
    @Test(dependsOnMethods = {"addToBasket"}, alwaysRun = true)
    void buyProduct(){
        System.out.println("This is buying product step");
    }
}

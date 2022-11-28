import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class assertionExample {
    WebDriver driver;
    @BeforeClass
    void setup(){
        System.setProperty("webdriver.chrome.driver","C:/Users/ekaroza/IdeaProjects/testNGProject/chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @Test
    void logoTest() throws InterruptedException {
        Thread.sleep(5000);
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img"));
        System.out.println(logo.isDisplayed());
        Assert.assertTrue(logo.isDisplayed());
    }

    @Test
    void homePageTitle(){
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("OrangeHRM", title);
    }
    @AfterClass
    void tearDown(){
        driver.quit();
    }
}

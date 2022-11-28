import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderExample {
    @Test(dataProvider = "LoginDataProvider",dataProviderClass = dataProviderExample2.class)
    public void loginTest(String email, String password){
        System.out.println("E-mail adress : " + email);
        System.out.println("Password : " + password);

    }

}

import org.testng.annotations.DataProvider;

public class dataProviderExample2 {
    @DataProvider(name = "LoginDataProvider")
    public Object[][] login(){
        Object[][] data = {{"superuser","superPassword"},{"user","password"},{"vendorUser","vendorPassword"}};
        return data;
    }
}

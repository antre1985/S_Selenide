package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import static com.codeborne.selenide.Selenide.*;

public class BaseTest {
    LoginPage loginPage;

    @BeforeMethod
    public void setup() {
        Configuration.browserSize = "1920x1080";
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://www.demoblaze.com/";
        Configuration.timeout = 10000;
        Configuration.headless = false;
        Configuration.holdBrowserOpen = false;

        loginPage = new LoginPage();
    }

    @AfterMethod
    public void close() {
        cookies().clear();
        closeWebDriver();
    }
}

package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.CartPage;
import pages.LoginPage;
import pages.ProductPage;

import static com.codeborne.selenide.Selenide.*;

public class BaseTest {

    protected LoginPage loginPage;
    protected ProductPage productPage;
    protected CartPage cartPage;

    @BeforeMethod
    public void setup() {
        Configuration.browserSize = "1920x1080";
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://www.demoblaze.com/";
        Configuration.timeout = 10000;
        Configuration.headless = false;
        Configuration.holdBrowserOpen = false;

        loginPage = new LoginPage();
        productPage = new ProductPage();
        cartPage = new CartPage();
    }

    @AfterMethod
    public void close() {
        cookies().clear();
        closeWebDriver();
    }
}
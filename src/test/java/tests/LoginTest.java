package tests;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;
import com.codeborne.selenide.Condition;

public class LoginTest extends BaseTest {
    pages.LoginPage loginPage = new pages.LoginPage();

    @Test
    public void projectIsOpen() {
        loginPage.openPage();
        loginPage.login();

        Selenide.confirm("Sign up successful.");
        loginPage.closeSignUpModal();

        loginPage.logInWithRegisteredUser();
        Selenide.$("#nameofuser").shouldBe(Condition.visible);
    }
}

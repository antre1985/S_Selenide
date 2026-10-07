package tests;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;
import com.codeborne.selenide.Condition;

public class LoginTest extends BaseTest {

    @Test
    public void projectIsOpen() {
        loginPage.openPage();
        loginPage.login();

        Selenide.confirm("Sign up successful.");
        loginPage.closeSignUpModal();

        loginPage.logInWithRegisteredUser();
        loginPage.verifyUserLoggedIn();
    }
}

package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
    private String generatedUsername;
    final SelenideElement cartMenuBtn = $("#cartur");
    final SelenideElement nokiaLumia1520 = $(com.codeborne.selenide.Selectors.byText("Nokia lumia 1520"));
    final SelenideElement signUpBtn = $("#signin2");
    final SelenideElement userName = $("#sign-username");
    final SelenideElement password = $("#sign-password");
    final SelenideElement signUpBtn2 = $("[onclick=\"register()\"]");
    final SelenideElement closeBtn = $("#signInModal button.close");
    final SelenideElement loginMenuBtn = $("#login2");
    final SelenideElement loginUserName = $("#loginusername");
    final SelenideElement loginPassword = $("#loginpassword");
    final SelenideElement loginSubmitBtn = $("[onclick=\"logIn()\"]");
    final SelenideElement nameOfUser = $("#nameofuser");

    public void openPage() {
        open("https://www.demoblaze.com/");
    }

    public void login() {
        signUpBtn.click();
        this.generatedUsername = "anton" + System.currentTimeMillis();
        userName.setValue(generatedUsername);
        password.setValue("Phantosmagoria23");
        signUpBtn2.click();
    }

    public void closeSignUpModal() {
        closeBtn.click();
        }

    public void logInWithRegisteredUser() {
        loginMenuBtn.click();
        loginUserName.setValue(generatedUsername);
        loginPassword.setValue("Phantosmagoria23");
        loginSubmitBtn.click();
    }

    public void clickOnProduct() {
        nokiaLumia1520.click();
    }

    public void goToCart() {
        cartMenuBtn.click();
    }

    public void verifyUserLoggedIn() {
        $("#nameofuser").shouldBe(visible);
    }
}

package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {

 @Test
 public void addProductToCartTest() {

     loginPage.openPage();
     loginPage.clickOnProduct();

     productPage.addProductToCart();

     Selenide.confirm("Product added");
     loginPage.goToCart();

     cartPage.getCartTable()
             .shouldBe(Condition.visible)
             .shouldHave(Condition.text("Nokia lumia 1520"));
    }
}

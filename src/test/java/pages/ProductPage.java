package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ProductPage {
    private final SelenideElement addToCartBtn = $(com.codeborne.selenide.Selectors.byText("Add to cart"));

    public void addProductToCart() {
        addToCartBtn.click();
    }
}

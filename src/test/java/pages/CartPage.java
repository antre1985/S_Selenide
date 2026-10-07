package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CartPage {
    private final SelenideElement cartTable = $("#tbodyid");

    public SelenideElement getCartTable() {
        return cartTable;
    }
}

package pages;

import org.openqa.selenium.By;

public class CartPage extends BasePage {
    private By checkoutButtonLocator = By.id("checkout");

    public void clickCheckoutButton() {
        driver.findElement(checkoutButtonLocator).click();
    }
}

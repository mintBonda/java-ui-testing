package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage {
    private By shoppingCartLocator = By.cssSelector("a.shopping_cart_link");
    private By addProductToCartButtonLocator = By.cssSelector("button.btn_inventory");

    public void addProductToCart() {
        List<WebElement> products = driver.findElements(addProductToCartButtonLocator);
        WebElement element = products.get(0);
        element.click();
    }

    public void clickOnCart() {
        driver.findElement(shoppingCartLocator).click();
    }
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckOutCompletePage extends BasePage {
    private By completeHeaderLocator = By.cssSelector("h2.complete-header");

    public String findCompleteHeader() {
        WebElement element = driver.findElement(completeHeaderLocator);
        return element.getText();
    }
}

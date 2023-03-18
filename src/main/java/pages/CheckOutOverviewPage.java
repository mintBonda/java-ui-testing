package pages;

import org.openqa.selenium.By;

public class CheckOutOverviewPage extends BasePage {
    private By finishButtonLocator = By.id("finish");

    public void clickFinish() {
        driver.findElement(finishButtonLocator).click();
    }
}

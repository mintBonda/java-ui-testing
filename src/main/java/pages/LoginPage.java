package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static config.Constants.LOGIN_PAGE_URL;

public class LoginPage extends BasePage {
    private By usernameLocator = By.id("user-name");
    private By passwordLocator = By.xpath("//input[@id='password']");
    private By loginButtonLocator = By.cssSelector("input.submit-button");
    private By errorMessageLocator = By.xpath("//*[@id='login_button_container']/div/form/div[3]/h3");

    public void openPage() {
        driver.get(LOGIN_PAGE_URL);
    }

    public void enterUsername(String username) {
        driver.findElement(usernameLocator).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordLocator).sendKeys(password);
    }

    public String findErrorMessage() {
        WebElement element = driver.findElement(errorMessageLocator);
        return element.getText();
    }

    public ProductsPage clickLogin() {
        driver.findElement(loginButtonLocator).submit();
        return new ProductsPage();
    }
}

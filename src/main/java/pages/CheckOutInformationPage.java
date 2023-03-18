package pages;

import org.openqa.selenium.By;

public class CheckOutInformationPage extends BasePage{
    private By firstnameLocator = By.id("first-name");
    private By lastnameLocator = By.id("last-name");
    private By postalCodeLocator = By.xpath("//*[@id='postal-code']");
    private By continueButtonLocator = By.cssSelector("input.submit-button");

    public void enterFirstname(String firstname){
        driver.findElement(firstnameLocator).sendKeys(firstname);
    }

    public void enterLastname(String lastname){
        driver.findElement(lastnameLocator).sendKeys(lastname);
    }

    public void enterPostcode(String postcode){
        driver.findElement(postalCodeLocator).sendKeys(postcode);
    }

    public CheckOutOverviewPage clickContinue(){
        driver.findElement(continueButtonLocator).submit();
        return new CheckOutOverviewPage();
    }
}

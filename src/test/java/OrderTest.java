import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.*;

import static config.Constants.EXPECTED_MESSAGE;
import static config.Constants.EXPECTED_URL;

public class OrderTest extends BaseTest{

    @Before
    public void setUp() {
        loginPage.openPage();
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLogin();
    }

    @Test
    @Owner("Исхаков Тимур")
    @Description("Проверка успешной покупки")
    public void orderTest() {
        productsPage.addProductToCart();
        productsPage.clickOnCart();

        cartPage.clickCheckoutButton();

        String testValue = "test";
        checkOutInformationPage.enterFirstname(testValue);
        checkOutInformationPage.enterLastname(testValue);
        checkOutInformationPage.enterPostcode(testValue);
        checkOutInformationPage.clickContinue();

        checkOutOverviewPage.clickFinish();

        String currentUrl = driver.getCurrentUrl();
        Assert.assertEquals(EXPECTED_URL, currentUrl);
        Assert.assertEquals(EXPECTED_MESSAGE, checkOutCompletePage.findCompleteHeader());
    }
}

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

public class BaseTest {
    protected static WebDriver driver;
    protected static LoginPage loginPage;
    protected static ProductsPage productsPage;
    protected static CartPage cartPage;
    protected static CheckOutInformationPage checkOutInformationPage;
    protected static CheckOutOverviewPage checkOutOverviewPage;
    protected static CheckOutCompletePage checkOutCompletePage;

    @BeforeClass
    public static void setUpDriver() {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver = new ChromeDriver();
        BasePage.setDriver(driver);
        loginPage = new LoginPage();
        productsPage = new ProductsPage();
        cartPage = new CartPage();
        checkOutInformationPage = new CheckOutInformationPage();
        checkOutOverviewPage = new CheckOutOverviewPage();
        checkOutCompletePage = new CheckOutCompletePage();
    }

    @After
    public void close() {
        driver.quit();
    }
}

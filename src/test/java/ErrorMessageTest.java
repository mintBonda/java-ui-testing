import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.*;

import static config.Constants.EXPECTED_ERROR_MESSAGE;

public class ErrorMessageTest extends BaseTest {

    @Before
    public void setUp() {
        loginPage.openPage();
    }

    @Test
    @Owner("Исхаков Тимур")
    @Description("Проверка сообщения об ошибке при попытке ввода логина " +
                 "на несуществующего пользователя")
    public void errorMessageTest() {
        loginPage.enterUsername("test");
        loginPage.enterPassword("test");
        loginPage.clickLogin();

        Assert.assertEquals(EXPECTED_ERROR_MESSAGE, loginPage.findErrorMessage());
    }
}

 package testingPages;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.FindTransactionsPage;
import pages.HomePage;
import pages.RegisterPage;

import static org.junit.Assert.assertTrue;

public class TransactionDateTest {
    WebDriver driver;
    RegisterPage registerPage;
    HomePage homePage;
    FindTransactionsPage findTransactionsPage;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/register.htm");

        registerPage = new RegisterPage(driver);
        homePage = new HomePage(driver);
        findTransactionsPage = new FindTransactionsPage(driver);
    }

    @Test
    public void testInvalidDateFormat() {
        registerPage.fillRegistrationForm("John", "Doe", "123 Street", "City", "State", "12345",
                "123456789", "123-45-6789", "johndesoe", "password123", "password123");
        registerPage.clickRegister();

        homePage.clickFindTransactions();

        findTransactionsPage.enterTransactionDate("12/31/2024");
        findTransactionsPage.clickFindByDate();

        assertTrue("Error message should be displayed for invalid date format.",
                findTransactionsPage.isErrorMessageDisplayed());
        assertTrue("Error message text should indicate invalid format.",
                findTransactionsPage.getErrorMessageText().contains("Invalid date format"));
    }



    }


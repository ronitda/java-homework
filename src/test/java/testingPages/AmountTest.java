package testingPages;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.FindTransactionsPage;
import pages.HomePage;
import pages.RegisterPage;

import static org.junit.Assert.assertTrue;

public class AmountTest {
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
    public void testInvalidAmount() {
        // Step 1: Register a new user
        registerPage.fillRegistrationForm("John", "Doe", "123 Street", "City", "State", "12345",
                "123456789", "123-45-6789", "johndxtde", "password123", "password123");
        registerPage.clickRegister();

        homePage.clickFindTransactions();

        findTransactionsPage.enterAmount(" ");
        findTransactionsPage.clickFindByAmount();

        assertTrue("Error message should be displayed for invalid amount.",
                findTransactionsPage.isAmountErrorMessageDisplayed());

        assertTrue("Error message text should indicate the amount is invalid.",
                findTransactionsPage.getAmountErrorMessageText().contains("Invalid amount"));
    }



}


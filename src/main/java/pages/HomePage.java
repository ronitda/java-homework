package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By findTransactionsLink = By.linkText("Find Transactions");

    public void clickFindTransactions() {
        driver.findElement(findTransactionsLink).click();
    }
}


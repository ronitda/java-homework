package pages;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FindTransactionsPage {
    WebDriver driver;

    public FindTransactionsPage(WebDriver driver) {
        this.driver = driver;
    }

    private By amountField = By.id("amount");
    private By findByAmountButton = By.id("findByAmount");
    private By transactionDateField = By.id("transactionDate");
    private By findByDateButton = By.id("findByDate");
    private By errorMessage = By.id("transactionDateError");
    private  By errorAmount = By.id("amountError");

    public void enterAmount(String amount) {
        driver.findElement(amountField).sendKeys(amount);
    }
    public boolean isAmountFieldValid() {
        try {
            return driver.findElement(errorAmount).isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void clickFindByAmount() {
        driver.findElement(findByAmountButton).click();
    }

    public void enterTransactionDate(String date) {
        driver.findElement(transactionDateField).clear();
        driver.findElement(transactionDateField).sendKeys(date);
    }

    public void clickFindByDate() {
        driver.findElement(findByDateButton).click();
    }

    public boolean isErrorMessageDisplayed() {
        return driver.findElements(errorMessage).size() > 0;
    }

    public String getErrorMessageText() {
        if (isErrorMessageDisplayed()) {
            return driver.findElement(errorMessage).getText();
        }
        return "";
    }

    public boolean isAmountErrorMessageDisplayed() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
            WebElement errorElement = wait.until(ExpectedConditions.visibilityOfElementLocated(errorAmount));
            return errorElement.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public String getAmountErrorMessageText() {
        if (isAmountErrorMessageDisplayed()) {
            return driver.findElement(errorAmount).getText();
        }
        return "";
    }
}


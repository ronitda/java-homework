package demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.domstorage.model.Item;

import java.util.List;

public class AutomationHomework {
    public static void main(String []args){

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.applitools.com/");

        WebElement userInput = driver.findElement(By.cssSelector(".form-control"));
        userInput.sendKeys("Daniel");

        WebElement userPassword = driver.findElement(By.cssSelector("#password"));
        userPassword.sendKeys("12345");

        WebElement signIn = driver.findElement(By.cssSelector("#log-in"));
        signIn.click();


        List<WebElement> balance = driver.findElements(By.cssSelector("div.balance-value"));
        for (WebElement item : balance) {
            String balanceText = item.getText().split("%")[0].trim();
            System.out.println("Balance value: " + balanceText);
        }

        System.out.println("*----------*---------*---------*");

        List<WebElement> transactionRows = driver.findElements(By.tagName("tr"));
        for (WebElement row : transactionRows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            if (cells.size() > 0) {
                String status = cells.get(0).getText();
                String description = cells.get(2).getText();
                String amount = cells.get(4).getText();

                System.out.println("Status: " + status);
                System.out.println("Description: " + description);
                System.out.println("Amount: " + amount);
                System.out.println("----------------------------");
            }
        }

    }
}

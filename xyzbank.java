package demo;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class xyzbank {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\git\\SeleniumJavaFramework1\\SeleniumJavaFramework\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Customer Login']"))).click();
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        
        WebElement selectElement = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#userSelect")));
        
        selectElement.sendKeys("Harry Potter"); 
        selectElement.findElement(By.xpath("//button[@type='submit']")).click();
        WebElement selectElement1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.name("accountSelect")));

        Select select1 = new Select(selectElement1);
        select1.selectByValue("number:1005");
        
        driver.findElement(By.xpath("//button[normalize-space()='Deposit']")).click();
        WebElement amountInput = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='amount']")));
        amountInput.sendKeys("6000");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Withdrawl']")).click();
        WebElement amountWithdraw = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='amount']")));
        amountWithdraw.sendKeys("2000");
        driver.findElement(By.xpath("//button[normalize-space()='Transactions']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='btn home']")).click();
        

            }
}

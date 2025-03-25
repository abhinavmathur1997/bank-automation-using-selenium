package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class demobank2 {
public static void main(String[] args)
{
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\git\\SeleniumJavaFramework1\\SeleniumJavaFramework\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https://demo.guru99.com/V4/");
     driver.findElement(By.name("uid")).sendKeys("mngr615504");
     driver.findElement(By.name("password")).sendKeys("Yzagune");
     driver.findElement(By.name("btnLogin")).click();
    driver.findElement(By.linkText("Customised Statement")).click();
    driver.findElement(By.name("accountno")).sendKeys("143293");
    driver.findElement(By.name("fdate")).sendKeys("11-03-2025");
    driver.findElement(By.name("tdate")).sendKeys("11-04-2025");
    driver.findElement(By.name("amountlowerlimit")).sendKeys("6000");
    driver.findElement(By.name("numtransaction")).sendKeys("5");
    driver.findElement(By.name("AccSubmit")).click();
}
}

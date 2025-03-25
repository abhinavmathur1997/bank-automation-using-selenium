package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class demobank3 {
public static void main(String[] args)
{
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\git\\SeleniumJavaFramework1\\SeleniumJavaFramework\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https://demo.guru99.com/V4/");
     driver.findElement(By.name("uid")).sendKeys("mngr615504");
     driver.findElement(By.name("password")).sendKeys("Yzagune");
     driver.findElement(By.name("btnLogin")).click();
    driver.findElement(By.linkText("Deposit")).click();
    driver.findElement(By.name("accountno")).sendKeys("143293");
    driver.findElement(By.name("ammount")).sendKeys("6000");
    driver.findElement(By.name("desc")).sendKeys("abcd");
    driver.findElement(By.name("AccSubmit")).click();
}
}

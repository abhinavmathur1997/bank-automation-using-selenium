package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class demobank1 {
	public static void main(String[] args)
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\git\\SeleniumJavaFramework1\\SeleniumJavaFramework\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://demo.guru99.com/V4/");
	     driver.findElement(By.name("uid")).sendKeys("mngr615504");
	     driver.findElement(By.name("password")).sendKeys("Yzagune");
	     driver.findElement(By.name("btnLogin")).click();
	     driver.findElement(By.linkText("New Account")).click();
	     driver.findElement(By.name("cusid")).sendKeys("63589");
	     WebElement selectElement = driver.findElement(By.name("selaccount"));
	      Select select = new Select(selectElement);
	      select.selectByValue("Current");
	      driver.findElement(By.name("inideposit")).sendKeys("6000");
	      driver.findElement(By.name("button2")).sendKeys(Keys.RETURN);
	     
	     
	}

}

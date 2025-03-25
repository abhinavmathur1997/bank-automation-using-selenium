package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class demobank {
public static void main(String[] args)
{
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\git\\SeleniumJavaFramework1\\SeleniumJavaFramework\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https://demo.guru99.com/V4/");
     driver.findElement(By.name("uid")).sendKeys("mngr615504");
     driver.findElement(By.name("password")).sendKeys("Yzagune");
     driver.findElement(By.name("btnLogin")).click();
driver.findElement(By.linkText("New Customer")).click();
driver.findElement(By.name("name")).sendKeys("Abhinav Mathur");
driver.findElement(By.name("rad1")).click();
driver.findElement(By.name("dob")).sendKeys("12-08-1997");
driver.findElement(By.name("addr")).sendKeys("Balkampet Hyderabad");
driver.findElement(By.name("city")).sendKeys("Hyderabad");
driver.findElement(By.name("state")).sendKeys("Telangana");
driver.findElement(By.name("pinno")).sendKeys("500016");
driver.findElement(By.name("telephoneno")).sendKeys("9152106461");
driver.findElement(By.name("emailid")).sendKeys("abhinavkishore999@gmail.com");
driver.findElement(By.name("password")).sendKeys("Yzagune");
driver.findElement(By.name("sub")).click();
}
}

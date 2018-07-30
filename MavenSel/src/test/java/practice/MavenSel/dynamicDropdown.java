package practice.MavenSel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dynamicDropdown {
	
	
	
	@Test
	public void dynamicdrop()
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Selenium setups\\selenium drivers and JAR\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();

		driver.get("http://www.spicejet.com");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		driver.findElement(By.xpath("(//a[@value='BOM'])[2]")).click();

}
}
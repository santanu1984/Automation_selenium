package practice.MavenSel;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alerts {

public static void main(String[] args) {

// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver","C:\\Selenium setups\\selenium drivers and JAR\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();

driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");

driver.findElement(By.xpath("html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();

System.out.println(driver.switchTo().alert().getText());

//driver.switchTo().alert().sendKeys("fesfe");

driver.switchTo().alert().accept(); //Accept = ok done yes

//driver.switchTo().alert().dismiss();
}
}
package practice.MavenSel;	
	import java.util.List;
	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Calender {

	public static void main(String[] args) {
	// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Selenium setups\\selenium drivers and JAR\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	driver.get("http://www.spicejet.com");
	//April 23
	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();


	while(!driver.findElement(By.cssSelector("[class='ui-datepicker-month']")).getText().contains("September")||!driver.findElement(By.cssSelector("[class='ui-datepicker-year']")).getText().contains("2018"))
	{
	driver.findElement(By.cssSelector("[class='ui-icon ui-icon-circle-triangle-e']")).click();
	}


	List<WebElement> dates= driver.findElements(By.className("ui-state-default"));
	//Grab common attribute//Put into list and iterate
	int count=driver.findElements(By.className("ui-state-default")).size();

	for(int i=0;i<count;i++)
	{
	String text=driver.findElements(By.className("ui-state-default")).get(i).getText();
	if(text.equalsIgnoreCase("29"))
	{
	driver.findElements(By.className("ui-state-default")).get(i).click();
	break;
	}

	}
	}

	}



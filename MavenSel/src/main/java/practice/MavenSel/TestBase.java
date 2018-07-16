package practice.MavenSel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {
	
	public static WebDriver driver=null;
	
	//Example of global variable in Selenium
	
	public static void Login() throws IOException
	
	//public static void main(String[]args) throws IOException
	{
		Properties prop= new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\tza1051\\eclipse-workspace_Selsetup_July12\\Selenium Practice\\src\\Main\\datadriven.properties");
	
	// connect prop and fis so that prop object can find the file
		
		prop.load(fis);
		System.out.println(prop.getProperty("Username"));
				
		if(prop.getProperty("Browser").equals("Firefox"))
		{
			System.setProperty("webdriver.firefox.driver","C:\\Selenium setups\\selenium drivers and JAR\\geckodriver-v0.18.0-win64\\geckodriver.exe");
			driver= new FirefoxDriver();
		}
		else if(prop.getProperty("Browser").equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Selenium setups\\selenium drivers and JAR\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		else		
		{
			System.setProperty("webdriver.chrome.driver","C:\\Selenium setups\\selenium drivers and JAR\\IEDriverServer_x64_3.5.1\\IEDriverServer.exe");
			driver= new InternetExplorerDriver();
		}
		
		driver.get(prop.getProperty("Url"));
	
	}
	
	
}

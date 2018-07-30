package practice.MavenSel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;



public class RadioButton extends TestBase {

			
	//	public static void main(String[] args) throws IOException {
	@Test		
	public void dropdown() throws IOException
	{
	Login();
			
			//select the radio button 
			driver.findElement(By.xpath("//input[@value='RoundTrip']")).click();
			// count of radio button - by size method. for this 'findelements' should be used 
			int count=driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).size();
				
			// in case we don't have a unique object to form the xpath this is the process to select desired radio button
			//choose one object common to all and find the radio button with xpath and then the for loop as below to select 
			for ( int i=0;i<count;i++)
			{
				System.out.println(driver.findElements(By.xpath("//input[@name='ctl00$mainContent$rbtnl_Trip']")).get(i).getAttribute("value"));
			}

	}

}

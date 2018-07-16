package practice.MavenSel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class dropdown extends TestBase {

	public static void main(String[] args) throws IOException {
		
		Login();
		
			
		//check box example 
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		//Validate if checkbox is selected.
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		
		// Static dropdown example -- any dropdown with select tag is generally static one 
		
			Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
			s.selectByValue("USD");
		
		// TODO Auto-generated method stub

	}

}

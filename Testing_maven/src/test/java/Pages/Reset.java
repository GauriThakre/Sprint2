package Pages;

import org.openqa.selenium.WebElement;

import Locators.Locators1;

public class Reset {

	
		public static void Employeelist() {
			WebElement emplist = Locators1.EmployeeLists();
			emplist.click();

	}
		public static void reset() {
			WebElement Rset= Locators1.resetbtn();
			Rset.click();
		}
		

}

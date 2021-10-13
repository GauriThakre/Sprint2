package Pages;
import org.openqa.selenium.WebElement;
import Locators.Locators1;

public class InvalidEmplist {
	public static void Employeelist() {
		WebElement emplist = Locators1.EmployeeLists();
		emplist.click();
	}
	public static void Employeename(String name) {
		WebElement empname = Locators1.Employeename();
		
		empname.sendKeys(name);
	}
	public static void EmployeeId(String name) {
		WebElement empid = Locators1.EmployeeId();


		empid.sendKeys(name);
		
}
	public static void SupervisourName(String name) {
		WebElement empn= Locators1.SuperviousrName();


		empn.sendKeys(name);
	}
	public static void searchbtn() {
		WebElement sbutton = Locators1.searchbtn();
		sbutton.click();}
	

}

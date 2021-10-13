package Locators;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Browser.Browse;

public class Locators1 extends Browse {

public static Object employeel;
public static WebElement username() {
	
	WebElement uname =  driver.findElement(By.name("txtUsername"));
	return uname;
}
public static WebElement password() {
	
	WebElement passw =  driver.findElement(By.name("txtPassword"));
	return passw;
}
public static WebElement loginbtn() {
	
	WebElement loginbtn =  driver.findElement(By.id("btnLogin"));
	return loginbtn;
}
public static String geturl() {
	
	String url =  driver.getCurrentUrl();
	return url;
}
public static WebElement pim() {
	WebElement pim = driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/b"));
    return pim;
}
public static WebElement EmployeeLists() {
	WebElement employeel =  driver.findElement(By.id("menu_pim_viewEmployeeList"));
	return employeel;
}
public static WebElement Employeename() {
	WebElement uname =  driver.findElement(By.name("empsearch[employee_name][empName]"));
	return uname;
}
public static WebElement EmployeeId() {
	WebElement uname =  driver.findElement(By.name("empsearch[id]"));
	return uname;
}
public static WebElement SuperviousrName() {
	WebElement uname =  driver.findElement(By.name("empsearch[supervisor_name]"));
	return uname;
}



public static WebElement searchbtn() {
	WebElement  search  = driver.findElement(By.id("searchBtn"));
	return search;
}
public static WebElement resetbtn() {
	WebElement reset   = driver.findElement(By.id("resetBtn"));
	return reset;
}
public static WebElement addbtn() {
	WebElement add   = driver.findElement(By.id("btnAdd"));
	return add;
}
public static WebElement deletebtn() {
	WebElement delete    = driver.findElement(By.id("btnDelete"));
	return delete;
}
public static WebElement selectbtn() {
	WebElement select    = driver.findElement(By.id("ohrmList_chkSelectAll"));
	return select;}

public static WebElement okbtn() {
	WebElement ok   = driver.findElement(By.id("dialogDeleteBtn"));
	return ok;}


}
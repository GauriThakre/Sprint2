package Stepdefination;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import Pages.EmplistPage;
import Pages.InvalidEmplist;
import Browser.Browse;
import Excel.ReadData;
import Pages.DashboardPage;
import Pages.Loginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchEmployee extends Browse {
	@Given("i am already logged into OrangeHrm and navigates to employee list tab")
	public void i_am_already_logged_into_orange_hrm_and_navigates_to_employee_list_tab() throws IOException {
	   
		String url =ReadData.config("url");
		Loginpage.lopage(url,ReadData.readExcel(0, 1),ReadData.readExcel(1, 1));
		DashboardPage.pimTab();
		System.out.println("step 1 passed");
		
		
	   
	}

	@When("I enter the  valid employee information in employee name , employee id ,and other details")
	public void i_enter_the_valid_employee_information_in_employee_name_employee_id_and_other_details() {
	EmplistPage.Employeelist();
	EmplistPage.Employeename("odis Aldawis ");
	EmplistPage.EmployeeId("0002");
	EmplistPage.SupervisourName("john smith");
	EmplistPage.searchbtn();
	}

	@Then("search must be successful.")
	public void search_must_be_successful() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("I enter the invalid employee information in employee name, employee id and other details")
	public void i_enter_the_invalid_employee_information_in_employee_name_employee_id_and_other_details() {
		InvalidEmplist.Employeelist();
		InvalidEmplist.Employeename("5876");
		InvalidEmplist.EmployeeId("@@@@");
		InvalidEmplist.SupervisourName("65r67");
		InvalidEmplist.searchbtn();

	}

	@Then("no records will found")
	public void no_records_will_found() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

}

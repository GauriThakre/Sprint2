package Stepdefination;

import Excel.ReadData;
import Pages.DashboardPage;
import Pages.Deletepage;
import Pages.EmplistPage;
import Pages.Loginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteEmployee {
	@Given("I am already logged into OrangeHrm and navigates to employee list tab")
	public void i_am_already_logged_into_orange_hrm_and_navigates_to_employee_list_tab() {
		String url =ReadData.config("url");
		Loginpage.lpage(url);
		DashboardPage.pimTab();
		EmplistPage.Employeelist();
		System.out.println("step 2 passed");
	}

	@When("i select the the employee name from employee list")
	public void i_select_the_the_employee_name_from_employee_list() {

Deletepage.selectall();

	}

	@When("click the delete button")
	public void click_the_delete_button() {

Deletepage.delete();
Deletepage.okay();

	}

	@Then("the employee information must be delete")
	public void the_employee_information_must_be_delete() {
	   
		
		// Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

}

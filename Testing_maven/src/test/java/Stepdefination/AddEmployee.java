package Stepdefination;

import Excel.ReadData;
import Pages.Addpage;
import Pages.DashboardPage;
import Pages.EmplistPage;
import Pages.Loginpage;

import org.openqa.selenium.By;

import Browser.Browse;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployee extends Browse{
	@Given("I had already logged in OrangeHrm and navigates to employee list tab")
	public void i_had_already_logged_in_orange_hrm_and_navigates_to_employee_list_tab() {
		String url =ReadData.config("url");
		String loginbtn= ReadData.config("Login_button");
	
		Loginpage.cpage(url);
		driver.findElement(By.id(loginbtn)).click();
		DashboardPage.pimTab();
		EmplistPage.Employeelist();
		System.out.println("step 1 passed");
	}

	@When("i click on add button")
	public void i_click_on_add_button() {
	    Addpage.addbtn();
	}

	@Then("I should be directed to another page")
	public void i_should_be_directed_to_another_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

}

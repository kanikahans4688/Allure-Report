package StepDefinition;

import com.basePage.BaseClass;

import Pages.WordPressLoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;


public class LoginPageTest extends BaseClass {
	

	
	
	@Given("^I want to launch the browser$")
	public void i_want_to_launch_the_browser() throws Throwable {
		BaseClass.intialization();
		
	}

	@Then("^I enter username and password$")
	public void i_enter_username_and_password() throws Throwable {
		WordPressLoginPage loginPage= new WordPressLoginPage ();
		loginPage.enterDetail();
 
	}
	@Then("^I click on Login$")
	public void i_click_on_Login() throws Throwable {
		WordPressLoginPage loginPage= new WordPressLoginPage ();
		loginPage.clickOnSignIn();    
	}
	@Then("^I verify title$")
	public void i_verify_title() throws Throwable {
		WordPressLoginPage loginPage= new WordPressLoginPage ();
	   String actual_title= loginPage.verifyTitle();
	   Assert.assertEquals("Dashboard", actual_title);
	}

	@Then("^I close the title$")
	public void i_close_the_title() throws Throwable {
	    driver.close();
	}



}

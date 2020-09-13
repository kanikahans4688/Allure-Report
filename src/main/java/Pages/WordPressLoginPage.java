package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.basePage.BaseClass;



public class WordPressLoginPage  {

	public WebDriver driver;
	public WordPressLoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="log")
	WebElement username;
	
	@FindBy(name="pwd")
	WebElement password;
	
	@FindBy(name="wp-submit")
	WebElement signIn;
	
	public void enterDetail() {
		username.sendKeys("opensourcecms");
		password.sendKeys("opensourcecms");
	}
	public void clickOnSignIn() {
		signIn.click();
	}
	public String verifyTitle() {
		return driver.getTitle();
	}
}

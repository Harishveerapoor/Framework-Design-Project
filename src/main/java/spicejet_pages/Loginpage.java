package spicejet_pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.PageBase;

public class Loginpage extends PageBase {

	public Loginpage() throws IOException {
		PageFactory.initElements(driver, this);
	}

	
	 
	@FindBy(xpath = "//div[text()='Login']")
	WebElement loginstart;
	
	@FindBy(xpath = "//input[@data-testid='user-mobileno-input-box']")
	WebElement userid;
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement pwd;
	
	@FindBy(xpath = "//div[@data-testid='login-cta']")
	WebElement loginclick;
	
	public void login(String userid2, String pwd2) {
		loginstart.click();
		userid.sendKeys(userid2);
		pwd.sendKeys(pwd2);
		loginclick.click();
	}

	

}


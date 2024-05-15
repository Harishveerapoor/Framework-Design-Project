package tests;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.PageBase;
import spicejet_pages.Loginpage;

public class Tests_Base extends PageBase {

	public Tests_Base() throws IOException {
     
	}
	@BeforeMethod
	public void setup() {
	String browse=pro.getProperty("browse");
	String url=pro.getProperty("url");
		
	PageBase base= PageFactory.initElements(driver, PageBase.class);
	base.initialization(browse,url);
	
	}
	@Test
	public void test1() {

		System.out.println("this is my 1st test one");
	}
	@AfterMethod
	public void teardown() {
		PageBase base= PageFactory.initElements(driver, PageBase.class);
		base.teardown();
	}


}

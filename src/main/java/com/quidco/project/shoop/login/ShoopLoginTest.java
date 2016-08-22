package com.quidco.project.shoop.login;

import org.openqa.selenium.By;

import com.quidco.project.util.WebConnector;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ShoopLoginTest{

	WebConnector connect = new WebConnector();
	
	@Given("^I go to chrome with shoop extension$")
	public void i_go_to_chrome_with_shoop_extension(){
		connect.openBrowser(connect.prop.getProperty("browser"));
	}

	@And("^I click on the Shoop Extension$")
	public void i_click_on_the_Shoop_Extension(){
		connect.navigate("extensionPopupURL");
		connect.driver.switchTo().frame(connect.driver.findElement(By.tagName("iframe")));
	}

	@Then("^I input my ([^\"]*) and ([^\"]*)$")
	public void i_input(String username, String password){
		connect.input("usernameField_xpath", username);
		connect.input("passwordField_xpath", password);
	}

//	@Then("^I enter my \"([^\"]*)\"$")
//	public void i_enter_my_password(String password){
//		connect.input("passwordField_xpath", password);
//	}

	@And("^I click on the SignIn button$")
	public void i_click_on_the_SignIn_button(){
		connect.click("signInField_xpath");
	}

	@When("^Sign Out button appears Sign In is confirmed$")
	public void sign_Out_button_appears_Sign_In_is_confirmed(){
		if(connect.isElementPresent("signOutField_xpath"))
			System.out.println("login successful");
	}
	
	@Then("^Quit the browser$")
	public void quit_the_browser(){
		connect.quit();
	}
	
}

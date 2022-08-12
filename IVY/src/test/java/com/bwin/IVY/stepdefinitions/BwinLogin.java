package com.bwin.IVY.stepdefinitions;

import com.bwin.IVY.BaseClass;
import com.bwin.IVY.page.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BwinLogin extends BaseClass{
	
	HomePage homepage = new HomePage();

	@Given("open bwin home page")
	public void open_bwin_home_page() {
	}

	@When("click on login button")
	public void click_on_login_button() {
		
		
	}

	@Then("login page should open successfully")
	public void login_page_should_open_successfully() {
		// Write code here that turns the phrase above into concrete actions
	}

	@When("enter username {string} password {string}")
	public void enter_username_password(String string, String string2) {
		
		
		homepage.navigateToLoginPage();
		
		
	}

}

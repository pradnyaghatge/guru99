package stepDefination;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class guru99 {

	
	@Given("user is on Register page")
	public void user_is_on_register_page() {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.manage().deleteAllCookies();
		
	   
	}

	@When("user validate Register image")
	public void user_validate_register_image() {
		
		
	   
	}

	@When("user validate home page text")
	public void user_validate_home_page_text() {
	    
	}

	@When("user capture test data from {string} excelsheet and {int}")
	public void user_capture_test_data_from_excelsheet_and(String string, Integer int1) {
	   
	}

	@Then("user enter firstname and lastname")
	public void user_enter_firstname_and_lastname() {
	   
	}

	@Then("user enter phone and email")
	public void user_enter_phone_and_email() {
	   
	}

	@Then("user enter address and city")
	public void user_enter_address_and_city() {
	    
	}

	@Then("user enter postalcode and country")
	public void user_enter_postalcode_and_country() {
	   
	}

	@Then("user enter username and password and confirmpassword")
	public void user_enter_username_and_password_and_confirmpassword() {
	    
	}

	@Then("user click on submit")
	public void user_click_on_submit() {
	    
	}



}

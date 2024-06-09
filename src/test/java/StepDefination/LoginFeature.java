package StepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFeature {
	static WebDriver driver;
	@Given("Opening the browser")
	public void opening_the_browser() {
	    driver=new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	    
	    
	   }

	@And("user is on login page")
	public void user_is_on_login_page() {
	    driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_student_and_password129(String username,String password) {
		driver.findElement(By.id("username")).sendKeys(username);
		   driver.findElement(By.id("password")).sendKeys(password);
	}
	
	@And("click on log in button")
	public void click_on_log_in_button() {
	    
	}

	@Then("user navigate to home page")
	public void user_navigate_to_home_page() {
	   driver.findElement(By.id("submit")).click();
	}

	@And("Close the browser")
	public void close_the_browser() {
	   boolean display = driver.findElement(By.xpath("//a[.='Log out']")).isDisplayed();
	   if(display==true) {
		   System.out.println("Login Successfull");
	   }
	}

}

package STEP_DEFINATION;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStep {
	WebDriver driver;
	@Given("Login page must be exist")
	public void login_page_must_be_exist() {
	   WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.actitime.com/login.do");
	}

	@When("Fill the valid Credentials")
	public void fill_the_valid_credentials() {
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager");
		
	}

	@When("Click on login")
	public void click_on_login() {
	    driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}

	@Then("Home page must display")
	public void home_page_must_display() {
	    Reporter.log("Home page must be display");
	}
	@When("Fill the invalid credential")
	public void fill_the_invalid_credential() {
		driver.findElement(By.id("username")).sendKeys("admin1",Keys.TAB,"manager1");
	}

	@Then("Home page must not be display")
	public void home_page_must_not_be_display() {
	  System.out.println("Home page must not display");
	}
}

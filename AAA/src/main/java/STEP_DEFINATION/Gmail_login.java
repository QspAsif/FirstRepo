package STEP_DEFINATION;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Gmail_login {
	WebDriver driver;
	@Given("Gmail page must be exist")
	public void gmail_page_must_be_exist() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://accounts.google.com/v3/signin/identifier?authuser=0&continue=https%3A%2F%2Fmail.google.com&dsh=S-384960609%3A1692091690079931&ec=GAlAFw&flowEntry=AddSession&flowName=GlifWebSignIn&hl=en&service=mail");
	}

	@When("Enter the valid Credentials")
	public void enter_the_valid_credentials() throws Exception {
	    
		
		driver.findElement(By.name("identifier")).sendKeys("Sel.Demo666@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(3000);	
	    driver.findElement(By.name("Passwd")).sendKeys("123456789@sel");
	}

	@When("Click on Gmail login")
	public void click_on_gmail_login() {
		driver.findElement(By.xpath("//span[text()='Next']")).click();
	}

	@Then("Gmail Home page must display")
	public void gmail_home_page_must_display() {
	Reporter.log("Gmail home page must be display");
	}



}

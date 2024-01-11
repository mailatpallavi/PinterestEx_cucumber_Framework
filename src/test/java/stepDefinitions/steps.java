package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {
	WebDriver driver;

	@Given("User Launch Browser")
	public void user_launch_browser() {
		System.out.println("it is inside steps class");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// System.out.println("step - open chrome");
	}

	@And("opens URL {string}")
	public void opens_url(String string) {
		driver.get("https://www.pinterest.com/");

		// System.out.println("step - enter url");
	}

	@When("User click on Login")
	public void user_click_on_Login() {

		driver.findElement(By.xpath("//div[@class='tBJ dyH iFc sAJ xnr tg7 H2s']")).click();

	}

	@And("User enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String username, String password) {
		// System.out.println("enter username, password");

		// driver.findElement(By.xpath("//input[@id='email']"));
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);

	}

	@And("click on Login button")
	public void click_on_login_button() {
		// System.out.println("click inside login");
		driver.findElement(By.xpath("//button[@type='submit']//div[@class='zI7 iyn Hsu'][normalize-space()='Log in']"))
				.click();
	}

	@Then("User navigates to Home Page")
	public void user_navigates_to_home_page() {
		System.out.println("step - goes to home page");

		driver.close();
	}

}

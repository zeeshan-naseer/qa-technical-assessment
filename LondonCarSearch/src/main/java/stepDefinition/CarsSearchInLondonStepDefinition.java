package stepDefinition;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class CarsSearchInLondonStepDefinition {
	
	WebDriver driver;
	
	@Given("^I open Google search page$")
	public void I_open_google_search_page() {
		System.setProperty("webdriver.chrome.driver", "/Users/papa/Documents/Development/chromedriver");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.uk");
	}
	
	@When("^I perform a search for cars in London$")
	public void I_perform_a_search_for_cars_in_London() {
		driver.findElement(By.name("q")).sendKeys("Cars in London" + Keys.ENTER);
	}
	
	@Then("^I see GumTree results on Google page$")
	public void I_see_GumTree_results_on_Google_page() {
	    String title = driver.findElement(By.xpath("/html/body/div[8]/div[3]/div[9]/div[1]/div[2]/div/div[2]/div[2]/div/div/div[1]/div/div[3]/div/div/div[1]/a/h3")).getText();
		assertTrue(title.contains("Used Cars for Sale in London | Great Local Deals | Gumtree"));
	}
	
	@When("^I click on a GumTree page link$")
	public void I_click_on_a_GumTree_page_link() {
		 driver.findElement(By.xpath("/html/body/div[8]/div[3]/div[9]/div[1]/div[2]/div/div[2]/div[2]/div/div/div[1]/div/div[3]/div/div/div[1]/a/h3")).click();  
	}

	@Then("^the page link will be correctly displayed$")
	public void the_page_link_will_be_correctly_displayed() {
		String ExpectedTitle=".16,550 ads: Used Cars for Sale in London";
		String ActualTitle= driver.findElement(By.xpath("/html/body/div[3]/div/div[4]/section/main/div[1]/div/div/header/div[2]/h1")).getText();
		assertEquals(ExpectedTitle, ActualTitle );	
		
	}
	
}

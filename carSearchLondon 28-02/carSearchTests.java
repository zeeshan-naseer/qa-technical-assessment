package carSearchLondon;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class carSearchTests {
	static WebDriver driver;
	
	@BeforeClass
	public static void launchDriver() {
		System.setProperty("webdriver.chrome.driver", "/Users/Zeeshan.Naseer/Documents/Development/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.uk");
		driver.findElement(By.name("q")).sendKeys("Cars in London" + Keys.ENTER);
	}
	
	@Test
	public void givenIPerformASearchForCarsInLondon_thenISeeGumTreeResultsOnGooglePage () {
		String title = driver.findElement(By.xpath("/html/body/div[8]/div[3]/div[9]/div[1]/div[2]/div/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div/div[1]/a/h3")).getText();
		assertTrue(title.contains("Used Cars for Sale in London | Great Local Deals | Gumtree"));
	}
	
	@Test
	public void givenIClickOnAGumTreePageLink_thenThePageTitleWillBeCorrectlyDisplayedOnGumTreeSite() {
		String Expectedtitle = driver.findElement(By.xpath("/html/body/div[8]/div[3]/div[9]/div[1]/div[2]/div/div[2]/div[2]/div/div/div[1]/div/div[2]/div/div/div[1]/a/h3")).getText();
		String ActualTitle= driver.findElement(By.cssSelector("#srpResultsHeader > div.srp-resultsheader.clearfix > h1")).getText();
		assertEquals(Expectedtitle, ActualTitle );			
	}
	
	@AfterClass
	public static void tearDown() {
		driver.quit();	
	}
}
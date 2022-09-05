package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.WhiteBackground;
import util.BrowserFactory;

public class WhiteSteps {
	WebDriver driver;
	WhiteBackground whiteBackground;
	
	@Before
	public void beforeRun() {
		driver = BrowserFactory.startBrowser();
		whiteBackground = PageFactory.initElements(driver, WhiteBackground.class);
	}
	
	@When("^user clicks white background button$")
	public void user_clicks_white_background_button() {
		whiteBackground.clickWhiteButton();
	    
	}

	@Then("^the background should turn white$")
	public void the_background_should_turn_white() {
		String expectedColor = "#ffffff";
		String color = driver.findElement(By.xpath("//body[@style='background-color: white;']")).getCssValue("background-color");
		String actualHex = Color.fromString(color).asHex();
		Assert.assertEquals("Background color did not match", expectedColor, actualHex);
	   
	}
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}

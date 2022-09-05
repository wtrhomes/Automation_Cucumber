package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.SkyblueBackground;
import util.BrowserFactory;

public class SkyblueSteps {
	WebDriver driver;
	SkyblueBackground skyblueBackground;
	
	@Before
	public void beforeRun() {
		driver = BrowserFactory.startBrowser();
		skyblueBackground = PageFactory.initElements(driver, SkyblueBackground.class);
	}

	@Given("^user is on the \"([^\"]*)\" page$")
	public void user_is_on_the_page(String arg1) {
		//driver.get("http://techfios.com/test/101/");
	   
	}

	@When("^user clicks skyblue background button$")
	public void user_clicks_skyblue_background_button() {
		skyblueBackground.clickSkyBlueButton();
	    
	}

	@Then("^the background should turn skyblue$")
	public void the_background_should_turn_skyblue() {
		String expectedColor = "#87ceeb";
		String color = driver.findElement(By.xpath("//body[@style='background-color: skyblue;']")).getCssValue("background-color");
		String actualHex = Color.fromString(color).asHex();
		Assert.assertEquals("Background color did not match", expectedColor, actualHex);
	   
	}
	
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}

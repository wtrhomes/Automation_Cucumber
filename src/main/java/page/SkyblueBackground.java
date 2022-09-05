package page;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SkyblueBackground {

	WebDriver driver;

	public SkyblueBackground(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set SkyBlue Background')]")
	WebElement SkyBlueButton;
	@FindBy(how = How.XPATH, using = "//body[@style\'background-colour: skyblue;\"]")
	WebElement SkyBlueElement;

	// Interactive Methods

	public void clickSkyBlueButton() {
		SkyBlueButton.click();
	}

}

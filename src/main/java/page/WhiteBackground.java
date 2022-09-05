package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WhiteBackground {

	WebDriver driver;

	public WhiteBackground(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set White Background')]")
	WebElement WhiteButton;
	@FindBy(how = How.XPATH, using = "//body[@style\'background-colour: white;\']")
	WebElement WhiteElement;

	// Interactive Methods

	public void clickWhiteButton() {
		WhiteButton.click();
	}
}

package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;		

public class DesktopsPage extends Base {
	
	public DesktopsPage(){
		
		PageFactory.initElements(driver, this);
		

		@FindBy(xpath="//input=[@id='email']") 
		WebElement emailField;
		@FindBy(id="input-password")
		private WebElement passwordField;
	}

}

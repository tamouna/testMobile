package com.commonPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConnectYourAccount extends AllowPage {
	
	public ConnectYourAccount(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//android.widget.EditText[@content-desc=\"Email\"]")
	WebElement entreYourEmail;
	
	@FindBy(xpath="//android.widget.Button[@content-desc=\"Next\"]")
	WebElement clickContinue;
	
	public void entreTheEmail(String eMAIL){
		
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		entreYourEmail.sendKeys(eMAIL);
	}
	
	public void clickOnContinue(){
		
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		clickContinue.click();
	}
}

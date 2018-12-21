package com.commonPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.common.BasePage;

public class CompleteYourProfilePage extends BasePage {

	public CompleteYourProfilePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//android.widget.EditText[@content-desc=\"First name\"]")
	WebElement firstName;
	
	@FindBy(xpath="//android.widget.EditText[@content-desc=\"Last name\"]")
	WebElement lastName;
	
	@FindBy(xpath="(//android.widget.EditText[@content-desc=\"Phone\"])[1]")
	WebElement phone;
	
	@FindBy(xpath="(//android.widget.EditText[@content-desc=\"Phone\"])[2]")
	WebElement nationality;
	
	@FindBy(xpath="//android.widget.Button[@content-desc=\"Continue\"]")
	WebElement clickContinue;
	
	public void entreTheFirstName(String fIRSTnAME){
		
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        firstName.sendKeys(fIRSTnAME);
	}
	
	public void entreTheLastName(String lASTnAME){
		
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        lastName.sendKeys(lASTnAME);
	}

	public void entreThePhone(String pHONE){
	
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    phone.sendKeys(pHONE);
	}

	public void entreTheNationality(String nATIONALITY){
	
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    nationality.sendKeys(nATIONALITY);
	}
	
	public void clickOnContinue(){
		
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		clickContinue.click();
	}

}

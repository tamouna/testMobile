package com.commonPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchRoomsPage extends AllowPage {

	public SearchRoomsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//android.widget.Button[@content-desc=\"Connect my account\"]")
	WebElement connectMyAccount;
	
	public void clickConnectMyAccount(){
		
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		connectMyAccount.click();
	}
	

}

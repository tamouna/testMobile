package com.commonPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.common.BasePage;

public class AllowPage extends BasePage {

	public AllowPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//android.widget.Button[@content-desc=\"Next\"]")
	WebElement allow;
	
	public void clickAllowPage(){
		
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		allow.click();
	}

}

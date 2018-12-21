package com.commonPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.common.BasePage;

public class YourPasswordPage extends BasePage {

	public YourPasswordPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//android.widget.EditText[@content-desc=\"Password\"]")
	WebElement password;
	
	@FindBy(xpath="//android.widget.Button[@content-desc=\"Next\"]")
	WebElement clickConnectMyAccount;
	
	public void entreThePassword(String pASSWORD){
		
	    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	    password.sendKeys(pASSWORD);
	}
	
	public void clickOnConnectMyAccount(){
		
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        clickConnectMyAccount.click();
        
        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(YourPasswordPage.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")).click();
	}

}

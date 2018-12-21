package com.testAppium.testMobileAppium;

import java.net.MalformedURLException;
import java.net.URL;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import junit.framework.TestCase;

public class MobileTest extends TestCase{

    public Actionwords actionwords;
    WebDriver  driver;
    
	@BeforeClass
	public void setUp() throws MalformedURLException{
		
		DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "7.1.1");
        capabilities.setCapability("deviceName", "Galaxy A8");
        capabilities.setCapability("automationName", "UIAutomator2");
        capabilities.setCapability("appActivity", ".activity.RootActivity");
        capabilities.setCapability("appPackage", "com.lunabee.bbhotel");
        //cette ligne permet d'accepter le pop localisation 
        capabilities.setCapability("autoGrantPermissions", true);

        driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        
		actionwords = new Actionwords(driver);

	}	
	
    public void createAnAccount(String email, String firstName, String lastName, String phone, String nationality, String password) {
    	actionwords.clickHello();
    	actionwords.clickAllow();
    	actionwords.searchRooms();
        actionwords.connectYourAccount(email);
        actionwords.competeYourProfile(firstName, lastName, phone, nationality);
        actionwords.yourPassword(password);
        actionwords.clickOK();
    }

    @Test 
    public void testCreateAnAccountUide439956e88424c6f9258a3c15a71ca1d() throws MalformedURLException {
    	
    	System.out.println("test1");
        createAnAccount("tini@yopmail.com", "Toto", "TOTO", "+33789521463", "France", "TotoToto1&");
    	//System.out.println(" My first test");
    }
    
    @After
	public void afterClass() {
    	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	try {
			Thread.sleep(60000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	driver.close();
	}
    
}
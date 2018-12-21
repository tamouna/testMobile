package com.testAppium.testMobileAppium;


import org.openqa.selenium.WebDriver;
import com.commonPage.AllowPage;
import com.commonPage.CompleteYourProfilePage;
import com.commonPage.CongratulationsPage;
import com.commonPage.ConnectYourAccount;
import com.commonPage.SearchRoomsPage;
import com.commonPage.WelcomeToBandB;
import com.commonPage.YourPasswordPage;

public class Actionwords {
	
	WebDriver  driver;

	public Actionwords(WebDriver  driver2) {
		this.driver = driver2;
	}
    
	public void clickHello() {
		
        // TODO: Implement action: "Click on CONNECT MY ACCOUNT"
		WelcomeToBandB welcomToBandB = new WelcomeToBandB(driver);
		welcomToBandB.clickHello();
		
    }
		
	public void clickAllow() {
		
        // TODO: Implement action: "Click on CONNECT MY ACCOUNT"
		AllowPage allow = new AllowPage(driver);
		allow.clickAllowPage();
		
    }
	
    public void searchRooms() {
        // TODO: Implement action: "Click on CONNECT MY ACCOUNT"
    	SearchRoomsPage searchRooms = new SearchRoomsPage(driver);
    	searchRooms.clickConnectMyAccount();
    }

    public void connectYourAccount(String email) {
        // TODO: Implement action: "Enter you email : 
        // - Email = $(Email)"
        // TODO: Implement action: "Click on CONTINUE"
    	ConnectYourAccount connectYourAccount = new ConnectYourAccount(driver);
    	connectYourAccount.entreTheEmail(email);
    	connectYourAccount.clickOnContinue();
    }

    public void competeYourProfile(String firstName, String lastName, String phone, String nationality) {
        // TODO: Implement action: "Fill in the form : 
        // - First Name = $(First Name)
        // - Last Name = $(Last Name)
        // - Phone = $(Phone)
        // - Nationality = $(Nationality)"
        // TODO: Implement action: "Click on continue"
    	
    	CompleteYourProfilePage completeYourProfile = new CompleteYourProfilePage(driver);
    	completeYourProfile.entreTheFirstName(firstName);
    	completeYourProfile.entreTheLastName(lastName);
    	completeYourProfile.entreThePhone(phone);
    	completeYourProfile.entreTheNationality(nationality);
    	completeYourProfile.clickOnContinue();
    }

    public void yourPassword(String password) {
        // TODO: Implement action: "Define your password : 
        // -Password = $(Password)"
        // TODO: Implement action: "Click on CONNECT MY ACCOUNT"
    	YourPasswordPage yourPassword = new YourPasswordPage(driver);
    	yourPassword.entreThePassword(password);
    	yourPassword.clickOnConnectMyAccount();
    }
    
    public void clickOK(){
    	
    	CongratulationsPage congratulation = new CongratulationsPage(driver);
    	congratulation.clickOnOk();
    	
    }
}
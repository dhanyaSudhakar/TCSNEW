package com.tcsinternship.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile {
	WebDriver driver;
	
	@FindBy(name="address1")
	private WebElement address1;
	
	@FindBy(name="address2")
	private WebElement address2;
	
	@FindBy(xpath="//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[3]/button")
	private WebElement updateProfile;
	
	@FindBy(xpath="//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div[1]/div")
	private WebElement scsmsgUpdateprofile;
	
	
	
	public Profile(WebDriver driver){
	    this.driver = driver;
	    //This initElements method will create all WebElements
	    PageFactory.initElements(driver, this);
	}

	//Click on Address 
		public void clickaddress1(String Straddressone) throws InterruptedException{
			Thread.sleep(2000);
			address1.clear();
			address1.sendKeys(Straddressone);
			Thread.sleep(2000);
		} 
	
		//Click on Address 2
		public void clickaddress2(String Straddresstwo) throws InterruptedException{
			Thread.sleep(2000);
			address2.clear();
			address2.sendKeys(Straddresstwo);
			Thread.sleep(2000);
		} 
	
	
	//Click on Update Profile
	public void clickUpdateProfile() throws InterruptedException{
		Thread.sleep(2000);
		updateProfile.click();
		Thread.sleep(2000);
	} 
	
	
	public String getscsmsgUpdateprofile(){
	  	return scsmsgUpdateprofile.getText();   
	  }
	
	

}

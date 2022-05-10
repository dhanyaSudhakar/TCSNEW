package com.tcsinternship.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver driver;
	@FindBy(name="email")
	private WebElement username;

	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[3]/button")
	private WebElement login;
	
	@FindBy(xpath="//*[@id=\"fadein\"]/div/div/div[3]/ul/li[5]/a")
	private WebElement logout;
	
public Login(WebDriver driver){
    this.driver = driver;
    //This initElements method will create all WebElements
    PageFactory.initElements(driver, this);
}


//Click on Email
public void setEmail(String StrUsername) throws InterruptedException{
	Thread.sleep(2000);
	username.clear();
	username.sendKeys(StrUsername);
	Thread.sleep(2000);
} 

//assertion - to get the text from email textbox
public String matchEmail(){
	String GetUsername = username.getAttribute("value");
	return GetUsername;
}


//Inputting data on Password
public void clickPassword(String StrPassword) throws InterruptedException{
	Thread.sleep(2000);
	password.clear();
	password.sendKeys(StrPassword);
	Thread.sleep(2000);
} 

//assertion - to get the text from password textbox
public String matchPassword(){
	String GetPassword = password.getAttribute("value");
	return GetPassword;
}

//Click on SignIn Button
public void clicklogin() throws InterruptedException{
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
	login.click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
} 


//Click on SignIn Button
public void clicklogout() throws InterruptedException{
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
	logout.click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
} 

}
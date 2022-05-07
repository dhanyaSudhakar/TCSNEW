package com.tcsinternship.pages;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_supplier_admin {
	
	WebDriver driver;
	@FindBy(name="email")
	private WebElement username;

	@FindBy(xpath="//*[@id=\"layoutAuthentication_content\"]/main/div/div/div/div[1]/div/form/div[2]/label/input")
	private WebElement password;
	
	@FindBy(xpath="//*[@id=\"layoutAuthentication_content\"]/main/div/div/div/div[1]/div/form/div[4]/button")
	private WebElement login;
	
	@FindBy(xpath="//body/nav[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
	private WebElement bookingLink;
	
	@FindBy(xpath="//a[contains(text(),'Website')]")
	private WebElement websiteLink;
	
	
	
	
	@FindBy(xpath="//*[@id=\"fadein\"]/div/div/div[3]/ul/li[5]/a")
	private WebElement logout;
	
	
	

public Login_supplier_admin(WebDriver driver){
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


//Inputting data on Email
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
public void clickbookingLink() throws InterruptedException{
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
	bookingLink.click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
} 



//Click on SignIn Button
public void clickwebsiteLink() throws InterruptedException{
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
	websiteLink.click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
} 


//Click on SignIn Button
public void clicklogout() throws InterruptedException{
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
	logout.click();
	driver.manage().timeouts().implicitlyWait(3, TimeUnit.MINUTES);
} 

	
}

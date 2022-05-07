package com.tcsinternship.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Agent {
	
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"fadein\"]/header/div[2]/div/div/div/div/div[2]/nav/ul/li[1]/a")
	private WebElement Home;
	
	@FindBy(xpath="//*[@id=\"fadein\"]/header/div[2]/div/div/div/div/div[2]/nav/ul/li[2]/a")
	private WebElement Hotel;
	
	@FindBy(xpath="//*[@id=\"fadein\"]/header/div[2]/div/div/div/div/div[2]/nav/ul/li[3]/a")
	private WebElement Flight;
	
	@FindBy(xpath="//*[@id=\"fadein\"]/header/div[2]/div/div/div/div/div[2]/nav/ul/li[4]/a")
	private WebElement Tour;
	
	@FindBy(xpath="//*[@id=\"fadein\"]/header/div[2]/div/div/div/div/div[2]/nav/ul/li[5]/a")
	private WebElement Visa;
	
	@FindBy(xpath="//*[@id=\"fadein\"]/header/div[2]/div/div/div/div/div[2]/nav/ul/li[6]/a")
	private WebElement Blog;
	
	@FindBy(xpath="//*[@id=\"fadein\"]/header/div[2]/div/div/div/div/div[2]/nav/ul/li[7]/a")
	private WebElement Offers;
	
	
	               
	@FindBy(xpath="/html/body/section[1]/section/div/div/form/div/div/div[1]/div/div/div/span/span[1]/span")
	private WebElement City;
	
	@FindBy(xpath="/html/body/span/span/span[2]/ul/li[1]")
	private WebElement Cityoption;
	
	@FindBy(xpath="/html/body/span/span/span[1]/input")
	private WebElement CityInput;
	
	@FindBy(id="submit")
	private WebElement submit;
	
	@FindBy(xpath="/html/body/header/div[1]/div/div/div[2]/div/div/div[2]/div/button")
	private WebElement currency;
	
	@FindBy(xpath="/html/body/header/div[1]/div/div/div[2]/div/div/div[2]/div/ul/li[7]/a")
	private WebElement currencyINROption;
	
	
	@FindBy(xpath="/html/body/header/div[1]/div/div/div[2]/div/div/div[3]/div/button")
	private WebElement account;
	
	@FindBy(xpath="/html/body/header/div[1]/div/div/div[2]/div/div/div[3]/div/ul/li[5]/a")
	private WebElement Logout;
	
	
	
	

	public Agent(WebDriver driver){
	    this.driver = driver;
	    //This initElements method will create all WebElements
	    PageFactory.initElements(driver, this);
	}


	//Click on Home
	public void setHome() throws InterruptedException{
		Thread.sleep(2000);
		Home.click();
		Thread.sleep(2000);
	} 
	
	
	//Click on Hotel
		public void setHotel() throws InterruptedException{
			Thread.sleep(2000);
			Hotel.click();
			Thread.sleep(2000);
		} 
		
		//Click on Flight
		public void setFlight() throws InterruptedException{
			Thread.sleep(2000);
			Flight.click();
			Thread.sleep(2000);
		} 
		
	
		//Click on Tour
		public void setTour() throws InterruptedException{
			Thread.sleep(2000);
			Tour.click();
			Thread.sleep(2000);
		} 
		
		
		//Click on Visa
		public void setVisa() throws InterruptedException{
			Thread.sleep(2000);
			Visa.click();
			Thread.sleep(2000);
		} 
		
		
		//Click on Blog
		public void setBlog() throws InterruptedException{
			Thread.sleep(2000);
			Blog.click();
			Thread.sleep(2000);
		} 
		
		//Click on Offers
				public void setOffers() throws InterruptedException{
					Thread.sleep(2000);
					Offers.click();
					Thread.sleep(2000);
				} 
				
			//click search - city
				public void setCity() throws InterruptedException{
					Thread.sleep(2000);
					City.click();
					Thread.sleep(2000);
					CityInput.sendKeys("Singapore");
					Thread.sleep(8000);
					Cityoption.click();
					Thread.sleep(2000);
					submit.click();
					Thread.sleep(2000);
				} 
				
				
				//click search - city
				public void setcurrency() throws InterruptedException{
					Thread.sleep(2000);
					currency.click();
					Thread.sleep(2000);
					currencyINROption.click();
					Thread.sleep(2000);
					
				} 
				
				
				//click search - city
				public void Logout() throws InterruptedException{
					Thread.sleep(2000);
					account.click();
					Thread.sleep(2000);
					Logout.click();
					Thread.sleep(2000);
					
				} 
				
				
		
}

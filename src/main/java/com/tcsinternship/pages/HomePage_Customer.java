package com.tcsinternship.pages;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_Customer {
	
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[2]/a")
	private WebElement myBookings;
	
	@FindBy(xpath="//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[3]/a")
	private WebElement AddFunds;
	
	@FindBy(id="gateway_paypal")
	private WebElement paypalRadio;
	
	
	@FindBy(xpath="/html/body/section[1]/div/div[2]/div/div[1]/div/div/div[2]/form/div/div[2]/div/button")
	private WebElement payNow;
	
	
	@FindBy(xpath="/html/body/div/div[1]/div[1]")
	private WebElement paypalNewWindow;
	
	
//	@FindBy(xpath="/html/body/div/div")
//	private WebElement payPalButton;
	
	
	@FindBy(xpath="/html[1]/body[1]")
	private WebElement payPalButton;
	
	@FindBy(xpath="//*[@id=\"createAccount\"]")
	private WebElement payCard;
	
	@FindBy(id="country")
	private WebElement country;
	
	
	@FindBy(xpath="//*[@id=\"country\"]/option[162]")
	private WebElement countryOption;
	
	
	
	@FindBy(id="cardNumber")
	private WebElement cardNumber;
	
	@FindBy(xpath="//input[@id='cardExpiry']")
	private WebElement cardExpiry;
	
	
	@FindBy(xpath="//input[@id='cardCvv']")
	private WebElement cardCvv;
	
	
	@FindBy(xpath="//label[contains(text(),'USD')]")
	private WebElement USD;
	
	
	@FindBy(xpath="//input[@id='firstName']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@id='lastName']")
	private WebElement lastName;
	
	@FindBy(xpath="//input[@id='billingLine1']")
	private WebElement billingLine1;
	
	@FindBy(xpath="//input[@id='billingLine2']")
	private WebElement billingLine2;
	
	@FindBy(xpath="//input[@id='billingCity']")
	private WebElement billingCity;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/form[1]/fieldset[1]/div[5]/input[1]")
	private WebElement state;
	
	
	@FindBy(xpath="//input[@id='billingPostalCode']")
	private WebElement postalcode;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/form[1]/section[3]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/input[1]")
	private WebElement phoneNumber;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/form[1]/section[3]/div[1]/section[1]/div[2]/div[1]/div[1]/div[1]/input[1]")
	private WebElement gmail;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/form[1]/section[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement paypassword;
	
	@FindBy(xpath="//input[@id='dateOfBirth']")
	private WebElement DoB;
	
	@FindBy(xpath="//body/div[@id='root']/div[1]/div[1]/main[1]/div[1]/form[1]/section[3]/div[1]/div[4]/div[1]/div[1]/label[1]")
	private WebElement check;
	
	@FindBy(xpath="//body/div[1]/div[1]/div[3]/ul[1]/li[4]/a[1]")
	private WebElement MyProfilecust;
	
	
	@FindBy(xpath="//button[contains(text(),'Pay in USD')]")
	private WebElement payUSDButton;
	
	
	
	@FindBy(xpath="//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[4]/a")
	private WebElement MyProfile;
	
	
	@FindBy(xpath="//*[@id=\"fadein\"]/div[1]/div/div[3]/ul/li[5]/a")
	private WebElement Logout;
	
	
	
	
	
	
	@FindBy(xpath="//*[@id=\"fadein\"]/header/div[2]/div/div/div/div/div[2]/nav/ul/li[3]/a")
	private WebElement  Flight;
	
	@FindBy(xpath="//input[@id='autocomplete']")
	private WebElement  Flyfrom;
	
	@FindBy(xpath="//body/section[1]/section[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	private WebElement  Flyfromsingapore;
	
	@FindBy(xpath="//input[@id='autocomplete2']")
	private WebElement  Flyto;
	
	@FindBy(xpath="//body/section[1]/section[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]")
	private WebElement  FlytoTokyo;
	
	@FindBy(xpath="//button[@id='flights-search']")
	private WebElement  FlightSearch;
	
	@FindBy(xpath="//body/main[1]/div[1]/div[2]/section[1]/ul[1]/li[1]/div[1]/form[1]/div[1]/div[2]/div[1]/button[1]")
	private WebElement  USDPayment;
	
	@FindBy(xpath="//body/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]")
	private WebElement  AdultFirstName;
	
	@FindBy(xpath="//body/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/input[1]")
	private WebElement  AdultLastName;
	
	@FindBy(xpath="//body/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/select[1]")
	private WebElement  AdultNationality;
	
	@FindBy(xpath="//body/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/select[1]/option[104]")
	private WebElement  AdultNationalityopt;
	
	@FindBy(xpath="//body/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/select[1]")
	private WebElement  Adultdob;
	
	
	@FindBy(xpath="//body/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/select[1]/option[2]")
	private WebElement  Adultdobopt;
	
	
	@FindBy(xpath="//body/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/input[1]")
	private WebElement  AdultPassport;
	
	@FindBy(xpath="//body/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/select[1]")
	private WebElement  AdultPassportdate;
	
	@FindBy(xpath="//body/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]/div[1]/select[1]/option[3]")
	private WebElement  AdultPassportdateopt;
	
	@FindBy(xpath="//body/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[3]/div[1]/div[1]/select[1]")
	private WebElement  AdultPassportdateexpry;
	
	@FindBy(xpath="//body/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[3]/div[1]/div[1]/select[1]/option[3]")
	private WebElement  AdultPassportdateexpryopt;
	
	@FindBy(xpath="//input[@id='gateway_paypal']")
	private WebElement  Adultpaypal;
	
	@FindBy(xpath="//body/div[2]/form[1]/section[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/label[1]")
	private WebElement  declartn;
	
	@FindBy(id="booking")
	private WebElement  confBooking;
	
	
	
	@FindBy(xpath="//*[@id=\"fadein\"]/section[1]/div/div[2]/div/div[1]/div/div/div[2]/div/table/tbody/tr/td[4]/div/a")
	private WebElement  viewVoucher;
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public HomePage_Customer(WebDriver driver){
	    this.driver = driver;
	    //This initElements method will create all WebElements
	    PageFactory.initElements(driver, this);
	}


	//Click on Email
	public void setMyBookings() throws InterruptedException{
		Thread.sleep(2000);
		myBookings.click();
		
		Thread.sleep(2000);
	} 
	//Click on AddFunds
		public void setAddFunds() throws InterruptedException{
			Thread.sleep(2000);
			AddFunds.click();
			Thread.sleep(2000);
			
		} 
		public void payPal() throws InterruptedException{
			paypalRadio.click();
			Thread.sleep(2000);
			payNow.click();
			Thread.sleep(12000);
			System.out.println("paypal");

	}
		
		
		public void getpayPalBUtton() throws InterruptedException{
			payPalButton.click();
			Thread.sleep(9000);
		} 
		
		
		public void getpayPalCardDEtails() throws InterruptedException{
		payCard.click();
		Thread.sleep(2000);
		}
		
		public void carddetailsform() throws InterruptedException{
			country.click();
			Thread.sleep(2000);
			countryOption.click();
			Thread.sleep(4000);
			
			}
		
		
		
		

			//Click on Email
			public void setCardnumber(String StrCardnumber) throws InterruptedException{
				Thread.sleep(2000);
				cardNumber.clear();
				cardNumber.sendKeys(StrCardnumber);
				Thread.sleep(4000);
			} 
			
			//assertion - to get the text from Cardnumber textbox
			public String matchCardnumber(){
				String GetcardNumber = cardNumber.getAttribute("value");
				return GetcardNumber;
			}
			
			
			public void setcardExpiry(String StrcardExpiry) throws InterruptedException{
				Thread.sleep(4000);
				cardExpiry.click();
				Thread.sleep(1000);
				cardExpiry.sendKeys(StrcardExpiry);
				Thread.sleep(2000);
			} 
			
			//assertion - to get the text from cardExpiry textbox
			public String matchcardExpiry(){
				String GetcardExpiry = cardExpiry.getAttribute("value");
				return GetcardExpiry;
			}
			
		
			public void setcardCvv(String StrcardCvv) throws InterruptedException{
				Thread.sleep(2000);
				cardCvv.click();
				Thread.sleep(1000);
				cardCvv.sendKeys(StrcardCvv);
				Thread.sleep(2000);
				
				USD.click();
				Thread.sleep(1000);
			} 
			
			
			
			
			
			//assertion - to get the text from cardcvv textbox
			public String matchcardCvv(){
				String GetcardCvv = cardCvv.getAttribute("value");
				return GetcardCvv;
			}
			
			
			
			public void setfirstName(String StrfirstName) throws InterruptedException{
				Thread.sleep(2000);
				firstName.click();
				Thread.sleep(1000);
				firstName.sendKeys(StrfirstName);
				Thread.sleep(2000);
			} 
			
			
			
			//assertion - to get the text from firstName textbox
			public String matchfirstName(){
				String GetfirstName = firstName.getAttribute("value");
				return GetfirstName;
			}
	
			public void setlastName(String StrlastName) throws InterruptedException{
				Thread.sleep(2000);
				lastName.click();
				Thread.sleep(1000);
				lastName.sendKeys(StrlastName);
				Thread.sleep(2000);
			} 
			
			//assertion - to get the text from lastName textbox
			public String matchlastName(){
				String GetlastName = lastName.getAttribute("value");
				return GetlastName;
			}
			
			
			public void setbillingLine1(String StrbillingLine1) throws InterruptedException{
				Thread.sleep(2000);
				billingLine1.click();
				Thread.sleep(1000);
				billingLine1.sendKeys(StrbillingLine1);
				Thread.sleep(2000);
			} 
			
			//assertion - to get the text from matchladdrrss1 textbox
			public String matchlbillingLine1(){
				String GetbillingLine1 = billingLine1.getAttribute("value");
				return GetbillingLine1;
			}
			
			
			public void setStrbillingLine2(String StrbillingLine2) throws InterruptedException{
				Thread.sleep(2000);
				billingLine2.click();
				Thread.sleep(1000);
				billingLine2.sendKeys(StrbillingLine2);
				Thread.sleep(2000);
			} 
			
			
			//assertion - to get the text from matchladdrrss1 textbox
			public String matchlbillingLine2(){
				String GetbillingLine2 = billingLine2.getAttribute("value");
				return GetbillingLine2;
			}
			
			public void setStrbillingCity(String StrbillingCity) throws InterruptedException{
				Thread.sleep(2000);
				billingCity.click();
				Thread.sleep(1000);
				billingCity.sendKeys(StrbillingCity);
				Thread.sleep(2000);
			} 
			
			
			public String matchlbillingCity(){
				String GetbillingCity = billingCity.getAttribute("value");
				return GetbillingCity;
			}
			
			public void setStrstate(String Strstate) throws InterruptedException{
				Thread.sleep(2000);
				state.click();
				Thread.sleep(1000);
				state.sendKeys(Strstate);
				Thread.sleep(2000);
			} 
			
			
			public String matchstate(){
				String Getstate = state.getAttribute("value");
				return Getstate;
			}
			
			
			
			public void setpostalcode(String Strpostalcode) throws InterruptedException{
				Thread.sleep(2000);
				postalcode.click();
				Thread.sleep(1000);
				postalcode.sendKeys(Strpostalcode);
				Thread.sleep(2000);
			} 
			
			
			public String matchpostalcode(){
				String Getpostalcode = postalcode.getAttribute("value");
				return Getpostalcode;
			}
			
			
			
			public void setphoneNumber(String StrphoneNumber) throws InterruptedException{
				Thread.sleep(2000);
				phoneNumber.click();
				Thread.sleep(1000);
				phoneNumber.sendKeys(StrphoneNumber);
				Thread.sleep(2000);
			} 
			
			
			public String matchphoneNumber(){
				String GetphoneNumber = phoneNumber.getAttribute("value");
				return GetphoneNumber;
			}
			
			
			public void setgmail(String Strgmail) throws InterruptedException{
				Thread.sleep(2000);
				gmail.click();
				Thread.sleep(1000);
				gmail.sendKeys(Strgmail);
				Thread.sleep(2000);
			} 
			
			
			public String matchgmail(){
				String Getgmail = gmail.getAttribute("value");
				return Getgmail;
			}
			
			
			public void setpaypassword(String Strpaypassword) throws InterruptedException{
				Thread.sleep(2000);
				paypassword.click();
				Thread.sleep(1000);
				paypassword.sendKeys(Strpaypassword);
				Thread.sleep(2000);
			} 
			
			
			public String matchpaypassword(){
				String Getpaypassword = paypassword.getAttribute("value");
				return Getpaypassword;
			}
			
			
			
			public void setDoB() throws InterruptedException{
				Thread.sleep(2000);
				DoB.click();
				Thread.sleep(1000);
				DoB.sendKeys("10/10/1987");
				Thread.sleep(2000);
			} 
			
			
			public String matchDoB(){
				String GetDoB = DoB.getAttribute("value");
				return GetDoB;
			}
			
			public void checkbox() throws InterruptedException{
				check.click();
				Thread.sleep(2000);
				payUSDButton.click();
				Thread.sleep(2000);
			}
			
			
			
			
			
			
			
			
			
			
			
			
	
		//Click on MyProfile
				public void setMyProfile() throws InterruptedException{
					Thread.sleep(2000);
					MyProfile.click();
					Thread.sleep(2000);
				} 
				
				//Scroll Down a page 
				public void scrollDown() throws InterruptedException{
					Thread.sleep(2000);
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,400)", "");
					Thread.sleep(2000);
					}

				//Scroll Slight Down a page 
				public void scrollSlightDown(){
				JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0,150)", "");
					}	
				
				
				
				
			
				//Click on Logout
				public void Logout() throws InterruptedException{
					Thread.sleep(2000);
					Logout.click();
					Thread.sleep(2000);
				} 
				
			
				
				
				
				//click on Flight link
				
				public void setFlight() throws InterruptedException{
					Thread.sleep(2000);
					Flight.click();
					Thread.sleep(2000);
				} 
				
				
				
				
				public void setFlyfrom(String StrFlyfrom) throws InterruptedException{
					Thread.sleep(2000);
					Flyfrom.click();
					Thread.sleep(1000);
					Flyfrom.sendKeys(StrFlyfrom);
					Thread.sleep(1000);
					Flyfromsingapore.click();
					Thread.sleep(2000);
				}
				
				public void setFlyto(String StrFlyto) throws InterruptedException{
					Thread.sleep(2000);
					Flyto.click();
					Thread.sleep(1000);
					Flyto.sendKeys(StrFlyto);
					Thread.sleep(1000);
					FlytoTokyo.click();
					Thread.sleep(2000);
				}
				
				
				//Click on Email
					public void setFlightSearch() throws InterruptedException{
						Thread.sleep(2000);
						FlightSearch.click();
						
						Thread.sleep(2000);
					} 
				
					
					public void clickUSDPayment() throws InterruptedException{
						Thread.sleep(2000);
						USDPayment.click();
						
						Thread.sleep(2000);
					} 
				
					
					
					public void setAdultFirstName(String StrAdultFirstName) throws InterruptedException{
						Thread.sleep(2000);
						AdultFirstName.click();
						Thread.sleep(1000);
						AdultFirstName.sendKeys(StrAdultFirstName);
						Thread.sleep(1000);
						
					}
					
					public void setAdultLastName(String StrAdultLastName) throws InterruptedException{
						Thread.sleep(2000);
						AdultLastName.click();
						Thread.sleep(1000);
						AdultLastName.sendKeys(StrAdultLastName);
						Thread.sleep(1000);
						
					}
					
					
					public void setAdultNationality() throws InterruptedException{
						Thread.sleep(2000);
						AdultNationality.click();
						Thread.sleep(1000);
						AdultNationalityopt.click();
						Thread.sleep(1000);
						
					}
					
					
					public void setAdultdob() throws InterruptedException{
						Thread.sleep(2000);
						Adultdob.click();
						Thread.sleep(1000);
						Adultdobopt.click();
						Thread.sleep(1000);
						
					}
					
					
					
					
					
					public void setAdultPassport(String StrAdultPassport) throws InterruptedException{
						Thread.sleep(2000);
						AdultPassport.click();
						Thread.sleep(1000);
						AdultPassport.sendKeys(StrAdultPassport);
						Thread.sleep(1000);
						
					}
					
					public void setAdultPassportdate() throws InterruptedException{
						Thread.sleep(2000);
						AdultPassportdate.click();
						Thread.sleep(1000);
						AdultPassportdateopt.click();
						Thread.sleep(1000);
//						AdultPassportdateexpry.click();
						Thread.sleep(1000);
						AdultPassportdateexpryopt.click();
						Thread.sleep(1000);
						
					}
					
					public void setAdultPaypal() throws InterruptedException{
						Thread.sleep(2000);
						Adultpaypal.click();
						Thread.sleep(1000);
					}
					
					public void setAdultdeclrtn() throws InterruptedException{
						declartn.click();
						Thread.sleep(1000);
						confBooking.click();
						Thread.sleep(1000);
					}
					
					
					
				
				//Click on Email
				public void setviewVoucher() throws InterruptedException{
					Thread.sleep(2000);
					viewVoucher.click();
					
					Thread.sleep(2000);
				} 
				
				
				  public boolean ButtonAssertion()throws InterruptedException{
				  	Thread.sleep(4000);
				  	return viewVoucher.isEnabled(); 
				  	
				  }
				  
				  
	
	
}

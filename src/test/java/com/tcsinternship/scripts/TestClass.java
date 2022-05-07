package com.tcsinternship.scripts;
import java.io.IOException;

import java.util.Set;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.tcsinternship.utilities.ExcelUtility;
import com.tcsinternship.constants.AutomationConstants;
import com.tcsinternship.pages.Agent;
import com.tcsinternship.pages.HomePage_Customer;
import com.tcsinternship.pages.Login;
import com.tcsinternship.pages.Login_supplier_admin;
import com.tcsinternship.pages.Profile;



public class TestClass extends TestBase{

	Login objLogin;
	
	HomePage_Customer objHomeCustomer;

	Profile objProfile;
	
	Agent objAgent;
	
	Login_supplier_admin objLogin_supplier;
	
	@Test(priority=0)
	public void Customer_Front_End_Login() throws IOException, InterruptedException {
		
		objLogin = new Login(driver);
		
		objProfile = new Profile(driver);
		
		objHomeCustomer= new HomePage_Customer(driver);
		
		objLogin_supplier= new Login_supplier_admin(driver);
		
//		String expectedUrl =AutomationConstants.LOGINPAGE;
//		String actualUrlhome =driver.getCurrentUrl();
//		AssertJUnit.assertEquals(expectedUrl,actualUrlhome);
	
//		Assertion to Check invalid username and valid password - Customer_Front_End
//		String setUsernameinvalid= ExcelUtility.getCellData(0,0);
//		objLogin.setEmail(setUsernameinvalid);
//		Assert.assertEquals(setUsernameinvalid, objLogin.matchEmail());
	
//		String setPasswordvalid= ExcelUtility.getCellData(0,1);
//		objLogin.clickPassword(setPasswordvalid);
//		Assert.assertEquals(setPasswordvalid, objLogin.matchPassword());
//		objLogin.clicklogin();
//		System.out.println("Assertion to Check invalid username and valid password - Customer_Front_End");
	
//		Assertion to Check valid username and invalid password  - Customer_Front_End
//		String setUsernamevalid= ExcelUtility.getCellData(1,0);
//		objLogin.setEmail(setUsernamevalid);
//		Assert.assertEquals(setUsernamevalid, objLogin.matchEmail());
		
//		String setPasswordinvalid= ExcelUtility.getCellData(1,1);
//		objLogin.clickPassword(setPasswordinvalid);
//		Assert.assertEquals(setPasswordinvalid, objLogin.matchPassword());
//		objLogin.clicklogin();
//		System.out.println("Assertion to Check valid username and invalid password - Customer_Front_End");

//		//Assertion to Check both invalid username and  password		
//		objLogin.setEmail(setUsernameinvalid);
//		Assert.assertEquals(setUsernameinvalid, objLogin.matchEmail());

//		objLogin.clickPassword(setPasswordinvalid);
//		Assert.assertEquals(setPasswordinvalid, objLogin.matchPassword());
//
//		objLogin.clicklogin();
//		System.out.println("Assertion to Check invalid username and invalid password- Customer_Front_End");
		
		
//		//Assertion to Check valid username and  password
//		objLogin.setEmail(setUsernamevalid);
//		Assert.assertEquals(setUsernamevalid, objLogin.matchEmail());
//		
//		objLogin.clickPassword(setPasswordvalid);
//		Assert.assertEquals(setPasswordvalid, objLogin.matchPassword());
//		
//		objLogin.clicklogin();
//		System.out.println("Assertion to Check valid username and  password- Customer_Front_End");		
				
			}
	
	
	@Test(priority=1,enabled=false)
	public void Customer_Front_End_Links() throws IOException, InterruptedException {
		
		objHomeCustomer = new HomePage_Customer(driver);
		
		//Checking the links - My Bookings
		objHomeCustomer.setMyBookings();
		
		//Checking the links - Add Funds
		objHomeCustomer.setAddFunds();
		
		//Checking the link My Profile
		objHomeCustomer.setMyProfile();
		
	}
	
	
	@Test(priority=2,enabled=false)
	public void Customer_Front_Enf_Booking_Vouchers() throws IOException, InterruptedException {
	    
		objHomeCustomer.setFlight();
		
		String setFlyFrom= ExcelUtility.getCellData(10,0);
		objHomeCustomer.setFlyfrom(setFlyFrom);
		
		String setFlyTo= ExcelUtility.getCellData(10,1);
		objHomeCustomer.setFlyto(setFlyTo);
		
		
		objHomeCustomer.setFlightSearch();
		
		
		objHomeCustomer.clickUSDPayment();
		
		objHomeCustomer.scrollSlightDown();
		
		
		String setAdultFirstNamedata= ExcelUtility.getCellData(9,0);
		objHomeCustomer.setAdultFirstName(setAdultFirstNamedata);
		
		String setAdultLastNamedata= ExcelUtility.getCellData(9,1);
		objHomeCustomer.setAdultLastName(setAdultLastNamedata);
		
		objHomeCustomer.scrollSlightDown();
		
		objHomeCustomer.setAdultNationality();
		
		objHomeCustomer.setAdultdob();
		
		String setAdultPassport= ExcelUtility.getCellData(9,12);
		objHomeCustomer.setAdultPassport(setAdultPassport);
		
		
		objHomeCustomer.scrollSlightDown();
		
		objHomeCustomer.setAdultPassportdate();
		
		objHomeCustomer.scrollDown();
		
		objHomeCustomer.setAdultPaypal();
		
		objHomeCustomer.scrollDown();
		
		objHomeCustomer.setAdultdeclrtn();
		
		driver.navigate().to("https://www.phptravels.net/account/bookings");
		
		objHomeCustomer.setMyBookings();
		
		String expectedUrlMybookings =AutomationConstants.MYBOOKING;
		String actualUrlMybookings =driver.getCurrentUrl();
		AssertJUnit.assertEquals(expectedUrlMybookings,actualUrlMybookings);
		
		
		objHomeCustomer.ButtonAssertion();
		objHomeCustomer.setviewVoucher();
	}
	
	@Test(priority=3,enabled=false)
	public void Customer_Front_End_Payment_USD() throws IOException, InterruptedException {
	
		objHomeCustomer.setAddFunds();
		
		objHomeCustomer.payPal();
		
		String expectedUrlAddfunds =AutomationConstants.PAYPAL;
		String actualUrlAddfunds =driver.getCurrentUrl();
		AssertJUnit.assertEquals(expectedUrlAddfunds,actualUrlAddfunds);
		
		String parentWindow=driver.getWindowHandle();
		System.out.println("Parent Window id"+parentWindow);
		
		objHomeCustomer.getpayPalBUtton();
		
		
		Set<String> allWindows=driver.getWindowHandles();
		System.out.println("All window ids" +allWindows);
		
		for(String childWindow:allWindows) {
			System.out.println("childWindow is"+childWindow);
			if(!(childWindow.equalsIgnoreCase(parentWindow)))
			{
				driver.switchTo().window(childWindow);
				driver.manage().window().maximize();
				driver.getCurrentUrl();
				objHomeCustomer.getpayPalCardDEtails();
				
				objHomeCustomer.carddetailsform();
				
				String setCardNumber= ExcelUtility.getCellData(8,0);
				objHomeCustomer.setCardnumber(setCardNumber);
				Assert.assertEquals(setCardNumber, objHomeCustomer.matchCardnumber());
				
				
				String setCardExpry= ExcelUtility.getCellData(8,1);
				System.out.println(setCardExpry);
				objHomeCustomer.setcardExpiry(setCardExpry);
				
				String setcardCvvNo= ExcelUtility.getCellData(8,2);
				objHomeCustomer.setcardCvv(setcardCvvNo);
				Assert.assertEquals(setcardCvvNo, objHomeCustomer.matchcardCvv());
				
				
				objHomeCustomer.scrollSlightDown();

				String setFirstName= ExcelUtility.getCellData(9,0);
				objHomeCustomer.setfirstName(setFirstName);
				Assert.assertEquals(setFirstName, objHomeCustomer.matchfirstName());
				
				String setLastName= ExcelUtility.getCellData(9,1);
				objHomeCustomer.setlastName(setLastName);
				Assert.assertEquals(setLastName, objHomeCustomer.matchlastName());
		
				String setaddress1= ExcelUtility.getCellData(9,2);
				objHomeCustomer.setbillingLine1(setaddress1);
				Assert.assertEquals(setaddress1, objHomeCustomer.matchlbillingLine1());
		
				String setaddress2= ExcelUtility.getCellData(9,3);
				objHomeCustomer.setStrbillingLine2(setaddress2);
				Assert.assertEquals(setaddress2, objHomeCustomer.matchlbillingLine2());
				
		
				String setcity= ExcelUtility.getCellData(9,4);
				objHomeCustomer.setStrbillingCity(setcity);
				Assert.assertEquals(setcity, objHomeCustomer.matchlbillingCity());
	
		
				String setstate= ExcelUtility.getCellData(9,5);
				objHomeCustomer.setStrstate(setstate);
				Assert.assertEquals(setstate, objHomeCustomer.matchstate());
				
				objHomeCustomer.scrollSlightDown();
				
				String setPostalcode= ExcelUtility.getCellData(9,6);
				objHomeCustomer.setpostalcode(setPostalcode);
				Assert.assertEquals(setPostalcode, objHomeCustomer.matchpostalcode());
				
				String setPhoneNumber= ExcelUtility.getCellData(9,7);
				objHomeCustomer.setphoneNumber(setPhoneNumber);
				Assert.assertEquals(setPhoneNumber, objHomeCustomer.matchphoneNumber());
				
				
				String setGmail= ExcelUtility.getCellData(9,8);
				objHomeCustomer.setgmail(setGmail);
				Assert.assertEquals(setGmail, objHomeCustomer.matchgmail());
				
				String setPaypassword= ExcelUtility.getCellData(9,9);
				objHomeCustomer.setpaypassword(setPaypassword);
				Assert.assertEquals(setPaypassword, objHomeCustomer.matchpaypassword());
				
				objHomeCustomer.setDoB();
				objHomeCustomer.checkbox();
				
			
			}
		}
		

	}
	
	
@Test(priority=4,enabled=false)
	
	public void Customer_Front_End_ProfileAddress() throws IOException, InterruptedException {
		
		
		
		objHomeCustomer.setMyProfile();
		
		objHomeCustomer.scrollDown();
		
		String setAddressone= ExcelUtility.getCellData(6,0);
		objProfile.clickaddress1(setAddressone);
		
		String setAddresstwo= ExcelUtility.getCellData(6,1);
		objProfile.clickaddress2(setAddresstwo);
		
		objProfile.clickUpdateProfile();
		
		String expectedProfSuccess =AutomationConstants.PROFILEUPDATESUCCESS;
	    String actualProfSuccess =objProfile.getscsmsgUpdateprofile();
	    Assert.assertEquals(expectedProfSuccess,actualProfSuccess);
	    
	  //Checking the link -Logout
	  objHomeCustomer.Logout();
		
	}
	
	@Test(priority=5,enabled=false)
	public void Login_Agent() throws IOException, InterruptedException {
	    	   	
		String expectedUrl =AutomationConstants.LOGINPAGE;
		String actualUrlhome =driver.getCurrentUrl();
		AssertJUnit.assertEquals(expectedUrl,actualUrlhome);
		
		
		//Assertion to Check invalid username and valid password - Customer_Front_End
		String setUsernameinvalid= ExcelUtility.getCellData(0,0);
		objLogin.setEmail(setUsernameinvalid);
		Assert.assertEquals(setUsernameinvalid, objLogin.matchEmail());
			
		String setPasswordvalid= ExcelUtility.getCellData(0,1);
		objLogin.clickPassword(setPasswordvalid);
		Assert.assertEquals(setPasswordvalid, objLogin.matchPassword());
		objLogin.clicklogin();
		
			
		//Assertion to Check valid username and invalid password  - Customer_Front_End
		String setUsernamevalid= ExcelUtility.getCellData(1,0);
		objLogin.setEmail(setUsernamevalid);
		Assert.assertEquals(setUsernamevalid, objLogin.matchEmail());
				
		String setPasswordinvalid= ExcelUtility.getCellData(1,1);
		objLogin.clickPassword(setPasswordinvalid);
		Assert.assertEquals(setPasswordinvalid, objLogin.matchPassword());
		objLogin.clicklogin();
		

		//Assertion to Check both invalid username and  password		
		objLogin.setEmail(setUsernameinvalid);
		Assert.assertEquals(setUsernameinvalid, objLogin.matchEmail());
		objLogin.clickPassword(setPasswordinvalid);
		Assert.assertEquals(setPasswordinvalid, objLogin.matchPassword());
		objLogin.clicklogin();
		
		//Assertion to Check where the entered email and data from input sheet are same - agent
		String setusername= ExcelUtility.getCellData(2,0);
		objLogin.setEmail(setusername);
		Assert.assertEquals(setusername, objLogin.matchEmail());
		
		//Assertion to Check where the entered password and data from input sheet are same
		String clickPassword= ExcelUtility.getCellData(2,1);
		objLogin.clickPassword(clickPassword);
		Assert.assertEquals(clickPassword, objLogin.matchPassword());
		
		objLogin.clicklogin() ;

		
	}
	
	
	
	
	@Test(priority=6,enabled=false)
	public void Login_Agent_Link() throws IOException, InterruptedException {
		
		objAgent = new Agent(driver);
		
		//Checking the links - My Bookings
		objHomeCustomer.setMyBookings();
			
		//Checking the links - Add Funds
		objHomeCustomer.setAddFunds();
			
		//Checking the link My Profile
		objHomeCustomer.setMyProfile();
		
		objAgent.setHome();
		
		String expectedUrlHome =AutomationConstants.HOMEURL;
		String actualUrlHome =driver.getCurrentUrl();
		AssertJUnit.assertEquals(expectedUrlHome,actualUrlHome);
		
		objAgent.setHotel();
		String expectedUrlHotel =AutomationConstants.HOTELURL;
		String actualUrlHotel =driver.getCurrentUrl();
		AssertJUnit.assertEquals(expectedUrlHotel,actualUrlHotel);
		
		objAgent.setCity();
				
		objAgent.setcurrency();
		
		objAgent.setFlight();
		String expectedUrlFlight =AutomationConstants.FLIGHTURL;
		String actualUrlFlight =driver.getCurrentUrl();
		AssertJUnit.assertEquals(expectedUrlFlight,actualUrlFlight);
		
		objAgent.setTour();
		String expectedUrlTour =AutomationConstants.TOURURL;
		String actualUrlTour =driver.getCurrentUrl();
		AssertJUnit.assertEquals(expectedUrlTour,actualUrlTour);
		
		objAgent.setVisa();
		String expectedUrlVisa =AutomationConstants.VISAURL;
		String actualUrlVisa =driver.getCurrentUrl();
		AssertJUnit.assertEquals(expectedUrlVisa,actualUrlVisa);
		
		objAgent.setBlog();
		String expectedUrlBlog =AutomationConstants.BLOGURL;
		String actualUrlBlog =driver.getCurrentUrl();
		AssertJUnit.assertEquals(expectedUrlBlog,actualUrlBlog);
		
		
		objAgent.setOffers();
		String expectedUrlOffers =AutomationConstants.OFFERSURL;
		String actualUrlOffers =driver.getCurrentUrl();
		AssertJUnit.assertEquals(expectedUrlOffers,actualUrlOffers);
		
		objAgent.Logout();
		
		
	}
		
	@Test(priority=7)
	public void Admin() throws IOException, InterruptedException {
	    	   	
		driver.navigate().to("https://www.phptravels.net/api/admin");
	
		
		//Assertion to Check invalid username and valid password - Admin
		String setUsernameinvalid= ExcelUtility.getCellData(0,0);
		objLogin_supplier.setEmail(setUsernameinvalid);
		Assert.assertEquals(setUsernameinvalid, objLogin_supplier.matchEmail());
					
		String setPasswordvalid= ExcelUtility.getCellData(0,1);
		objLogin_supplier.clickPassword(setPasswordvalid);
		Assert.assertEquals(setPasswordvalid, objLogin_supplier.matchPassword());
		objLogin_supplier.clicklogin();
				
					
		//Assertion to Check valid username and invalid password  - Admin
		String setUsernamevalid= ExcelUtility.getCellData(3,0);
		objLogin_supplier.setEmail(setUsernamevalid);
		Assert.assertEquals(setUsernamevalid, objLogin_supplier.matchEmail());
						
		String setPasswordinvalid= ExcelUtility.getCellData(1,1);
		objLogin_supplier.clickPassword(setPasswordinvalid);
		Assert.assertEquals(setPasswordinvalid, objLogin_supplier.matchPassword());
		objLogin_supplier.clicklogin();
				

		//Assertion to Check both invalid username and  password		
		objLogin_supplier.setEmail(setUsernameinvalid);
		Assert.assertEquals(setUsernameinvalid, objLogin_supplier.matchEmail());
		objLogin_supplier.clickPassword(setPasswordinvalid);
		Assert.assertEquals(setPasswordinvalid, objLogin_supplier.matchPassword());
		objLogin_supplier.clicklogin();
				
		//Assertion to Check where the entered email and data from input sheet are same - agent
		String setusername= ExcelUtility.getCellData(3,0);
		objLogin_supplier.setEmail(setusername);
		Assert.assertEquals(setusername, objLogin_supplier.matchEmail());
				
		//Assertion to Check where the entered password and data from input sheet are same
		String clickPassword= ExcelUtility.getCellData(3,1);
		objLogin_supplier.clickPassword(clickPassword);
		Assert.assertEquals(clickPassword, objLogin_supplier.matchPassword());
		objLogin_supplier.clicklogin() ;
		
		objLogin_supplier.clickbookingLink();
		
		
		
		
		objLogin_supplier.clickwebsiteLink();
		
		
	}
	
	
@Test(priority=8)
	public void Login_Supplier() throws IOException, InterruptedException {
	    	
		
		objLogin_supplier = new Login_supplier_admin(driver);
		
		driver.navigate().to("https://www.phptravels.net/api/admin");
		
		String expectedUrl =AutomationConstants.LOGINPAGESUPPLIER;
		String actualUrlhome =driver.getCurrentUrl();
		AssertJUnit.assertEquals(expectedUrl,actualUrlhome);
		
		
		
		//Assertion to Check invalid username and valid password - SUPPLIER
		String setUsernameinvalid= ExcelUtility.getCellData(0,0);
		objLogin_supplier.setEmail(setUsernameinvalid);
		Assert.assertEquals(setUsernameinvalid, objLogin_supplier.matchEmail());
					
		String setPasswordvalid= ExcelUtility.getCellData(0,1);
		objLogin_supplier.clickPassword(setPasswordvalid);
		Assert.assertEquals(setPasswordvalid, objLogin_supplier.matchPassword());
		objLogin_supplier.clicklogin();
				
					
		//Assertion to Check valid username and invalid password  - SUPPLIER
		String setUsernamevalid= ExcelUtility.getCellData(3,0);
		objLogin_supplier.setEmail(setUsernamevalid);
		Assert.assertEquals(setUsernamevalid, objLogin_supplier.matchEmail());
						
		String setPasswordinvalid= ExcelUtility.getCellData(1,1);
		objLogin_supplier.clickPassword(setPasswordinvalid);
		Assert.assertEquals(setPasswordinvalid, objLogin_supplier.matchPassword());
		objLogin_supplier.clicklogin();
				

		//Assertion to Check both invalid username and  password		
		objLogin_supplier.setEmail(setUsernameinvalid);
		Assert.assertEquals(setUsernameinvalid, objLogin_supplier.matchEmail());
		objLogin_supplier.clickPassword(setPasswordinvalid);
		Assert.assertEquals(setPasswordinvalid, objLogin_supplier.matchPassword());
		objLogin_supplier.clicklogin();
		
		
		
		
		
		//Assertion to Check where the entered email and data from input sheet are same
		String setusername= ExcelUtility.getCellData(4,0);
		objLogin_supplier.setEmail(setusername);
		Assert.assertEquals(setusername, objLogin_supplier.matchEmail());
		
		//Assertion to Check where the entered password and data from input sheet are same
		String clickPassword= ExcelUtility.getCellData(4,1);
		objLogin_supplier.clickPassword(clickPassword);
		Assert.assertEquals(clickPassword, objLogin_supplier.matchPassword());
		
		objLogin_supplier.clicklogin() ;
//		objLogin_supplier.clicklogout();
		
	}
	
}
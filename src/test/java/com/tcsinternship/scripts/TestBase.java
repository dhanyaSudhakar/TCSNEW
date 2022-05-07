package com.tcsinternship.scripts;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
	
	WebDriver driver;
    public static Properties prop = null;
    String driverPath = "/home/user/Desktop/chromedriver_linux64/chromedriver";
    

    //get creating a function 
    public static void TestBase() {
        try 	{
        		//Below line creates an object of Properties called 'prop'
            	prop = new Properties();
            	//Below line creates an object of FileInputStream called 'ip'. 
            	//Give the path of the properties file which you have created
            	FileInputStream ip = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources"
                    + "/config.properties");
            	//Below line of code will load the property file
            	prop.load(ip);
        		} 
        catch (FileNotFoundException e) {
            	e.printStackTrace();
        	}	 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    //Parallel Execution 
    //@Parameters("browser")
    
    @BeforeTest
    //public void onSetup(String browserName) {
    public void onSetup() {
        	TestBase(); // for loading the configurations
        	String browserName = prop.getProperty("browser");

        if (browserName.equals("chrome")) {
        	System.setProperty("webdriver.chrome.driver", driverPath);
            driver = new ChromeDriver();
        }
        else if (browserName.equals("firefox")) {
        	//geckodriver
        	System.setProperty("webdriver.gecko.driver", driverPath);
            driver = new FirefoxDriver();
        }
        
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(prop.getProperty("url"));
        driver.manage().window().maximize();   
    }
    
  @AfterMethod
	public void tearDown(ITestResult iTestResult) throws IOException{
		if(iTestResult.FAILURE==iTestResult.getStatus())
		{
			takeScreenShot(iTestResult.getName());
		}
	}
		
	public String takeScreenShot(String name)throws IOException{
		String dateName =new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		File source =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String Designation = System.getProperty("user.dir")+"//target//"+name+dateName+".png";
		File finalDesignation = new File(Designation);
		
		FileHandler.copy(source, finalDesignation);
		return Designation;
	}
	

//    @AfterTest
//    public void quitBrowser() throws IOException{
//    	driver.quit();
//    }
    
}

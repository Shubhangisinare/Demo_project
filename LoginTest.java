package com.assetmangement.testData;
import org.testng.annotations.Test;

import com.google.j2objc.annotations.ReflectionSupport.Level;

import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	 private static final java.util.logging.Level Level = null;
	static WebElement username;
	 public static void main(String[] args) {
	        // Set the path to your ChromeDriver executable
	        System.setProperty("webdriver.chrome.driver", "baseURL");

	        // Create a new instance of the ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        // Test Case 1: Verify Login Functionality
	        testLoginFunctionality(driver);

	        // Test Case 2: Verify Login with Blank value Functionality
	        testSearchFunctionalityWithBlank(driver);

	        // Test Case 3: Verify Login with invlaid vlaue Functionality
	        testLoginFunctionalityinvalid(driver);
	        
	      // Test Case 3: Verify TearmsAndCondition Functionality 
	        testLoginFunctionalityTearmsAndCondition(driver);

	        
	     // Test Case 3: Verify ForgotPassword Functionality 
	        testLoginFunctionalityForgotPassword(driver);
	        
	        // Test Case 3: Verify ContactUs Functionality 
	        testLoginFunctionalityContanctUs(driver);
	        
	        // Close the browser
	        driver.quit();
	    }

	    @Test(enabled = false)
		private static void testLoginFunctionality(WebDriver driver) {
	        // Navigate to the login page
	        driver.get("baseURL");

	        // Enter valid credentials
	        WebElement usernameInput = driver.findElement(By.id("username"));
	       // WebElement passwordInput = driver.findElement(By.id("password"));
	 
	        usernameInput.sendKeys("username");
	        WebElement loginButton = driver.findElement(By.id("btnContinue"));

	       // passwordInput.sendKeys("your_password");
	        clickSubmit().click();

	        // Verify the user is logged in (check for a welcome message or user dashboard element)
	        WebElement username = driver.findElement(By.id("username"));
	        if (username.isDisplayed()) {
	            System.out.println("Test Case 1 Passed: Login Functionality works");
	        } else {
	            System.out.println("Please enter valid username to continue");
	        }
	    }

	    private static WebElement clickSubmit() {
			// TODO Auto-generated method stub
			return null;
		}

		@Test(enabled = false)
		private static void testSearchFunctionalityWithBlank(WebDriver driver) {
	        // Navigate to the search page
	        driver.get("baseURL");
	      
	        // Verify Login with Blank value
		       
	        WebElement username1 = driver.findElement(By.id("username"));
	        WebElement loginButton = driver.findElement(By.id("btnContinue"));

	         username.sendKeys(" ");
	        clickSubmit().click();

	  
			if (username.isDisplayed()) {
	            System.out.println("Test Case 2 Passed:Functionality works");
	        } else {
	            System.out.println("This field is required.");
	        }
	    }

	    @Test(enabled = false)
		private static void testLoginFunctionalityinvalid(WebDriver driver) {
	        // Navigate to the user dashboard or profile page
	        driver.get("baseURL");

	        // Perform logout action
	        WebElement username3 = driver.findElement(By.id("username"));
	        WebElement loginButton = driver.findElement(By.id("btnContinue"));

	        clickSubmit().click();
	        if (loginButton.isDisplayed()) {
	            System.out.println("Test Case 3 Passed:Functionality works");
	        } else {
	            System.out.println("Please enter valid username to continue");
	        }
	    }
	    
	    @Test(enabled = false)
  		private static void testLoginFunctionalityForgotPassword(WebDriver driver) {
  	        // Navigate to the user dashboard or profile page
  	        driver.get("baseURL");
  	        WebElement username3 = driver.findElement(By.linkText("Terms &\r\n"
  	        		+ "                            Conditions"));
  	       

  	        clickSubmit().click();
  	}
	    
	    
	    
	    
	    @Test(enabled = false)
		private static void testLoginFunctionalityTearmsAndCondition(WebDriver driver) {
	        // Navigate to the user dashboard or profile page
	        driver.get("baseURL");
	        WebElement username3 = driver.findElement(By.linkText("Terms &\r\n"
	        		+ "                            Conditions"));
	       

	        clickSubmit().click();
	}
	    
	    
	    @Test(enabled = false)
	  		private static void testLoginFunctionalityContanctUs(WebDriver driver) {
	  	        // Navigate to the user dashboard or profile page
	  	        driver.get("baseURL");
	  	        WebElement username3 = driver.findElement(By.linkText("Terms &\r\n"
	  	        		+ "                            Conditions"));
	  	        clickSubmit().click();
	  	}
	    
	    private void logError(Exception e) {
	        try {
	            FileHandler fileHandler = new FileHandler("error_log.txt", true);  // 'true' means append to the file
	            SimpleFormatter simpleFormatter = new SimpleFormatter();
	            fileHandler.setFormatter(simpleFormatter);
	            Logger logger = null;
				logger.addHandler(fileHandler);
	            
	            // Log the error message
	            logger.log(Level, "Error occurred:", e);
	        } catch (Exception ex) {
	            // If an error occurs while logging, print the stack trace
	            ex.printStackTrace();
	        }
	    }

}

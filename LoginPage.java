package com.assetmangment.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;  

public class LoginPage {
	
	WebDriver ldriver;
	public LoginPage(WebDriver rdriver)    // constructor 
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	
	}
	
	@FindBy(name="username")
	WebElement txtUserName;
	
	
	//@FindBy(name="password")
	//WebElement txtpassword;
	
	@FindBy(id="btnContinue")
	WebElement btnLogin;
	
	
	//Action Method to set Methods
	
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys();
	}
	
	
	public void setPassword(String password)
	{
		txtUserName.sendKeys(password);
	}
	
	public void clickSubmit()
	{
		btnLogin.click();
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	

	

	
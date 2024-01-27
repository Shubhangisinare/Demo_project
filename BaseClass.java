package com.assetmanagement.pageobjects;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.assetmanagement.utilities.ReadConfig;

public class BaseClass {
    
    ReadConfig readconfig = new ReadConfig();
    // common things we write here
    
    public String baseURL = readconfig.getApplicationURL();
    public String username = readconfig.getUsername();
    public static WebDriver driver;

    @BeforeClass
    // this method always executes 1st before the test executes
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", new ReadConfig().getChromePath());
        driver = new ChromeDriver();
    }

    @AfterClass
    // After test Execution, this annotation Executes
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
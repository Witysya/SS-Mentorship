package com.toolsqa;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleTests {
    private ChromeDriver driver;

    @Before
    public void testSetUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vhord\\IdeaProjects\\SeleniumTests\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("TestSuitStarted");
    }
    @Test
    public void accessToPage() {
        System.out.println("FirstTetsStarted");
        driver.get("https://www.toolsqa.com/automation-practice-form");
        driver.quit();
        System.out.println("FirstTetsEnded");
    }

    @After
    public void quitBrowser(){
        driver.quit();
    }
}
package com.toolsqa;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    protected ChromeDriver driver;

    @Before
    public void testSetUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vhord\\IdeaProjects\\SeleniumTests\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.toolsqa.com/automation-practice-form");
    }

    @After
    public void quitBrowser(){
        driver.quit();
    }

}

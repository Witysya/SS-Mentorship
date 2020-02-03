package com.toolsqa;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class InputTest extends BaseTest {
       @Test
       public void typeFirstName() {

           WebElement firstNameElement = driver.findElementByName("firstname");
           firstNameElement.sendKeys("Yurii");
    }
    @Test
    public void checkFirstName() {
        String expectedFirstName = "Yurii";

        WebElement firstNameElement = driver.findElementByName("firstname");
        firstNameElement.sendKeys(expectedFirstName);
        String actualFirstName = firstNameElement.getAttribute("value");
        Assert.assertEquals(expectedFirstName, actualFirstName);

    }
    @Test
    public void checkLastName() {
        String expectedLastName = "BimBim";

        WebElement firstNameElement = driver.findElementByName("firstname");
        firstNameElement.sendKeys("BimBim");
        String actualFirstName = firstNameElement.getAttribute("value");
        Assert.assertEquals(expectedLastName, actualFirstName);

    }
    @Test
    public void linkTest() {
        String expectedLinkAddress = "https://www.toolsqa.com/automation-practice-table/";

        WebElement linkAddress = driver.findElementByXPath("//*[@id=\"content\"]/div[1]/div/div/div/div[2]/div/form/fieldset/div[2]/a/strong");
        linkAddress.click();
        linkAddress.getAttribute()

        firstNameElement.sendKeys("BimBim");
        String actualFirstName = firstNameElement.getAttribute("value");
        Assert.assertEquals(expectedLinkAddress, actualFirstName);

    }

}
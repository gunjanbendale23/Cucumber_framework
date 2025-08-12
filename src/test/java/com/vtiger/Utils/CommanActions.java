package com.vtiger.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommanActions {
    public WebDriver driver;
    WebDriverWait wait;
    public CommanActions(WebDriver driver)
    {
        this.driver= driver;
         wait= new WebDriverWait(driver,Duration.ofSeconds(10));
    }

    public  void SetInput(WebElement ele, String val) {
        try {
            wait.until(ExpectedConditions.visibilityOf(ele));
            ele.clear();
            ele.sendKeys(val);

        } catch (Exception e)
        {

            e.printStackTrace();
        }
    }
    public  void ClickElement(WebElement ele) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(ele));
            ele.click();

        } catch (Exception e)
        {

            e.printStackTrace();
        }
    }
    public  void ElementExists(WebElement ele) {
        try {
            wait.until(ExpectedConditions.visibilityOf(ele));
            ele.isDisplayed();

        } catch (Exception e)
        {

            e.printStackTrace();
        }
    }

}

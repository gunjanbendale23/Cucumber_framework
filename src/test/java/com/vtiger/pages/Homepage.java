package com.vtiger.pages;

import com.vtiger.Utils.CommanActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends CommanActions {

    public Homepage(WebDriver driver)
    {
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver ,this);
    }

    @FindBy(linkText = "Home")
    WebElement lnk_home;

    @FindBy(linkText = "Logout")
    WebElement lnk_logout;

    @FindBy(linkText = "New Lead")
    WebElement lnk_Newlead;


    public  void HomeDisplay()
    {
        ElementExists(lnk_home);
    }

    public  void LogoutDisplay()
    {
        ElementExists(lnk_logout);
    }

    public  void ClickLead()
    {
        ClickElement(lnk_Newlead);
    }



}

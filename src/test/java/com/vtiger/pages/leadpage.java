package com.vtiger.pages;

import com.vtiger.Utils.CommanActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class leadpage extends CommanActions {


    public leadpage(WebDriver driver)
    {
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver ,this);
    }

    @FindBy(name = "lastname")
    WebElement tb_lastname;

    @FindBy(name = "company")
    WebElement tb_company;

    @FindBy(name = "button")
    WebElement btn_save;





    // String username="user_name";
    // By username= By.name("user_name");


    public  void CreateLead(String lname, String comp)
    {
        setLastname(lname);
        setCompany(comp);
        ClickSave();
    }

    public  void setLastname(String lname)
    {
        SetInput(tb_lastname,lname);
    }

    public  void setCompany(String comp)
    {
        SetInput(tb_company,comp);
    }

    public  void ClickSave()
    {
        ClickElement(btn_save);

    }





}

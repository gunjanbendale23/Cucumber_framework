package com.vtiger.pages;

import com.vtiger.Utils.CommanActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage extends CommanActions {

    public loginpage(WebDriver driver)
    {
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver ,this);
    }

    @FindBy(name = "user_name")
    WebElement tb_username;

    @FindBy(name = "user_password")
    WebElement tb_password;

    @FindBy(name = "Login")
    WebElement btn_login;

    @FindBy(xpath = "//td[contains(text(),'You must specify a valid username and password.')]")
    WebElement err_massage;


   // String username="user_name";
   // By username= By.name("user_name");


    public  void login(String uid, String pwd)
    {
        setUsername(uid);
        setpassword(pwd);
        clicklogin();

    }

    public  void setUsername(String uid)
    {
        SetInput(tb_username,uid);
    }

    public  void setpassword(String pwd)
    {
        SetInput(tb_password,pwd);
    }

    public  void clicklogin()
    {
        ClickElement(btn_login);
    }

   public  void Displaypassword()
    {
        ElementExists(tb_password);
    }
    public  void DisplayErrorMsg()
    {
        ElementExists(err_massage);
    }
}

package com.vtiger.pages;


import org.openqa.selenium.WebDriver;
public class PageObjectManager {

    public static WebDriver driver;

    // Declare all page objects
    private loginpage lp;
    private Homepage hp;
    private leadpage ldp;



    // Lazy initialization for LoginPage
    public loginpage getLoginPage() {
        return (lp == null) ? lp = new loginpage(driver) : lp;
    }

    // Lazy initialization for HomePage
    public Homepage getHomePage() {
        return (hp == null) ? hp = new Homepage(driver) : hp;
    }

    public leadpage getLeadPage() {
        return (ldp == null) ? ldp = new leadpage(driver) : ldp;
    }
}

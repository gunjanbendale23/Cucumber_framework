package com.vtiger.stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Map;


public class lead2steps extends Basesteps {

  /*  @Given("user should be on login page")
    public void user_should_be_on_login_pagee() {
        driver= new ChromeDriver();
        driver.get("http://localhost:100");
    }
    @When("user enters valid Useridd")
    public void user_enters_valid_useridd() {
        driver.findElement(By.name("user_name")).sendKeys("admin");

    }
    @When("user enters valid passwordd")
    public void user_enters_valid_passwordd() {
        driver.findElement(By.name("user_password")).sendKeys("admin");

    }
    @When("user click on login buttonn")
    public void user_click_on_login_buttonn() {
        driver.findElement(By.name("Login")).click();

    }*/
  @When("user click on new lead and enters the lastname and company and click on login button")
  public void user_click_on_new_lead_and_enters_the_lastname_and_company_and_click_on_login_button(io.cucumber.datatable.DataTable dataTable)  {
        List<Map<String,String>> ls= dataTable.asMaps();
        for (int i=0;i<ls.size();i++){
            driver.findElement(By.linkText("New Lead")).click();
            driver.findElement(By.name("lastname")).sendKeys(ls.get(i).get("lname"));
            driver.findElement(By.name("company")).sendKeys(ls.get(i).get("comp"));
            driver.findElement(By.name("button")).click();
        }

    }
    @Then("click logout")
    public void click_logout() {
        driver.findElement(By.linkText("Logout")).click();
    }




}

package com.vtiger.stepdefinations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

public class leadssteps extends  Basesteps{

    @When("user click on new lead link")
    public void user_click_on_new_lead_link() {
        getHomePage().ClickLead();
    }
    @When("user enters the last name and company and click on login button")
    public void user_enters_the_last_name_and_company_and_click_on_login_button() {
        getLeadPage().CreateLead(dt.get(TCName).get("lastname"),dt.get(TCName).get("company"));
    }
    @Then("lead should be created successfully")
    public void lead_should_be_created_successfully() {

    }

  /*  @When("user click on new lead and enters the last name and company and click on login button")
    public void user_click_on_new_lead_and_enters_the_last_name_and_company_and_click_on_login_button(io.cucumber.datatable.DataTable dataTable) {
        List<Map<String,String>> ls= dataTable.asMaps();
        for (int i=0;i<ls.size();i++){
            hp.ClickLead();
            ldp.CreateLead(ls.get(i).get("lastname"),ls.get(i).get("company"));
            ldp.ClickSave();
        }

    }
    @Then("click logout")
    public void click_logout() {
        driver.findElement(By.linkText("Logout")).click();
    }*/




}


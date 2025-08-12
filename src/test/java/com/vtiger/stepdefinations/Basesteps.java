package com.vtiger.stepdefinations;

import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import com.vtiger.pages.Homepage;
import com.vtiger.pages.PageObjectManager;
import com.vtiger.pages.leadpage;
import com.vtiger.pages.loginpage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.codoid.products.fillo.Connection;


import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Basesteps extends PageObjectManager {

    public  static Properties prop;
    public static String TCName;
    public static Map<String, Map<String,String>> dt;



    public  void LaunchApp()
    {
        readproperties();
       ReadExcel();
       // System.exit(1);
        if (prop.getProperty("browser").equalsIgnoreCase("edge"))
        {
            driver = new EdgeDriver();
        }
        if (prop.getProperty("browser").equalsIgnoreCase("firefox"))
        {
            driver=new FirefoxDriver();
        }
      else  if(prop.getProperty("browser").equalsIgnoreCase("headless"))
        {
            ChromeOptions options= new ChromeOptions();
            options.addArguments("--headless=new");
            driver= new ChromeDriver(options);
        }
        else
        {
            driver= new ChromeDriver();
        }
        driver.get(prop.getProperty("url"));

    }

    public  void readproperties()
    {
        prop= new Properties();
        try {
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/Config/configData.properties");
            prop.load(fis);
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public void ReadExcel() {
        try {
            Fillo fillo=new Fillo();
            String filePath = "D:/SeleniumWithJava/Cucumber_framework/src/test/resources/TestData/Data.xlsx";
            Connection connection = fillo.getConnection(filePath);
            System.out.println("Reading Excel from: " + filePath);

            String strQuery="Select * from Sheet1";
            Recordset recordset=connection.executeQuery(strQuery);
          ArrayList<String> ls= recordset.getFieldNames();
           dt= new HashMap<>();

            while(recordset.next()){
                Map<String,String> map= new HashMap<>();
                String TCname=recordset.getField("TC name");
                for(int i=1;i<ls.size();i++)
                {
                    String ColumnName= ls.get(i);
                    String ColumnValue=recordset.getField(ColumnName);
                    map.put(ColumnName,ColumnValue);
                }
                    dt.put(TCname,map);

            }
            System.out.println(dt);

            recordset.close();
            connection.close();
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

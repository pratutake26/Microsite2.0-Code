package com.microsite.testcases;

import com.microsite.base.MicrositeScreenBase;
import com.micrositelandingpage.EducatorLoginpage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginPageTest extends MicrositeScreenBase {

    EducatorLoginpage loginpage;
    //Create the login page const
     public LoginPageTest(){
         super();  //super class const will inharit the property of parent class (base class)
     }

     @BeforeMethod
        public void setUp() throws IOException {
         initialization();
         loginpage = new EducatorLoginpage();
     }
    @Test(priority = 1)

    public void LoginTest(){
         loginpage.login(prop.getProperty("Username"), prop.getProperty("password") );
    }

     @AfterMethod
     public void tearDown(){
         driver.quit();
     }


}

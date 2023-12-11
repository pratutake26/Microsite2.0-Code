package com.microsite.testcases;

import com.microsite.base.MicrositeScreenBase;
import com.micrositelandingpage.LandingPage;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class LandingPageTest extends MicrositeScreenBase {

    LandingPage landingPa;
    public LandingPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp() throws IOException {
        initialization();
        landingPa = new LandingPage();
    }
    @Test(priority = 1)
   public void LandingPageTitle(){
       String title = landingPa.validatePageTitle();
       Assert.assertEquals(title,"Get Personalised Education for All Nagaland Students - Embibe");
   }

    @Test(priority = 2)
    public void LandingPagelogo(){
        boolean flag = landingPa.validateEmlogo();
        Assert.assertTrue(flag);
    }
    @Test(priority = 3)
    public void RegistrationButtonTest() {
        landingPa.ValidRegButton();
        Assert.assertTrue(true);

    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}

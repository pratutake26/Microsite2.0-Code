package com.microsite.testcases;

import com.microsite.base.MicrositeScreenBase;
import com.micrositelandingpage.EducatorSchoolDetailsPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class SchoolDetailsPageTest extends MicrositeScreenBase {
    EducatorSchoolDetailsPage schooldeatilspa;
    private Object wait;

    public SchoolDetailsPageTest(){
        super();  //super class const will inharit the property of parent class (base class)
    }

    @BeforeMethod
    public void setUp() throws IOException {
        initialization();
        schooldeatilspa = new EducatorSchoolDetailsPage();
    }

    @Test(priority = 1)
    public void LandingPageTitle1() {
        String title = schooldeatilspa.validatepagetitle1();
        Assert.assertEquals(title, "Create Your Educator Account");
    }
    @Test(priority = 2)
    public void LandingPageTitle2() {
        String title = schooldeatilspa.validatepagetitle2();
        Assert.assertEquals(title, "Verify your School Details to get Started with Embibe");
    }
    @Test(priority = 3)
    public void LandingPageTitle3() {
        String title = schooldeatilspa.validatepagetitle3();
        Assert.assertEquals(title, "To ensure that only Educator can access our platform, we need to verify your School’s details. Please enter your School UDISE Code below");
    }
    @Test(priority = 4)
    public void FindUdiscodelink() {
        schooldeatilspa.FindUdiscode();
        Assert.assertTrue(true);
    }

    @Test(priority = 5)
    public void LoginTest() throws InterruptedException {
        schooldeatilspa.EnterUdiseCode(prop.getProperty("Udisecode"));
        Thread.sleep(15000);
        driver.findElement(By.xpath("//div[@id='list_of_udise_codes']")).click();
        Thread.sleep(20000);
        driver.findElement(By.xpath("#this_is_myschool")).click();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}

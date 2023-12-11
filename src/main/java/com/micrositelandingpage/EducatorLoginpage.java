package com.micrositelandingpage;

import com.microsite.base.MicrositeScreenBase;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EducatorLoginpage extends MicrositeScreenBase {


    @FindBy(id = "tc_email")
    WebElement username;

    @FindBy(name = "Password")
    WebElement password;

    @FindBy(xpath = "//input[@id='tc-login-btn']")
    WebElement loginbtn;

    public EducatorLoginpage(){
        PageFactory.initElements(driver ,this);

    }

    public void login(String un,String pwd){
        username.sendKeys(un);
        password.sendKeys(pwd);
        loginbtn.click();




    }





}

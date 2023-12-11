package com.micrositelandingpage;

import com.microsite.base.MicrositeScreenBase;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends MicrositeScreenBase {

   @FindBy(className = "evlogo")
    WebElement Emlogo;

   @FindBy(className = "mobile personmobile")
    WebElement Image;

   @FindBy(xpath = "//a[contains(text(),'Student Registration')]")
    WebElement Regbutton;

    @FindBy(className = "secondary-button evlbtn")
    WebElement login;

    @FindBy(xpath = "//span[contains(text(),'LEARN')]")
    WebElement LearnModule;

    @FindBy(xpath = "//span[contains(text(),'PRACTICE')]")
    WebDriver PracticeModule;

    @FindBy(xpath = "//span[contains(text(),'TEST')]")
    WebElement TestModule;

    @FindBy(xpath = "//span[contains(text(),'ACHIEVE')]")
    WebElement AchieveModule;

    @FindBy(xpath = "//span[contains(text(),'ASK')]")
    WebElement Ask;

    //Initializing the page objects:

    public LandingPage(){
        PageFactory.initElements(driver ,this);
    }

    //Actions

    public String validatePageTitle(){
        return driver.getTitle();
    }

    public boolean validateEmlogo() {
        return Emlogo.isDisplayed();

    }

    public boolean validateMicrositeImage(){

        return Image.isDisplayed();
    }

    public void ValidRegButton(){

        Regbutton.click();
    }
    public void ValidateLoginButton(){
        login.click();

    }
    public void ValidateTestModule() {
        TestModule.click();
    }








}

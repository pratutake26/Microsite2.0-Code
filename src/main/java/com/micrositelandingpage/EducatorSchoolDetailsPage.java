package com.micrositelandingpage;

import com.microsite.base.MicrositeScreenBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EducatorSchoolDetailsPage extends MicrositeScreenBase {

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[2]/h1[1]")
    WebElement Tile1;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/p[1]")
    WebElement Tile2;

    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/p[1]")
    WebElement Title3;

    @FindBy(name = "UDISE code")
    WebElement UdiscCode;

    @FindBy(xpath = "//a[@id='find_udise_link_btn']")
    WebElement Udisecode1;

    @FindBy(xpath ="//div[@id='list_of_udise_codes']" )
    WebElement ListUdiscCode;

    public EducatorSchoolDetailsPage() {
        PageFactory.initElements(driver, this);
    }

    public String validatepagetitle1() {
        return Tile1.getText();
    }

    public String validatepagetitle2() {
        return Tile2.getText();

    }

    public String validatepagetitle3() {

        return Title3.getText();

    }

    public void FindUdiscode(){
        Udisecode1.click();
    }

    public void EnterUdiseCode(String Ud) throws InterruptedException {
        UdiscCode.sendKeys(Ud);
        Thread.sleep(1000);
        ListUdiscCode.click();
    }

}

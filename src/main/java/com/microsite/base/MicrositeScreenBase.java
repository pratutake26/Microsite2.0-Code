package com.microsite.base;

import com.microsite.utils.MicrositeScreenUtil;
import org.apache.commons.math3.stat.inference.TestUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class MicrositeScreenBase {

    public static Properties prop;

    public static EventFiringWebDriver e_driver;
    public static WebDriver driver;



    public MicrositeScreenBase() {
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream("/Users/pratikshavilastake/Documents/Microsite1/Microsite2.0/src/main/java/com/microsite/config/config.properties");
            prop.load(ip);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    public static void initialization() throws IOException {
        String browsername = prop.getProperty("browser");
        if(browsername.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "/Users/pratikshavilastake/Documents/Microsite1/" +
                    "Microsite2.0/chromedriver");
            driver = new ChromeDriver();
        }
        else if (browsername.equals("FF")) {
            System.setProperty("webdriver.chrome.driver", "/Users/pratikshavilastake/Documents/Microsite1/" +
                    "Microsite2.0/chromedriver");
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(MicrositeScreenUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(MicrositeScreenUtil.IMPLICIT_WAIT , TimeUnit.SECONDS);


        driver.get(prop.getProperty("Nurl"));




    }
}

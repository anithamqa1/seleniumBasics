package com.mkm.drivers;

import com.mkm.constants.FrameworkConstants;
import com.mkm.utils.ReadFileProperties;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

import static com.mkm.drivers.DriverManager.*;

public final class Driver {

    private Driver(){
            }

    public static void initDriver() throws Exception {
        if(Objects.isNull(getDriver())){
        System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromeDriverPath());
        setDriver(new ChromeDriver());
            getDriver().get(ReadFileProperties.getValue("url"));
        }
    }
    public static void quitDriver(){
        if(Objects.nonNull(getDriver())) {
            getDriver().quit();
            unload();
        }
    }
}

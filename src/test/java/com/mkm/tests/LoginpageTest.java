package com.mkm.tests;

import com.mkm.drivers.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.ITestListener;
import org.testng.TestListenerAdapter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({TestListenerAdapter.class})
public final class LoginpageTest extends BaseTest{
    private LoginpageTest(){
            }

    @Test(description = "searching for selenium test in google page")
    public void test1(){
        DriverManager.getDriver().findElement(By.name("q")).sendKeys("selenium", Keys.ENTER);

    }
}

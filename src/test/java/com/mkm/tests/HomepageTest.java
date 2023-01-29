package com.mkm.tests;

import com.mkm.drivers.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public final class HomepageTest extends BaseTest {
    private HomepageTest(){
            }
    @Test
    public void test2(){
        DriverManager.getDriver().findElement(By.name("q")).sendKeys("Automation", Keys.ENTER);
    }
}

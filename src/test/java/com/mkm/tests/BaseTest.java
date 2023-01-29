package com.mkm.tests;

import com.mkm.drivers.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.logging.Logger;

public class BaseTest {
    protected BaseTest(){
            }

    @BeforeMethod
    public void setUp() throws Exception {
    Driver.initDriver();
    }

    @Test
    public void print(){
        System.out.println( "BaseTest");
    }

    @AfterMethod
    public void tearDown(){
        Driver.quitDriver();
    }
}

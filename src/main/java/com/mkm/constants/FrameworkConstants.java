package com.mkm.constants;

public final class FrameworkConstants {
    private FrameworkConstants(){
    }

    public static String getChromeDriverPath() {
        return CHROMEDRIVERPATH;
    }

    private static final String CHROMEDRIVERPATH="src/test/resources/drivers/chromedriver.exe";
}

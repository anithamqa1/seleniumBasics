package com.mkm.utils;

import java.io.FileInputStream;
import java.util.Objects;
import java.util.Properties;

public final class ReadFileProperties {
    private ReadFileProperties(){
            }
    public static String getValue(String key) throws Exception {
        Properties properties=new Properties();
        FileInputStream fileInputStream=new FileInputStream("src/test/resources/config/config.properties");
        properties.load(fileInputStream);
        String value=properties.getProperty(key);
        if(Objects.isNull(value)){
            throw new Exception("Property Name"+key+"is not found.Please check config.properties");
        }
        return value;

    }
}

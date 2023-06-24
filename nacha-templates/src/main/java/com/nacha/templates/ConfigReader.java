package com.nacha.templates;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
        final static String basePath = "C:\\Users\\u725561\\p2go\\poc\\nacha-templates-testing\\nacha-templates\\src\\main\\resources";
        public static Properties readConfig(String fileName) {
        Properties properties = new Properties();
        String finalPath = basePath + "\\"  + fileName;
        try (InputStream input = new FileInputStream(finalPath)) {
            properties.load(input);     
        }
        catch(Exception e) {
            System.out.println("exception while reading config "+ fileName);
            System.out.println(" exception "+e);
        }
        return properties;
    }
}

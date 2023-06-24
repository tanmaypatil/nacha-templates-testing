package com.nacha.templates;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Properties pr = ConfigReader.readConfig("nacha.properties");
        String effDate = pr.getProperty("effective_date");
        System.out.println("effDate is "+effDate);
        FreeMarker freeMarker = new FreeMarker();
        freeMarker.initialiseFreeMarker();
        HashMap root = new HashMap();
        root.put("user", "Big Joe");
        Product latest = new Product();
        latest.setUrl("products/greenmouse.html");
        latest.setName("green mouse");
        root.put("latestProduct", latest);
        boolean result = freeMarker.processTemplateAndWrite("test.ftlh", root);
        // write to a file 
        result = freeMarker.processTemplateAndWriteFile("test.ftlh", root);

    }
}

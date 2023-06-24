package com.nacha.templates;

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

    }
}

package com.nacha.templates;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals(1, 1);
    }

    @DisplayName("Just a simple test to generate html file using freemarker.")
    @Test
    void generateHtmlFile() {
        FreeMarker freeMarker = new FreeMarker();
        freeMarker.initialiseFreeMarker();
        HashMap root = new HashMap();
        root.put("user", "Big Joe");
        Product latest = new Product();
        latest.setUrl("products/greenmouse.html");
        latest.setName("green mouse");
        root.put("latestProduct", latest);
        // write to a file 
        boolean result = freeMarker.processTemplateAndWriteFile("test.ftlh", root);
        Assertions.assertTrue(result);

    }
}

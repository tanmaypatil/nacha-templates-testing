package com.nacha.templates;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;


import java.util.HashMap;

/**
 * Unit test for simple App.
 */
@TestInstance(Lifecycle.PER_CLASS)
class AppTest {
    FreeMarker freeMarker = new FreeMarker();
   
    @BeforeAll
    public void init() {
        freeMarker.initialiseFreeMarker();

    }

    @DisplayName("Just a simple test to generate html file using freemarker.")
    @Test
    void generateHtmlFile() {

        HashMap root = new HashMap();
        root.put("user", "Big Joe");
        Product latest = new Product();
        latest.setUrl("products/greenmouse.html");
        latest.setName("green mouse");
        root.put("latestProduct", latest);
        // write to a file
        boolean result = freeMarker.processTemplateAndWriteFile("test.ftlh", root, "response2.out");
        Assertions.assertTrue(result);
    }

    @DisplayName("NACHA ppd file generation , replace effective date ")
    @Test
    void generateNachaFile() {
        HashMap<String, Object> root = new HashMap<String, Object>();
        root.put("user", "Big Joe");
        NachaConfig nacha = new NachaConfig();
        nacha.setEffDate("210212");
        root.put("nachaConfig", nacha);
        // write to a file
        boolean result = freeMarker.processTemplateAndWriteFile("nacha_customer_CT_PPD.ftl", root, "nacha_ct_ppd.ach");
        Assertions.assertTrue(result);
    }

    @DisplayName("xml file generation")
    @Test
    void generateSepaFile() {

        HashMap<String, Object> root = new HashMap<String, Object>();
        root.put("user", "Big Joe");
        SepaConfig sepa = new SepaConfig();
        sepa.setBic("DHEUDHEU");
        root.put("sepaConfig", sepa);
        // write to a file
        boolean result = freeMarker.processTemplateAndWriteFile("camt029.ftl", root, "camt029.xml");
        Assertions.assertTrue(result);
    }

    @DisplayName("converting decimal to 2 digits as string")
    @Test
    void convert() {
        String s = String.format("%02d",2);
        Assertions.assertEquals("02", s);
        s = String.format("%02d",12);
        Assertions.assertEquals("12", s);
    }

    @DisplayName("generate nacha file with parameterised file header")
    @Test
    void generateNachaFileWithHeaderInput() {
        HashMap<String, Object> root = new HashMap<String, Object>();
        String immDest = " 121057262" ;//04-13 
        String immOrigin = "2786786786"; //14-23
        String fileCreDate = "230704" ;//24-29 
        NachaConfig nc = new NachaConfig(immDest, immOrigin, fileCreDate);
        root.put("nachaConfig", nc);
        // write to a file
        boolean result = freeMarker.processTemplateAndWriteFile("nacha_ccd.ftl", root, "nacha_ct_ccd.ach");
        Assertions.assertTrue(result);

    }
}

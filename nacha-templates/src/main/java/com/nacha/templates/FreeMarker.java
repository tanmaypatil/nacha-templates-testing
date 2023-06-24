package com.nacha.templates;

import java.io.File;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.TimeZone;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateExceptionHandler;

public class FreeMarker {
    Configuration cfg = null;

    public Configuration initialiseFreeMarker() {
        try {
            cfg = new Configuration(Configuration.VERSION_2_3_32);
            cfg.setDirectoryForTemplateLoading(new File(ResourcePath.basePath));
            // Recommended settings for new projects:
            cfg.setDefaultEncoding("UTF-8");
            cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
            cfg.setLogTemplateExceptions(false);
            cfg.setWrapUncheckedExceptions(true);
            cfg.setFallbackOnNullLoopVariable(false);
            cfg.setSQLDateAndTimeTimeZone(TimeZone.getDefault());
        } catch (Exception e) {
            System.out.println("Exception is e" + e);
        }
        return cfg;
    }

    public boolean processTemplateAndWrite(String templateFile, HashMap params) {
        try {
            Template temp = cfg.getTemplate(templateFile);
            /* Merge data-model with template */
            Writer out = new OutputStreamWriter(System.out);
            temp.process(params, out);
        } catch (Exception e) {
            System.out.println("Exception is e" + e);

        }

        return true;

    }
}

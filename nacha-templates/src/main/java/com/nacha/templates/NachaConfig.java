package com.nacha.templates;

public class NachaConfig {
    FileHeader fh;
    public FileHeader getFh() {
        return fh;
    }

    String effDate;
    public void setEffDate(String effDate) {
        this.effDate = effDate;
    }

    public String getEffDate() {
        return effDate;
    }

    
    public NachaConfig() {
      
    }

    public NachaConfig(String immDest , String immOrig , 
    String fileCreDate) {   
       fh = new FileHeader(immDest, immOrig, fileCreDate) ;
    }
    
    

}

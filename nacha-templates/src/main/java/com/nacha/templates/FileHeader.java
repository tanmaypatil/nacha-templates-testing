package com.nacha.templates;

public class FileHeader {
    String immDest;
    String immOrig;
    String fileCreDate;
    String fileCreTime;
    public String getImmDest() {
        return immDest;
    }

    public String getImmOrig() {
        return immOrig;
    }

    public String getFileCreDate() {
        return fileCreDate;
    }

    public String getFileCreTime() {
        return fileCreTime;
    }

    

    private void init() {
        int hh = Utils.getRandomNumberInRange(0, 60);
        int mm = Utils.getRandomNumberInRange(0, 60);
        this.fileCreTime = String.format(String.valueOf(hh), "%02d") + String.format(String.valueOf(mm), "%02d");
    }

    public FileHeader(String immDest, String immOrig,
            String fileCreDate) {
        init();
        this.immDest = immDest;
        this.immOrig = immOrig;
        this.fileCreDate = fileCreDate;

    }

  
    public void setImmDest(String immDest) {
        this.immDest = immDest;
    }

    public void setImmOrig(String immOrig) {
        this.immOrig = immOrig;
    }

    public void setFileCreDate(String fileCreDate) {
        this.fileCreDate = fileCreDate;
    }

    public void setFileCreTime(String fileCreTime) {
        this.fileCreTime = fileCreTime;
    }

}

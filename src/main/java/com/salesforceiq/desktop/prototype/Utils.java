package com.salesforceiq.desktop.prototype;

public class Utils {

    public static void pause(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        }
        catch (Exception e) {}
    }
}

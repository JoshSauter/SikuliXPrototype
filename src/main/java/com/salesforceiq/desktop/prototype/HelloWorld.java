package com.salesforceiq.desktop.prototype;

import org.sikuli.basics.Settings;
import org.sikuli.script.*;
import org.sikuli.util.SysJNA;

public class HelloWorld {

    public static void main(String[] args) throws FindFailed {
        ImagePath.add("src/main/resources/images");
        Settings.MinSimilarity = .7;
        System.out.println(ImagePath.getPaths());

        App safari = App.open("/Applications/Safari.app");
        Utils.pause(2000);

        App.focus("Safari");
        Match addressBar = App.focusedWindow().find("AddressBar.png");
        addressBar.click();
        addressBar.type("www.google.com" + Key.ENTER);
        Utils.pause(1000);
        Match googleSearch = App.focusedWindow().find("GoogleSearch.png");
        googleSearch.click();
        googleSearch.type("How do I use SikuliX to automate a Google search?" + Key.ENTER);
        Utils.pause(5000);
        safari.close();
    }
}
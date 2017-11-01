package com.designpatterns.abstractfactory;

/**
 * Platform Enum
 */
public enum Platform {

    MACOSX("com.designpatterns.abstractfactory.MacOSXWidgetFactory"),
    WINDOWS("com.designpatterns.abstractfactory.MSWindowsWidgetFactory");

    private String platform;

    private Platform(String platform) {
        this.platform = platform;
    }

    public String getPlatform() {
        return this.platform;
    }
}

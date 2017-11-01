package com.designpatterns.abstractfactory;

/**
 * Class to create the GUI Window
 */
public class GUI {

    public static void main(String[] args)
        throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        GUIBuilder builder = new GUIBuilder();

        // Mac OSX Widget
        AbstractWidgetFactory macWidgetFactory =
            (AbstractWidgetFactory)Class.forName(Platform.valueOf("MACOSX").getPlatform()).newInstance();
        builder.buildWindow(macWidgetFactory);

        // Windows Widget
        AbstractWidgetFactory windowWidgetFactory =
            (AbstractWidgetFactory)Class.forName(Platform.valueOf("WINDOWS").getPlatform()).newInstance();
        builder.buildWindow(windowWidgetFactory);

    }
}

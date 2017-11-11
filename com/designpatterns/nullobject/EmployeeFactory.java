package com.designpatterns.nullobject;

/**
 * Employee Factory Class
 */
public class EmployeeFactory {

    private static final String[] names = {
            "Duke",
            "Vincent",
            "Lucy"
    };

    public static AbstractEmployee getCustomer(String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                return new Programmer(name);
            }
        }
        return new NullCustomer();
    }
}

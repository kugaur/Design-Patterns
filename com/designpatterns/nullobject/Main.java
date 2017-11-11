package com.designpatterns.nullobject;

/**
 * Main Class
 */
public class Main {

    public static void main(String[] args) {
        AbstractEmployee emp1 = EmployeeFactory.getCustomer("Duke");
        AbstractEmployee emp2 = EmployeeFactory.getCustomer("Lucy");
        AbstractEmployee emp3 = EmployeeFactory.getCustomer("Vincent");
        AbstractEmployee emp4 = EmployeeFactory.getCustomer("Sam");

        System.out.println(emp1.getName());
        System.out.println(emp2.getName());
        System.out.println(emp3.getName());
        System.out.println(emp4.getName());
    }
}

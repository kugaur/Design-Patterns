package com.designpatterns.prototype;

/**
 * Class for Prototype Demo
 */
public class PrototypeDemo {

    public static void main(String[] args) {
        EmployeeRecord employeeRecord = new EmployeeRecord(123, "Sam", "Developer", 123412.12, "New York");
        employeeRecord.showRecord();

        EmployeeRecord clonedEmployeeRecord = (EmployeeRecord)employeeRecord.clone();
        clonedEmployeeRecord.showRecord();
    }
}

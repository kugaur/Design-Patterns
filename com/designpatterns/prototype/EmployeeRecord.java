package com.designpatterns.prototype;

/**
 * Implementation for Employee Record
 */
public class EmployeeRecord implements Prototype {

    private int id;
    private String name, designation;
    private double salary;
    private String address;

    public EmployeeRecord() {
    }

    public EmployeeRecord(int id, String name, String designation, double salary, String address) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.address = address;
    }

    @Override
    public Prototype clone() {
        return new EmployeeRecord(id, name, designation, salary, address);
    }

    public void showRecord() {
        System.out.println("ID: " + id + " Name: " + name + " Designation: " + designation +
            " Salary: " + salary + " Address: " + address);
    }
}

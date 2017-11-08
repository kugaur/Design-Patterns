package com.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for Company Director 
 */
public class CompanyDirector implements Employee {

    private List<Employee> employeeList;

    public CompanyDirector() {
        employeeList = new ArrayList<Employee>();
    }

    @Override
    public void showEmployeeDetails() {
        for (Employee emp : employeeList) {
            emp.showEmployeeDetails();
        }
    }

    public void adddEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }

}

package com.designpatterns.composite;

/**
 * Driver Class
 */
public class Company {

    public static void main(String[] args) {
        Developer dev1 = new Developer("Dev", 21L, "Beginner");
        Developer dev2 = new Developer("Sam", 22L, "Pro");
        CompanyDirector director1 = new CompanyDirector();
        director1.adddEmployee(dev1);
        director1.adddEmployee(dev2);

        Manager man1 = new Manager("Vishal", 31L, "Manager");
        Manager man2 = new Manager("Vincent", 32L, "Senior Manager");
        CompanyDirector director2 = new CompanyDirector();
        director2.adddEmployee(man1);
        director2.adddEmployee(man2);

        CompanyDirector director = new CompanyDirector();
        director2.adddEmployee(director1);
        director2.adddEmployee(director2);

        director.showEmployeeDetails();

    }
}

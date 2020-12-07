package com.test;

import com.practice.Employee;

public class EmployeeTest  {


    public static void main(String[] args){
        Employee employeeFirst=new Employee("Rohit");
        Employee employeeSecond= new Employee("Surbhi");
        employeeFirst.setAge(28);
        employeeFirst.setDesignation("Senior Associate");
        employeeFirst.setSalary(70000);

        employeeSecond.setSalary(300000);
        employeeSecond.setDesignation("VP");
        employeeSecond.setAge(27);

        employeeFirst.printEmployeeDetails();
        employeeSecond.printEmployeeDetails();
//        System.out.println(age);

    }
}

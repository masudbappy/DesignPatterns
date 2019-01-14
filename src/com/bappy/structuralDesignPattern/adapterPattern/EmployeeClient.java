package com.bappy.structuralDesignPattern.adapterPattern;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
    public List<Employee> getEmployees() {

        List<Employee> employees = new ArrayList<>();
        Employee employeeFromDB = new EmployeeDB("123", "jhon", "whick", "jhon@gamil.com");
        employees.add(employeeFromDB);

        EmployeeLdap employeeFromLdap = new EmployeeLdap("333","masud","bappy","bappy@gmail.com");
        employees.add(new EmployeeAdapterLdap(employeeFromLdap));

        EmployeeCSV employeeFromCSV = new EmployeeCSV("12345,sherlock,homes,sherloc@gmail.com");
        employees.add(new EmployeeAdapterCSV(employeeFromCSV));

        return employees;
    }
}

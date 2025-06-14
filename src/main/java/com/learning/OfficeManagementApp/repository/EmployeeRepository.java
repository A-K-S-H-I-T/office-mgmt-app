package com.learning.OfficeManagementApp.repository;

import com.learning.OfficeManagementApp.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class EmployeeRepository {

    //hashmap as db
    final HashMap<Integer, Employee> empDb = new HashMap<>();

    public void addEmployee(Employee employee) {
        empDb.put(employee.getEmp_id(), employee);
    }

    public Employee getEmployee(int employeeId) {
        return empDb.get(employeeId);
    }

    public void deleteEmployee(int employeeId) {
        empDb.remove(employeeId);
    }

    public Employee updateSalary(int employeeId, int newSalary) {
        Employee employee = empDb.get(employeeId);
        employee.setSalary(newSalary);
        return employee;
    }

    public Employee getHighestSalaryEmployee(){
        int maxSalary = 0;
        Employee highestSalaryEmployee = null;
        for(int employeeId : empDb.keySet()){
            Employee currEmployee = empDb.get(employeeId);
            if(currEmployee.getSalary() > maxSalary) {
                maxSalary = currEmployee.getSalary();
                highestSalaryEmployee = currEmployee;
            }
        }
        return highestSalaryEmployee;
    }
}

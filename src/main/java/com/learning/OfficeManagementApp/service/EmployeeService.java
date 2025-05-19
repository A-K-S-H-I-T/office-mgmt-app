package com.learning.OfficeManagementApp.service;

import com.learning.OfficeManagementApp.model.Employee;
import com.learning.OfficeManagementApp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    /*
    Service class is depending on some other class (Repository class)
    Repository class is a dependency for service class
    We have injected the repository class to service class this is an example of Dependency Injection.
    How -> (by using @Autowired)
    */

    @Autowired
    private EmployeeRepository employeeRepository;

    public void addEmployee(Employee employee){
        employee.setAge(employee.getAge() + 5);
        employeeRepository.addEmployee(employee);
    }

    public Employee getEmployee(int employeeId){
        return employeeRepository.getEmployee(employeeId);
    }

    public void deleteEmployee(int employeeId) {
        employeeRepository.deleteEmployee(employeeId);
    }

    public Employee updateSalary(int employeeId, int newSalary) {
        return employeeRepository.updateSalary(employeeId, newSalary);
    }

    public Employee getHighestSalaryEmployee(){
        return employeeRepository.getHighestSalaryEmployee();
    }
}

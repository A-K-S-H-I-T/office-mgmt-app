package com.learning.OfficeManagementApp.controller;

import com.learning.OfficeManagementApp.model.Employee;
import com.learning.OfficeManagementApp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/add-employee")
    public String addEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
        return "Employee added successfully!!";
    }

    @GetMapping("/get-employee")
    public Employee getEmployee(@RequestParam("id") int employee_id){
        return employeeService.getEmployee(employee_id);
    }

    @DeleteMapping("/delete-employee/{id}")
    public String deleteEmployee(@PathVariable("id") int employee_id){
        employeeService.deleteEmployee(employee_id);
        return "Employee deleted successfully!!";
    }

    @PutMapping("/update-salary")
    public Employee updateSalary(@RequestParam("id") int employeeId, @RequestParam("new-salary") int newSalary ){
        return employeeService.updateSalary(employeeId, newSalary);
    }
}

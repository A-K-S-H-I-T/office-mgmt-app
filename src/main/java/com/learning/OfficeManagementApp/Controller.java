package com.learning.OfficeManagementApp;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class Controller {

    //hashmap as db
    private HashMap<Integer,Employee> empDb = new HashMap<>();

    @PostMapping("/add-employee")
    public String addEmployee(@RequestBody Employee employee){
        empDb.put(employee.getEmp_id(), employee);
        return "Employee added successfully!!";
    }

    @GetMapping("/get-employee")
    public Employee getEmployee(@RequestParam("id") int employee_id){
        return empDb.get(employee_id);
    }

    @DeleteMapping("/delete-employee/{id}")
    public String deleteEmployee(@PathVariable("id") int employee_id){
        empDb.remove(employee_id);
        return "Employee deleted successfully!!";
    }
}

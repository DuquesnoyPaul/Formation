package com.openclassrooms.HRapi.controller;

import com.openclassrooms.HRapi.model.Employee;
import com.openclassrooms.HRapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * Read - Get all employees
     * @return - An Iterable object of Employee fulfilled
     */
    @GetMapping("/employees")
    public Iterable<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @DeleteMapping("/employee/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }

    @PostMapping("/employee")
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @PutMapping("/employee/{id}")
    public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
        Optional<Employee> existingEmployee = employeeService.getEmployee(id);

        if (existingEmployee.isPresent()) {
            Employee currentEmployee = existingEmployee.get();

            // Met à jour uniquement les champs nécessaires
            currentEmployee.setFirstName(employee.getFirstName());
            currentEmployee.setLastName(employee.getLastName());
            currentEmployee.setMail(employee.getMail());
            currentEmployee.setPassword(employee.getPassword());

            return employeeService.saveEmployee(currentEmployee);
        } else {
            throw new RuntimeException("Employee with id " + id + " not found");
        }
    }


}
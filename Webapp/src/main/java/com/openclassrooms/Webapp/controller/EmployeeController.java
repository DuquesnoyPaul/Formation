package com.openclassrooms.Webapp.controller;

import com.openclassrooms.Webapp.model.Employee;
import com.openclassrooms.Webapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/")
    public String home(Model model) {
        Iterable<Employee> listEmployee = employeeService.getEmployees();
        model.addAttribute("employees", listEmployee);
        model.addAttribute("employee", new Employee());

        return "home";
    }

    @GetMapping("/deleteEmployee/{id}")
    public ModelAndView deleteEmployee(@PathVariable("id") final Long id) {
        employeeService.deleteEmployee(id);
        return new ModelAndView("redirect:/");
    }

    @PostMapping("/saveEmployee")
    public ModelAndView saveEmployee(@ModelAttribute Employee employee) {
        employeeService.saveEmployee(employee);
        return new ModelAndView("redirect:/");
    }

}
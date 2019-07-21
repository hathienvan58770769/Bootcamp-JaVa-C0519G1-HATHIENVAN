package com.codegym.employees.controller;

import com.codegym.employees.entity.Employee;
import com.codegym.employees.exception.ResourceNotFoundException;
import com.codegym.employees.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

/*
if(search.isPresent()){
            theEmployees = employeeService.findAllByIdContaining(search.get());
            theEmployees = employeeService.findAllByFullNameContaining(search.get());
        } else {
            theEmployees = employeeService.findAllByIdContaining(0);
            theEmployees = employeeService.findAllByFullNameContaining("full name not found");
        }
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {

    private static final Logger LOG = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService employeeService;


    @GetMapping(value = {"/list","/"})
    public String listEmployees(Model theModel) {
        Iterable<Employee> theEmployees = employeeService.getEmployees();
        theModel.addAttribute("employees", theEmployees);
        return "/employee/list-employee";
    }

    @GetMapping("/showForm")
    public String showFormForAdd(Model theModel) {
        LOG.debug("inside show employee-form handler method");
        Employee theEmployee = new Employee();
        theModel.addAttribute("employee", theEmployee);
        return "employee/create";
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee theEmployee) {
        employeeService.saveEmployee(theEmployee);
        return "redirect:/employee/";
    }

    @GetMapping("/update")
    public String showFormForUpdate(@RequestParam("id") int theId,
                                    Model theModel) throws ResourceNotFoundException {
        Employee theEmployee = employeeService.getEmployee(theId);
        theModel.addAttribute("employee", theEmployee);
        return "employee/edit";
    }

    @PostMapping("/update")
    public String updateEmployee(@ModelAttribute("employee") Employee theEmployee){
        employeeService.saveEmployee(theEmployee);
        return "redirect:/employee/";
    }
    @GetMapping("/delete")
    public String deleteEmployee(@RequestParam("id") int theId) throws ResourceNotFoundException {
        employeeService.deleteEmployee(theId);
        return "redirect:/employee/";
    }
}
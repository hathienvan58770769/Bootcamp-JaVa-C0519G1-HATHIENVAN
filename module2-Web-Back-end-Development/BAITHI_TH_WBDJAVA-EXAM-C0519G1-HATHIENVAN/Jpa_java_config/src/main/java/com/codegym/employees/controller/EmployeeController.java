package com.codegym.employees.controller;

import com.codegym.employees.entity.Employee;
import com.codegym.employees.exception.ResourceNotFoundException;
import com.codegym.employees.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    private static final Logger LOG = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService employeeService;


    @GetMapping(value = {"/list","/"})
    public ModelAndView listCustomers(@RequestParam("s") Optional<String> s, Pageable pageable) {
        Page<Employee> employees;
        if(s.isPresent()){
            employees = employeeService.findAllByFullNameContaining(s.get(), pageable);
        } else {
            employees = employeeService.findAll(pageable);
        }
        ModelAndView modelAndView = new ModelAndView("employee/list-employee");
        modelAndView.addObject("employees", employees);
        return modelAndView;
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
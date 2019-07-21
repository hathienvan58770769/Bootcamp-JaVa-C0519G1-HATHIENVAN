package com.codegym.cms.controller;

import java.util.List;

import com.codegym.cms.entity.Customer;
import com.codegym.cms.entity.Province;
import com.codegym.cms.exception.ResourceNotFoundException;
import com.codegym.cms.service.CustomerService;
import com.codegym.cms.service.ProvinceService;
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


@Controller
@RequestMapping("/customer")
public class CustomerController {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ProvinceService provinceService;

    @ModelAttribute("provinces")
    public Iterable<Province> provinces(){
        return provinceService.findAll();
    }

    @GetMapping(value = {"/list","/"})
    public String listCustomers(Model theModel) {
        Iterable <Customer> theCustomers = customerService.getCustomers();
        theModel.addAttribute("customers", theCustomers);
        return "/customer/list-customer";
    }

    @GetMapping("/showForm")
    public String showFormForAdd(Model theModel) {
        LOG.debug("inside show customer-form handler method");
        Customer theCustomer = new Customer();
        theModel.addAttribute("customer", theCustomer);
        return "customer/create";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer theCustomer) {
        customerService.saveCustomer(theCustomer);
        return "redirect:/customer/";
    }

    @GetMapping("/update")
    public String showFormForUpdate(@RequestParam("id") int theId,
                                    Model theModel) throws ResourceNotFoundException {
        Customer theCustomer = customerService.getCustomer(theId);
        theModel.addAttribute("customer", theCustomer);
        return "customer/edit";
    }

    @PostMapping("/update")
    public String updateCustomer(@ModelAttribute("customer") Customer theCustomer){
        customerService.saveCustomer(theCustomer);
        return "redirect:/customer/";
    }
    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam("id") int theId) throws ResourceNotFoundException {
        customerService.deleteCustomer(theId);
        return "redirect:/customer/";
    }
}
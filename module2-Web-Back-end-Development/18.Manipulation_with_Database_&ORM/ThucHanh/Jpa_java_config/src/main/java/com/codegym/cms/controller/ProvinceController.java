package com.codegym.cms.controller;

import com.codegym.cms.entity.Customer;
import com.codegym.cms.entity.Province;
import com.codegym.cms.exception.ResourceNotFoundException;
import com.codegym.cms.service.ProvinceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/province")
public class ProvinceController {

    private static final Logger LOG = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private ProvinceService provinceService;

    @GetMapping("/list")
    public String listProvinces(Model theModel) {
        List<Province> theProvinces = provinceService.getProvinces();
        theModel.addAttribute("provinces", theProvinces);
        return "list-provinces";
    }

    @GetMapping("/showForm")
    public String showFormForAdd(Model theModel) {
        LOG.debug("inside show province-form handler method");
        Province theProvince = new Province();
        theModel.addAttribute("province", theProvince);
        return "province-form";
    }

    @PostMapping("/saveProvince")
    public String saveProvince(@ModelAttribute("province") Province theProvince) {
        provinceService.saveProvince(theProvince);
        return "redirect:/customer/list";
    }

    @GetMapping("/updateForm")
    public String showFormForUpdate(@RequestParam("provinceId") int theId,
                                    Model theModel) throws ResourceNotFoundException {
        Province theProvince = provinceService.getProvince(theId);
        theModel.addAttribute("province", theProvince);
        return "province-form";
    }

    @GetMapping("/delete")
    public String deleteProvince(@RequestParam("provinceId") int theId) throws ResourceNotFoundException {
        provinceService.deleteProvince(theId);
        return "redirect:/province/list";
    }
}

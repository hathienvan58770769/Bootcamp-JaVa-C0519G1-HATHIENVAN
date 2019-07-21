package com.codegym.cms.service;

import com.codegym.cms.entity.Customer;
import com.codegym.cms.exception.ResourceNotFoundException;

import java.util.List;



public interface CustomerService {

    public List <Customer> getCustomers();

    public void saveCustomer(Customer theCustomer);

    public Customer getCustomer(int theId) throws ResourceNotFoundException;

    public void deleteCustomer(int theId) throws ResourceNotFoundException;
}
package com.codegym.employees.service;

import com.codegym.employees.entity.Employee;
import com.codegym.employees.exception.ResourceNotFoundException;


public interface EmployeeService {

    public Iterable <Employee> getEmployees();

    public Iterable<Employee> findAll();

    public Iterable<Employee> findAllByIdContaining(int id);

    public Iterable<Employee> findAllByFullNameContaining(String fullName);

    public void saveEmployee(Employee theEmployee);

    public Employee getEmployee(int theId) throws ResourceNotFoundException;

    public void deleteEmployee(int theId) throws ResourceNotFoundException;
}
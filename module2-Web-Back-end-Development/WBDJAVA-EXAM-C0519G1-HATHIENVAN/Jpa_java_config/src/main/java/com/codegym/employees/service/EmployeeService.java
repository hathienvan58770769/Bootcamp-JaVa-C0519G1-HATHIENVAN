package com.codegym.employees.service;

import com.codegym.employees.entity.Employee;
import com.codegym.employees.exception.ResourceNotFoundException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface EmployeeService {

    public Page<Employee> getEmployees(Pageable pageable);

    public Page<Employee> findAll(Pageable pageable);
    public Page<Employee> findAllByIdContaining(int id,Pageable pageable);

    public Page<Employee> findAllByFullNameContaining(String fullName,Pageable pageable);
    /*
     public Page<Employee> findAllByIdOrFullNameContaining(int id,String fullName,Pageable pageable);

*/

    public void saveEmployee(Employee theEmployee);

    public Employee getEmployee(int theId) throws ResourceNotFoundException;

    public void deleteEmployee(int theId) throws ResourceNotFoundException;
}
package com.codegym.employees.service;

import com.codegym.employees.entity.Employee;
import com.codegym.employees.exception.ResourceNotFoundException;
import com.codegym.employees.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Qualifier("employeeRepository")
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    @Transactional
    public Iterable <Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    @Transactional
    public Iterable<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    @Transactional
    public Iterable<Employee> findAllByIdContaining(int id) {
       return employeeRepository.findAllByIdContaining(id);
    }
    @Override
    @Transactional
    public Iterable<Employee> findAllByFullNameContaining(String fullName) {
        return employeeRepository.findAllByFullNameContaining(fullName);
    }

    @Override
    @Transactional
    public void saveEmployee(Employee theEmployee) {
        employeeRepository.save(theEmployee);
    }

    @Override
    @Transactional
    public Employee getEmployee(int id) throws ResourceNotFoundException {
        return employeeRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException(id));
    }


    @Override
    @Transactional
    public void deleteEmployee(int theId) {
        employeeRepository.deleteById(theId);
    }
}
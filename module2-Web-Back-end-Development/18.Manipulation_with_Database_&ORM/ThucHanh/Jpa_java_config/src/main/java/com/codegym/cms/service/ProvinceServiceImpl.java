package com.codegym.cms.service;

import java.util.List;

import com.codegym.cms.entity.Province;
import com.codegym.cms.exception.ResourceNotFoundException;
import com.codegym.cms.repository.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service
public class ProvinceServiceImpl implements ProvinceService {

    @Qualifier("provinceRepository")
    @Autowired
    private ProvinceRepository provinceRepository;

    @Override
    @Transactional
    public List <Province> getProvinces() {
        return provinceRepository.findAll();
    }

    @Override
    @Transactional
    public void saveProvince(Province theProvince) {
        provinceRepository.save(theProvince);
    }

    @Override
    @Transactional
    public Province getProvince(int id) throws ResourceNotFoundException {
        return provinceRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException(id));
    }

    @Override
    @Transactional
    public void deleteProvince(int theId) {
        provinceRepository.deleteById(theId);
    }
}

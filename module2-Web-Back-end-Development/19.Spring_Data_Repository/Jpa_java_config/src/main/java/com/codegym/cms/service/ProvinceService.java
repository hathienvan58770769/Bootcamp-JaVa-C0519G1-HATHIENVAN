package com.codegym.cms.service;

import com.codegym.cms.entity.Province;
import com.codegym.cms.exception.ResourceNotFoundException;

public interface ProvinceService {
    Iterable<Province> findAll();

    Province findById(Long id) throws ResourceNotFoundException;

    void save(Province province);

    void remove(Long id);
}
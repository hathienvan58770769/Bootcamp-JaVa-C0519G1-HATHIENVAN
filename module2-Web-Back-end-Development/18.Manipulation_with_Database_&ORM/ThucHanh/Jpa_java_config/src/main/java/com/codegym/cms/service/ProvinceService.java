package com.codegym.cms.service;


import com.codegym.cms.entity.Province;
import com.codegym.cms.exception.ResourceNotFoundException;

import java.util.List;

public interface ProvinceService {
    public List<Province> getProvinces();

    public void saveProvince(Province theProvince);

    public Province getProvince(int theId) throws ResourceNotFoundException;

    public void deleteProvince(int theId) throws ResourceNotFoundException;
}

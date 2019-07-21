package com.codegym.cms.repository;

import com.codegym.cms.entity.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("provinceRepository")
public interface ProvinceRepository extends JpaRepository<Province, Integer> {
}

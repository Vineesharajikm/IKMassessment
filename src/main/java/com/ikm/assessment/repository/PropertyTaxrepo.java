package com.ikm.assessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ikm.assessment.model.PropertyTax;

public interface PropertyTaxrepo extends JpaRepository<PropertyTax,Long>{
    
}

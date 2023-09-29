package com.ikm.assessment.service;

import javax.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.ikm.assessment.contract.PropertyTaxDTo;
import com.ikm.assessment.model.PropertyTax;
import com.ikm.assessment.repository.PropertyTaxrepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PropertyTaxService {
private final PropertyTaxrepo repo;
    public Object addNewGrievance(@Valid PropertyTaxDTo request) {
        ModelMapper mapper=new ModelMapper();
        PropertyTax model = mapper.map(request,  PropertyTax.class);
        PropertyTax savedgrievance   = repo.save(model);
        return savedgrievance;
    }
    
}

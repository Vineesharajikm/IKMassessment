package com.ikm.assessment.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ikm.assessment.contract.PropertyTaxDTo;
import com.ikm.assessment.service.PropertyTaxService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class PropertyTaxController {
    private final PropertyTaxService service;

    @PostMapping("/grievance")
    public ResponseEntity<?> create(@Valid @RequestBody PropertyTaxDTo request) {
        Object output = service.addNewGrievance(request);

        return ResponseEntity.status(HttpStatus.CREATED).body(output);

    }

}

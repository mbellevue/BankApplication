package com.learning.controller;

import com.learning.entity.Beneficary;
import com.learning.service.BeneficiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    private BeneficiaryService beneficiaryService;

    @GetMapping("/beneficiary")
    public ResponseEntity<List<Beneficary>> getApprovedBenefifiary(){
        return new ResponseEntity<List<Beneficary>> (beneficiaryService.findByIsApproved("Yes"), HttpStatus.OK);
    }
}

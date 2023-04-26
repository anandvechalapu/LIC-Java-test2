package com.Sacral.ai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Sacral.ai.service.PolicyServicingCommonService;
import com.Sacral.ai.dto.PolicyServiceDto;

@RestController
@RequestMapping("/policy-service-controller")
public class PolicyServicingCommonController {

    @Autowired
    private PolicyServicingCommonService policyServicingCommonService;

    @PostMapping("/generate-service-id")
    public Long generateServiceId(@RequestBody PolicyServiceDto policyServiceDto) throws IllegalArgumentException {
        return policyServicingCommonService.generateServiceId(policyServiceDto);
    }

}
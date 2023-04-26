package com.Sacral.ai.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.Sacral.ai.model.PolicyServiceEntity;
import com.Sacral.ai.repository.PolicyServicingCommonRepository;
import com.Sacral.ai.dto.PolicyServiceDto;

/**
 * Service class to manage PolicyServiceEntity objects
 */
@Service
public class PolicyServicingCommonService {

    @Autowired
    private PolicyServicingCommonRepository policyServicingCommonRepository;

    /**
     * Method to generate a new service ID for a policy service
     *
     * @param policyServiceDto contains the policyId, serviceType, serviceEffectiveDate, requestReceivedDate, createdBy and serviceDoneBy
     * @return the generated service ID
     * @throws IllegalArgumentException if an error occurs while generating the service ID
     */
    public Long generateServiceId(PolicyServiceDto policyServiceDto) throws IllegalArgumentException {
        PolicyServiceEntity policyServiceEntity = policyServicingCommonRepository.generateServiceId(policyServiceDto);
        return policyServicingCommonRepository.save(policyServiceEntity).getServiceId();
    }

    /**
     * Method to get the sequence for the service number
     *
     * @return the sequence for the service number
     */
    public Long getSequence() {
        return policyServicingCommonRepository.getSequence();
    }

    /**
     * Method to get the PolicyServiceEntity object by its ID
     *
     * @param serviceId the ID of the PolicyServiceEntity
     * @return an Optional object containing the PolicyServiceEntity object, or an empty Optional if the object doesn't exist
     */
    public Optional<PolicyServiceEntity> getPolicyServiceEntityById(Long serviceId) {
        return policyServicingCommonRepository.findById(serviceId);
    }

}
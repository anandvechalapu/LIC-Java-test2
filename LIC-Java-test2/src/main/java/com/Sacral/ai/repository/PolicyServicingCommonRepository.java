package com.Sacral.ai.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Sacral.ai.model.PolicyServiceEntity;

/**
 * Repository to manage PolicyServiceEntity objects
 */
@Repository
public interface PolicyServicingCommonRepository extends JpaRepository<PolicyServiceEntity, Long> {

    /**
     * Method to generate a new service ID for a policy service
     *
     * @param policyServiceDto contains the policyId, serviceType, serviceEffectiveDate, requestReceivedDate, createdBy and serviceDoneBy
     * @return the generated service ID
     * @throws IllegalArgumentException if an error occurs while generating the service ID
     */
    PolicyServiceEntity generateServiceId(PolicyServiceDto policyServiceDto) throws IllegalArgumentException;

    /**
     * Method to get the sequence for the service number
     *
     * @return the sequence for the service number
     */
    Long getSequence();

}
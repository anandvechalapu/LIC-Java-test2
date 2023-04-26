package com.Sacral.ai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PolicyServiceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long policyId;
    private String serviceType;
    private String serviceEffectiveDate;
    private String requestReceivedDate;
    private String createdBy;
    private String serviceDoneBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getServiceEffectiveDate() {
        return serviceEffectiveDate;
    }

    public void setServiceEffectiveDate(String serviceEffectiveDate) {
        this.serviceEffectiveDate = serviceEffectiveDate;
    }

    public String getRequestReceivedDate() {
        return requestReceivedDate;
    }

    public void setRequestReceivedDate(String requestReceivedDate) {
        this.requestReceivedDate = requestReceivedDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getServiceDoneBy() {
        return serviceDoneBy;
    }

    public void setServiceDoneBy(String serviceDoneBy) {
        this.serviceDoneBy = serviceDoneBy;
    }
}
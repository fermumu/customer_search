package com.customer_data_consultant.domain.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String customerId;
    private String nationalityId;
    private String genderId;
    private String identityDocument;
    private Integer identityDocumentNumber;
    private String identityDocumentTypeId;

    public Customers() {
        //EMPTY CONSTRUCTOR
    }

    public Customers(
            Long id,
            String firstName,
            String lastName,
            String customerId,
            String nationalityId,
            String genderId,
            String identityDocument,
            Integer identityDocumentNumber,
            String identityDocumentTypeId
    ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerId = customerId;
        this.nationalityId = nationalityId;
        this.genderId = genderId;
        this.identityDocument = identityDocument;
        this.identityDocumentNumber = identityDocumentNumber;
        this.identityDocumentTypeId = identityDocumentTypeId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getNationalityId() {
        return nationalityId;
    }

    public void setNationalityId(String nationalityId) {
        this.nationalityId = nationalityId;
    }

    public String getGenderId() {
        return genderId;
    }

    public void setGenderId(String genderId) {
        this.genderId = genderId;
    }

    public String getIdentityDocument() {
        return identityDocument;
    }

    public void setIdentityDocument(String identityDocument) {
        this.identityDocument = identityDocument;
    }

    public Integer getIdentityDocumentNumber() {
        return identityDocumentNumber;
    }

    public void setIdentityDocumentNumber(Integer identityDocumentNumber) {
        this.identityDocumentNumber = identityDocumentNumber;
    }

    public String getIdentityDocumentTypeId() {
        return identityDocumentTypeId;
    }

    public void setIdentityDocumentTypeId(String identityDocumentTypeId) {
        this.identityDocumentTypeId = identityDocumentTypeId;
    }
}

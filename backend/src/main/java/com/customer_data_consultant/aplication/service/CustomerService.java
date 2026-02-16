package com.customer_data_consultant.aplication.service;

import com.customer_data_consultant.api.dto.CustomerErrorDto;
import com.customer_data_consultant.domain.model.entity.Customers;
import com.customer_data_consultant.domain.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Object getCustomer(String identityDocumentTypeId, Integer identityDocumentNumber){

        if (identityDocumentTypeId == null || identityDocumentNumber == null || identityDocumentTypeId.isBlank() || identityDocumentNumber.describeConstable().isEmpty()){
            return new CustomerErrorDto(
                    "Datos inválidos o vacios",
                    400,
                    LocalDateTime.now()
            );
        }

        return customerRepository.findByIdentityDocumentTypeIdAndIdentityDocumentNumber(
                identityDocumentTypeId,
                identityDocumentNumber)
                .<Object>map(customers -> customers)
                .orElseGet(()->new CustomerErrorDto(
                        "Cliente no encontrado",
                        404,
                        LocalDateTime.now()
                ));


    }
}

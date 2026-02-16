package com.customer_data_consultant.api.controller;

import com.customer_data_consultant.aplication.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/search")
    public ResponseEntity<Object> searchCustomers(
            @RequestParam("identityDocumentTypeId") String identityDocumentTypeId,
            @RequestParam("identityDocumentNumber") Integer identityDocumentNumber
    ){
        return  ResponseEntity.ok(customerService.getCustomer(identityDocumentTypeId, identityDocumentNumber));
    }


}

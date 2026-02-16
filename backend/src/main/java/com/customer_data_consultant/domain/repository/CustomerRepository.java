package com.customer_data_consultant.domain.repository;

import com.customer_data_consultant.domain.model.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customers, Long> {
    Optional<Customers> findByIdentityDocumentTypeIdAndIdentityDocumentNumber(String document, Integer documentNumber);
}

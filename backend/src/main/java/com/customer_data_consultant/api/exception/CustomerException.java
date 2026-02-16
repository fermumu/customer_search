package com.customer_data_consultant.api.exception;

import com.customer_data_consultant.api.dto.CustomerErrorDto;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import java.time.LocalDateTime;

@RestControllerAdvice
public class CustomerException {
    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<CustomerErrorDto> handleTypeMismatch(
            MethodArgumentTypeMismatchException ex,
            HttpServletRequest request) {

        CustomerErrorDto error = new CustomerErrorDto(
                "El parámetro 'identityDocumentNumber' debe ser numérico",
                400,
                LocalDateTime.now()
        );

        return ResponseEntity.badRequest().body(error);
    }
}

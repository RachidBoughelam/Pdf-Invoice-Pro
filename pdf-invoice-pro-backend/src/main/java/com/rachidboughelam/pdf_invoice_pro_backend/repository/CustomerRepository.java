package com.rachidboughelam.pdf_invoice_pro_backend.repository;

import com.rachidboughelam.pdf_invoice_pro_backend.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

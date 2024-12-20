package com.rachidboughelam.pdf_invoice_pro_backend.repository;

import com.rachidboughelam.pdf_invoice_pro_backend.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

    List<Invoice> findByCustomerId(Long clientId);

}

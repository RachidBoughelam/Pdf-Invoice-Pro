package com.rachidboughelam.pdf_invoice_pro_backend.service;

import com.rachidboughelam.pdf_invoice_pro_backend.model.Invoice;

import java.util.List;
import java.util.Optional;

public interface InvoiceService {

    List<Invoice> findAllInvoices();

    Optional<Invoice> findInvoiceById(Long id);

    Invoice saveOrUpdateInvoice(Invoice invoice);

    void deleteInvoice(Long id);

    List<Invoice> findInvoicesByCustomer(Long clientId);
}

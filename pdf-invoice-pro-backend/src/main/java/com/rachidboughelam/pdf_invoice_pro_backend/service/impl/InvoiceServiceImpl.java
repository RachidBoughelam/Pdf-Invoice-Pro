package com.rachidboughelam.pdf_invoice_pro_backend.service.impl;

import com.rachidboughelam.pdf_invoice_pro_backend.model.Invoice;
import com.rachidboughelam.pdf_invoice_pro_backend.repository.InvoiceRepository;
import com.rachidboughelam.pdf_invoice_pro_backend.service.InvoiceService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    private final InvoiceRepository invoiceRepository;

    public InvoiceServiceImpl(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    @Override
    public List<Invoice> findAllInvoices() {
        return invoiceRepository.findAll();
    }

    @Override
    public Optional<Invoice> findInvoiceById(Long id) {
        return invoiceRepository.findById(id);
    }

    @Override
    public Invoice saveOrUpdateInvoice(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

    @Override
    public void deleteInvoice(Long id) {
        invoiceRepository.deleteById(id);
    }

    @Override
    public List<Invoice> findInvoicesByCustomer(Long clientId) {
        return invoiceRepository.findByCustomerId(clientId);
    }

}

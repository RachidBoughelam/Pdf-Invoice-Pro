package com.rachidboughelam.pdf_invoice_pro_backend.service.impl;

import com.rachidboughelam.pdf_invoice_pro_backend.model.Issuer;
import com.rachidboughelam.pdf_invoice_pro_backend.repository.IssuerRepository;
import com.rachidboughelam.pdf_invoice_pro_backend.service.IssuerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IssuerServiceImpl implements IssuerService {

    private final IssuerRepository issuerRepository;

    @Autowired
    public IssuerServiceImpl(IssuerRepository issuerRepository) {
        this.issuerRepository = issuerRepository;
    }

    @Override
    public List<Issuer> findAllIssuers() {
        return issuerRepository.findAll();
    }

    @Override
    public Optional<Issuer> findIssuerById(Long id) {
        return issuerRepository.findById(id);
    }

    @Override
    public Issuer saveOrUpdateIssuer(Issuer issuer) {
        return issuerRepository.save(issuer);
    }

    @Override
    public void deleteIssuer(Long id) {
        issuerRepository.deleteById(id);
    }
}

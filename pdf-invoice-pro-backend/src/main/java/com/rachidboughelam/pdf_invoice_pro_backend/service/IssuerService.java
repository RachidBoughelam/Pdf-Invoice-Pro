package com.rachidboughelam.pdf_invoice_pro_backend.service;

import com.rachidboughelam.pdf_invoice_pro_backend.model.Issuer;

import java.util.List;
import java.util.Optional;

public interface IssuerService {

    List<Issuer> findAllIssuers();

    Optional<Issuer> findIssuerById(Long id);

    Issuer saveOrUpdateIssuer(Issuer issuer);

    void deleteIssuer(Long id);
}

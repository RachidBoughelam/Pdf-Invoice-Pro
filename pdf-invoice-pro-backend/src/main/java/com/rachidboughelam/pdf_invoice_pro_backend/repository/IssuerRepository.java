package com.rachidboughelam.pdf_invoice_pro_backend.repository;

import com.rachidboughelam.pdf_invoice_pro_backend.model.Issuer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IssuerRepository extends JpaRepository<Issuer, Long> {
}

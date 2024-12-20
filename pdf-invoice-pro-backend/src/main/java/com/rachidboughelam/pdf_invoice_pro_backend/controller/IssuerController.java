package com.rachidboughelam.pdf_invoice_pro_backend.controller;

import com.rachidboughelam.pdf_invoice_pro_backend.model.Issuer;
import com.rachidboughelam.pdf_invoice_pro_backend.service.IssuerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/issuers")
@CrossOrigin(origins = "*")
public class IssuerController {

    private final IssuerService issuerService;

    @Autowired
    public IssuerController(IssuerService issuerService) {
        this.issuerService = issuerService;
    }

    @GetMapping
    public ResponseEntity<List<Issuer>> getAllIssuers() {
        List<Issuer> issuers = issuerService.findAllIssuers();
        return new ResponseEntity<>(issuers, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Issuer> getIssuerById(@PathVariable Long id) {
        Optional<Issuer> issuer = issuerService.findIssuerById(id);
        return issuer.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Issuer> createIssuer(@RequestBody Issuer issuer) {
        Issuer savedIssuer = issuerService.saveOrUpdateIssuer(issuer);
        return new ResponseEntity<>(savedIssuer, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Issuer> updateIssuer(@PathVariable Long id, @RequestBody Issuer issuer) {
        if (!issuerService.findIssuerById(id).isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        issuer.setId(id);
        Issuer updatedIssuer = issuerService.saveOrUpdateIssuer(issuer);
        return new ResponseEntity<>(updatedIssuer, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteIssuer(@PathVariable Long id) {
        if (!issuerService.findIssuerById(id).isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        issuerService.deleteIssuer(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

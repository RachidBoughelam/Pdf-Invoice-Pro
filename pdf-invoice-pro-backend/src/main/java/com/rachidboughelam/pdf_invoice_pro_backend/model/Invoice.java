package com.rachidboughelam.pdf_invoice_pro_backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "invoices")
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="invoice_ref")
    private String invoiceRef;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "issuer_id", nullable = false)
    private Issuer issuer;

    @Column(name = "invoice_date", nullable = false)
    private String invoiceDate;

    @Column(name = "amount", nullable = false)
    private double amount;

    @Column(name = "tax", nullable = false)
    private double tax;

    @Column(name = "total_amount", nullable = false)
    private double totalAmount;

    @Column(name = "description", length = 500)
    private String description;

    public Invoice(Long id, String description, double totalAmount, double tax, double amount, String invoiceDate, Issuer issuer, Customer customer, String invoiceRef) {
        this.id = id;
        this.description = description;
        this.totalAmount = totalAmount;
        this.tax = tax;
        this.amount = amount;
        this.invoiceDate = invoiceDate;
        this.issuer = issuer;
        this.customer = customer;
        this.invoiceRef = invoiceRef;
    }

    public Invoice(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getInvoiceRef() {
        return invoiceRef;
    }

    public void setInvoiceRef(String invoiceRef) {
        this.invoiceRef = invoiceRef;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public double getAmount() {
        return amount;
    }


    public double getTax() {
        return tax;
    }

    public void setAmount(double amount) {
        this.amount = amount;
        calculateTotalAmount();
    }

    public void setTax(double tax) {
        this.tax = tax;
        calculateTotalAmount();
    }

    private void calculateTotalAmount() {
        this.totalAmount = this.amount + this.tax;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Issuer getIssuer() {
        return issuer;
    }

    public void setIssuer(Issuer issuer) {
        this.issuer = issuer;
    }
}

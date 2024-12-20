package com.rachidboughelam.pdf_invoice_pro_backend.service;

import com.rachidboughelam.pdf_invoice_pro_backend.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    List<Customer> findAllCustomers();

    Optional<Customer> findCustomerById(Long id);

    Customer saveOrUpdateCustomer(Customer client);

    void deleteCustomer(Long id);
}

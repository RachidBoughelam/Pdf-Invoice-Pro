package com.rachidboughelam.pdf_invoice_pro_backend.service.impl;

import com.rachidboughelam.pdf_invoice_pro_backend.model.Customer;
import com.rachidboughelam.pdf_invoice_pro_backend.repository.CustomerRepository;
import com.rachidboughelam.pdf_invoice_pro_backend.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository clientRepository) {
        this.customerRepository = clientRepository;
    }

    @Override
    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> findCustomerById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public Customer saveOrUpdateCustomer(Customer client) {
        return customerRepository.save(client);
    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}

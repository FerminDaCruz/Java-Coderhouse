package edu.coderhouse.jpa.services.impl;

import edu.coderhouse.jpa.entities.InvoiceDetails;
import edu.coderhouse.jpa.repositories.InvoiceDetailsRepository;
import edu.coderhouse.jpa.services.InvoiceDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceDetailsServiceImpl implements InvoiceDetailsService {

    @Autowired
    private InvoiceDetailsRepository invoiceDetailsRepository;

    @Override
    public InvoiceDetails saveInvoiceDetails(InvoiceDetails invoiceDetails) {
        return invoiceDetailsRepository.save(invoiceDetails);
    }

    @Override
    public InvoiceDetails getInvoiceDetailsById(Integer id) {
        Optional<InvoiceDetails> result = invoiceDetailsRepository.findById(id);
        return result.orElse(null);
    }

    @Override
    public List<InvoiceDetails> getAllInvoiceDetails() {
        return invoiceDetailsRepository.findAll();
    }

    @Override
    public void deleteInvoiceDetails(Integer id) {
        invoiceDetailsRepository.deleteById(id);
    }
}

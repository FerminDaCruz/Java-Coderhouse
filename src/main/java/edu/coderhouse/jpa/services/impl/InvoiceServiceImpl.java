package edu.coderhouse.jpa.services.impl;

import edu.coderhouse.jpa.entities.Invoice;
import edu.coderhouse.jpa.repositories.InvoiceRepository;
import edu.coderhouse.jpa.services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Override
    public Invoice saveInvoice(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

    @Override
    public Invoice getInvoiceById(Integer id) {
        return invoiceRepository.findById(id).orElse(null);
    }

    @Override
    public List<Invoice> getAllInvoice() {
        return invoiceRepository.findAll();
    }

    @Override
    public void deleteInvoice(Integer id) {
        invoiceRepository.deleteById(id);
    }
}

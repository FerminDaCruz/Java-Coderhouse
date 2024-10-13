package edu.coderhouse.jpa.services;

import edu.coderhouse.jpa.entities.InvoiceDetails;

import java.util.List;

public interface InvoiceDetailsService {
    InvoiceDetails saveInvoiceDetails(InvoiceDetails invoiceDetails);
    InvoiceDetails getInvoiceDetailsById(Integer id);
    List<InvoiceDetails> getAllInvoiceDetails();
    void deleteInvoiceDetails(Integer id);
}

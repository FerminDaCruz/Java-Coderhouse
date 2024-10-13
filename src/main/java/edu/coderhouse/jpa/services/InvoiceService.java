package edu.coderhouse.jpa.services;

import edu.coderhouse.jpa.entities.Invoice;

import java.util.List;

public interface InvoiceService {
    Invoice saveInvoice(Invoice invoice);
    Invoice getInvoiceById(Integer id);
    List<Invoice> getAllInvoice();
    void deleteInvoice(Integer id);
}

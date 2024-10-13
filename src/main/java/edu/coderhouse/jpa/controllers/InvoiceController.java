package edu.coderhouse.jpa.controllers;

import edu.coderhouse.jpa.entities.Invoice;
import edu.coderhouse.jpa.services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/invoices")
public class InvoiceController {

    @Autowired
    public InvoiceService invoiceService;

    @PostMapping
    public ResponseEntity<Invoice> createInvoice(@RequestBody Invoice invoice) {
        Invoice newInvoice = invoiceService.saveInvoice(invoice);
        return new ResponseEntity<>(newInvoice, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Invoice> getInvoiceById(@PathVariable Integer id) {
        Invoice invoice = invoiceService.getInvoiceById(id);
        return invoice != null ? ResponseEntity.ok(invoice) : ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<Invoice>> getAllInvoice() {
        List<Invoice> invoices = invoiceService.getAllInvoice();
        return ResponseEntity.ok(invoices);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInvoice(@PathVariable Integer id) {
        invoiceService.deleteInvoice(id);
        return ResponseEntity.noContent().build();
    }

}

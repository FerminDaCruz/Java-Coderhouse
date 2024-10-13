package edu.coderhouse.jpa.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "invoice_details")
@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class InvoiceDetails {

    @ManyToOne
    @JoinColumn(name = "invoice_id", nullable = false)
    private Invoice invoice;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer invoice_detail_id;

    @Column(nullable = false)
    private Integer amount;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @Column(nullable = false)
    private Double price;
}

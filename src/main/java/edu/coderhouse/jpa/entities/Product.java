package edu.coderhouse.jpa.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 150, nullable = false)
    private String description;

    @Column(length = 50, nullable = false)
    private String code;

    @Column(nullable = false)
    private Integer stock;

    @Column(nullable = false)
    private Double price;
}

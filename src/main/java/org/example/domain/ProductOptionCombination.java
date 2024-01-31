package org.example.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class ProductOptionCombination {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    private List<ProductOption> options;

    // Other fields as needed

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

}
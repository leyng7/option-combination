package org.example.domain;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Getter
public class ProductOption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // Other option-related fields

    @OneToMany(mappedBy = "option", cascade = CascadeType.ALL)
    private List<ProductOptionValue> values;

}
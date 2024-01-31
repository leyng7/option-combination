package org.example.domain;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class ProductOptionValue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String value;

    @ManyToOne
    @JoinColumn(name = "option_id")
    private ProductOption option;

}
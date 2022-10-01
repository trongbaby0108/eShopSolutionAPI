package com.code.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String comment ;
    private float vote;

    @ManyToOne
    @JoinColumn(name = "productID",nullable = false, referencedColumnName = "product_id")
    private Product product;
}

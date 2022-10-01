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
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int id ;
    private String name ;
    private Long price ;
    private String img;
    private String description ;
    private boolean enable = true;
    @ManyToOne
    @JoinColumn(name = "categoryId",nullable = false, referencedColumnName = "category_id")
    private Category category;
}

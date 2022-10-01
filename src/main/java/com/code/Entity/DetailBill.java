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
public class DetailBill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;

    private int amount;

    @ManyToOne
    @JoinColumn(name = "billID",nullable = false, referencedColumnName = "bill_id")
    private Bill bill;

    @ManyToOne
    @JoinColumn(name = "productID",nullable = false, referencedColumnName = "product_id")
    private Product product;
}

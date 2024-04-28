package com.jhon.tiendaback.models;


import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name="productId")
    private UUID productId= UUID.randomUUID();


}

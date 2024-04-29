package com.jhon.tiendaback.models;


import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID) //uuid para generar codigo unico de forma aleatorioa teniendo en cuenta el tiempo dia, segundos
    @Column(name="productId")
    private UUID productId= UUID.randomUUID();
    private String nameProduct;
    private Double priceProduct;


}

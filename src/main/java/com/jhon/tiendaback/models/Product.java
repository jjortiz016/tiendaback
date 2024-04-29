package com.jhon.tiendaback.models;


import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID) //uuid para generar codigo unico de forma aleatorioa teniendo en cuenta el tiempo dia, segundos
    @Column(name="productId")
    private UUID productId= UUID.randomUUID();

    @Column(nullable = false, length = 50)
    private String nameProduct;

    @Column(nullable = false, length = 100)
    private String descriptionProduct;

    @Column(nullable = false, length = 50)
    private Double priceProduct;

    @ManyToOne
    private Category category;

    @OneToMany(mappedBy = "product")
    private List<OrderDetail> orderDetails;


}

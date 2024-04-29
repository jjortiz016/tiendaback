package com.jhon.tiendaback.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name="order-details")
public class OrderDetail {
    @Id
    @Column(name="orderDetailID")
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID orderDetailID=UUID.randomUUID();

    @JoinColumn(name="orderId")
    private Order order;

    @ManyToOne
    @JoinColumn(name="productID")
    private Product product;

    private Integer quantity;

    private Double price;

}

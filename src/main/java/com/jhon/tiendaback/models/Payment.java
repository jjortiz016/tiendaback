package com.jhon.tiendaback.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="payments")

public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "paymentId")
    private UUID paymentId = UUID.randomUUID();

    @Column(nullable = false, length = 50)
    private String nOperation;


    @Column(length = 50)
    private Double mount;

    @Column(nullable = false, length = 50)
    private Date datePayment;

    @OneToOne
    private Order order;

}
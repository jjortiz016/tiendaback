package com.jhon.tiendaback.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name="order")
public class Order {
    @Id
    @GeneratedValue(strategy= GenerationType.UUID)
    @Column(unique=true, name="orderID")
    private UUID orderID= UUID.randomUUID();

    @Column(length = 50)
    private Double mount;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "order")
    private List<OrderDetail> orderDetails;

    @OneToOne
    @JsonIgnore
    private Payment payment;


}

package com.jhon.tiendaback.dto;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class OrderDTO {
    @EqualsAndHashCode.Include
    private UUID orderID;

    @NotNull
    private Double mount;
    @NotNull
    private UserDTO user;

    @JsonManagedReference
    @NotNull
    private List<OrderDetailDTO> orderDetails;
/*
    @NotNull
    private PaymentDTO payment;*/


}

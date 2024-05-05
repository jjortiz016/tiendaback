package com.jhon.tiendaback.dto;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.jhon.tiendaback.models.OrderDetail;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ProductDTO {
    @EqualsAndHashCode.Include
    private UUID productId;

    @NotEmpty
    private String nameProduct;

    @NotEmpty
    private String descriptionProduct;

    @NotEmpty
    private Double priceProduct;

    @NotNull
    private CategoryDTO category;


    @JsonManagedReference
    @NotNull
    private List<OrderDetail> orderDetails;

}

package com.jhon.tiendaback.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
public class CategoryDTO {

    @EqualsAndHashCode.Include
    private UUID categoryId;

    @NotEmpty
    private String nameCategory;

    @NotNull
    @JsonManagedReference //se utiliza en clases de modelo de Java para manejar relaciones bidireccionales y evitar problemas de recursión infinita al serializar objetos JSON.se coloca en la clase padre
   // @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) //ignorar atributos hibernate para que no genere error en el json
    private List<ProductDTO> products;


}
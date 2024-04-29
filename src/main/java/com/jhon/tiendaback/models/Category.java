package com.jhon.tiendaback.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.UUID;

//@Data
@Getter
@Setter
@AllArgsConstructor //Genera automáticamente un constructor con un parámetro para cada campo en la clase, Incluye todos los campos, tanto finales como no finales
@NoArgsConstructor //Genera automáticamente un constructor sin parámetros. Si esto no es posible (porque hay campos finales), se producirá un error de compilación. Sin embargo, puedes usar @NoArgsConstructor(force = true) para inicializar todos los campos finales con valores predeterminados (0, falso o nulo).
@Entity
@Table(name="categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID) //uuid para generar codigo unico de forma aleatorioa teniendo en cuenta el tiempo dia, segundos
    @Column(name="categoryId")
    private UUID categoryId= UUID.randomUUID();

    @Column (nullable= false, length =50)
    private String nameCategory;

    @OneToMany(fetch=FetchType.LAZY, mappedBy = "category", cascade = CascadeType.ALL)
    //@JsonIgnoreProperties({"hibernateLazyInitializer","handler"}) //ignorar atributos hibernate para que no genere error en el json
    @JsonIgnore
    private List<Product> products;


}

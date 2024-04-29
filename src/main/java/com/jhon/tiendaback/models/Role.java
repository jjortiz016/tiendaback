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
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID roleId=UUID.randomUUID();

    @Column(nullable = false,length =50)
    private String nameRole;

    @Column(nullable = false,length = 100)
    private String descriptionRole;
}

package com.jhon.tiendaback.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;


import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(unique= true, name="userId")
    private UUID userId=UUID.randomUUID();

    @Column(nullable=false, length =60, unique= true)
    private String username;

    @Column(nullable = false, length=60)
    private String password;

    @Column(nullable = false)
    private boolean enabled;

    @OneToMany(fetch= FetchType.LAZY, mappedBy = "user", cascade = CascadeType.ALL) //tambien probar con EAGER
    @JsonIgnore
    private List<Order>  orders;

    @ManyToMany(fetch= FetchType.EAGER)
    @JoinTable(name= "user_role",
            joinColumns = @JoinColumn(name=  "user_id", referencedColumnName="userId"),
            inverseJoinColumns= @JoinColumn(name="role_id", referencedColumnName = "roleId"))
    private List<Role> roles;


}

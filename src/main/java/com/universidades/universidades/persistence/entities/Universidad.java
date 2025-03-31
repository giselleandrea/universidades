package com.universidades.universidades.persistence.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table (name = "universidades" )
@Getter
@Setter
@NoArgsConstructor
public class Universidad {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    private String direccion;
    private String email;
    private String telefono;

}

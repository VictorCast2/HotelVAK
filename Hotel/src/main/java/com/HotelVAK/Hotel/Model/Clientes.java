package com.HotelVAK.Hotel.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Table(name="db_Clientes")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Clientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    @Basic
    @Column(nullable = false)
    @Size(min=2, max = 1000, message = "Minimo de 2 maximo de 1000")
    @NotEmpty(message = "No pueden estar vacio")
    private String Nombre;
    @Basic
    @Column(nullable = false)
    @Size(min=2, max = 1000, message = "Minimo de 2 maximo de 1000")
    @NotEmpty(message = "No pueden estar vacio")
    private String Apellido;
    @Basic
    @Column(nullable = false)
    @NotEmpty(message = "No pueden estar vacio")
    private Integer Edad;
    @Basic
    @Column(nullable = false)
    @NotEmpty(message = "No pueden estar vacio")
    private Integer Cedula;
}
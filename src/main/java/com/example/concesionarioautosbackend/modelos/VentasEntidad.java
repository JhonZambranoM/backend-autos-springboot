package com.example.concesionarioautosbackend.modelos;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "tbl_ventas_usuarios")
public class VentasEntidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_ventas;
    private LocalDate fecha_venta;
    private double precio;
    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "identificacion", referencedColumnName = "identificacion")
    private UsuarioEntidad usuario;


    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "placa", referencedColumnName = "placa")
    private AutoEntidad auto;
}

package com.example.concesionarioautosbackend.modelos;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "tbl_usuarios")
public class UsuarioEntidad {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;
    @Id
    private String identificacion;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private String edad;
    private String ciudad_residencia;
    private String correo;

    public UsuarioEntidad(){

    }

    @JsonIgnore
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<VentasEntidad> ventas;


    @JsonIgnore
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<CitasEntidad> citas;

}

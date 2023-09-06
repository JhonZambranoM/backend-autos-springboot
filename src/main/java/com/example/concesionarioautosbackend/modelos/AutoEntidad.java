package com.example.concesionarioautosbackend.modelos;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Time;
import java.time.LocalDate;
import java.util.List;


@Entity
@Data
@Table(name = "tbl_autos")
public class AutoEntidad {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_auto;
    @Id
    private String placa;
    private String anio;

    @CreationTimestamp
    private Time hora_registroAuto;

    @CreationTimestamp
    private LocalDate fecha_registroAuto;
    public AutoEntidad(){

    }

    @JsonIgnore
    @OneToMany(mappedBy = "auto", cascade = CascadeType.ALL)
    private List<VentasEntidad> ventas;

}

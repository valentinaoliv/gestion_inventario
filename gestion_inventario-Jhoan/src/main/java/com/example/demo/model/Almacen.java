package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString @EqualsAndHashCode
@Table(name = "almacen")
public class Almacen {

    @Getter @Setter @Column(name = "ID_ALMACEN")
    @Id
    private int id;  

    @Getter @Setter @Column(name = "nombre_almacen")
    private String nombre;

    @Getter @Setter @Column(name = "ubicacion")
    private String ubicacion;

    @Getter @Setter @Column(name = "INSTITUCION_ID")
    private int institucion_id;
}

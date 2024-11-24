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
@Table(name = "productos")
public class Producto {

    @Getter @Setter @Column(name = "ID")
    @Id
    private int id;  

    @Getter @Setter @Column(name = "nombre")
    private String nombre;

    @Getter @Setter @Column(name = "CANTIDAD")
    private int cantidad;

    @Getter @Setter @Column(name = "CANTIDAD_MINIMA")
    private int cantidadMin;

    @Getter @Setter @Column(name = "CANTIDAD_MAXIMA")
    private int cantidadMax;


    @Getter @Setter @Column(name = "TIPO_PRODUCTO_ID")
    private int idTipoProduct;  

}

   
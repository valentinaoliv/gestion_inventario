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
@Table(name = "tipo_producto")
public class Categoria {

    @Getter @Setter @Column(name = "ID_TIPO_PRODUCTO")
    @Id
    private int id; 
    
    @Getter @Setter @Column(name = "nombre_tipo")
    private String nombre;

    @Getter @Setter @Column(name = "descripcion")
    private String descripcion;

    @Getter @Setter @Column(name = "durable")
    private int durable;

    @Getter @Setter @Column(name = "id_tpo_producto")
    private int tipo_producto;

}

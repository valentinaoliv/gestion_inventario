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
@Table(name = "institucion")
public class Institucion {
    
    @Getter @Setter @Column(name = "ID_INSTITUCION")
    @Id
    private int id; 
    
    @Getter @Setter @Column(name = "NOMBRE_INSTITUCION")
    private String nombre;

    @Getter @Setter @Column(name = "UBICACION")
    private String ubicacion;

    @Getter @Setter @Column(name = "TELEFONO_INSTITUCION")
    private int telefono_institucion;

}

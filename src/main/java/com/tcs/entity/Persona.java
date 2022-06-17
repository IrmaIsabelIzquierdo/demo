package com.tcs.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.tcs.entity.enums.EnumGenero;
@Entity
public class Persona{ 
    @Id
    private Long id;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    private String nombre;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    private int edad;
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    private EnumGenero genero;
    public EnumGenero getGenero() {
        return genero;
    }
    public void setGenero(EnumGenero genero) {
        this.genero = genero;
    }
    private String direccion;
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public Persona(Long id, String nombre, int edad, EnumGenero genero, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.direccion = direccion;
    }

    public Persona(){}
}

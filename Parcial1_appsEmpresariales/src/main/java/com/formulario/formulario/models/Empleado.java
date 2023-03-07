package com.formulario.formulario.models;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Empleado {
    @NotEmpty(message ="El id no puede estar vacio")
    private String id;
    @NotEmpty(message ="El nombre no puede estar vacio")
    private String nombre;
    @NotEmpty
    private String apellido;
    @NotEmpty
    private String direccion;
    @NotEmpty
    @Size(min = 8, max = 10)    
    private String telefono;
    @NotEmpty
    private String email;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}

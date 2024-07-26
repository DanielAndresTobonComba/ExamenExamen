package com.example.nuevo.Persona.Domain.entity;

public class Persona {

    private String nombre; 
    private String apellido; 
    private String correo; 
    private int idGenero ; 
    private int idCiudad ; 
    private int edad ; 
    private int id;
    private String direccion;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String correo, int idGenero, int idCiudad, int edad, int id,
            String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.idGenero = idGenero;
        this.idCiudad = idCiudad;
        this.edad = edad;
        this.id = id;
        this.direccion = direccion;
    }

    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public int getIdGenero() {
        return idGenero;
    }
    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }
    public int getIdCiudad() {
        return idCiudad;
    }
    public void setIdCiudad(int idCiudad) {
        this.idCiudad = idCiudad;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    



}

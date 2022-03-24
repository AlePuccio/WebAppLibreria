/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WebAppLibreria.Api.Dtos;

import WebAppLibreria.Api.Enums.Roles;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 *
 * @author Ale
 */
public class UsuarioDto {
    private String id;
    private String nombre;
    private String apellido;
    private String mail;
    private String username;
    private String pass;
    private String ciudad;
    private String direccion;
    @Enumerated(EnumType.STRING)
    private Roles rol;
    private Boolean alta;
    private Boolean reclamo;    

    public UsuarioDto() {
    }

    public UsuarioDto(String id, String nombre, String apellido, String mail, String username, String pass, String ciudad, String direccion, Roles rol, Boolean alta, Boolean reclamo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.username = username;
        this.pass = pass;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.rol = rol;
        this.alta = alta;
        this.reclamo = reclamo;
    }

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Roles getRol() {
        return rol;
    }

    public void setRol(Roles rol) {
        this.rol = rol;
    }

    public Boolean getAlta() {
        return alta;
    }

    public void setAlta(Boolean alta) {
        this.alta = alta;
    }

    public Boolean getReclamo() {
        return reclamo;
    }

    public void setReclamo(Boolean reclamo) {
        this.reclamo = reclamo;
    }
    
    
}

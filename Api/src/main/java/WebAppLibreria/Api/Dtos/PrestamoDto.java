/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WebAppLibreria.Api.Dtos;

import WebAppLibreria.Api.Entidades.Libro;
import WebAppLibreria.Api.Entidades.Usuario;
import java.time.LocalDate;

/**
 *
 * @author Ale
 */
public class PrestamoDto {
    private String id;
    private Usuario usuario;
    private Libro libro;
    private LocalDate fecha_entrega;
    private LocalDate fecha_devolucion;
    private Boolean alta;

    public PrestamoDto() {
    }

    public PrestamoDto(String id, Usuario usuario, Libro libro, LocalDate fecha_entrega, LocalDate fecha_devolucion, Boolean alta) {
        this.id = id;
        this.usuario = usuario;
        this.libro = libro;
        this.fecha_entrega = fecha_entrega;
        this.fecha_devolucion = fecha_devolucion;
        this.alta = alta;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public LocalDate getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(LocalDate fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public LocalDate getFecha_devolucion() {
        return fecha_devolucion;
    }

    public void setFecha_devolucion(LocalDate fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    public Boolean getAlta() {
        return alta;
    }

    public void setAlta(Boolean alta) {
        this.alta = alta;
    }

    
}

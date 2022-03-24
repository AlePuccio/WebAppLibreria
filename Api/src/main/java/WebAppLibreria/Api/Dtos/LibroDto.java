/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WebAppLibreria.Api.Dtos;

import WebAppLibreria.Api.Entidades.Autor;
import WebAppLibreria.Api.Entidades.Editorial;

/**
 *
 * @author Ale
 */
public class LibroDto {
   
    private String id;    
    private Autor autor;    
    private Editorial editorial;    
    private String titulo;    
    private Long ISNB;    
    private Integer cant_ejemplares;
    private Integer cant_disponible;
    private Boolean alta;  

    public LibroDto() {
    }

    public LibroDto(String id, Autor autor, Editorial editorial, String titulo, Long ISNB, Integer cant_ejemplares, Integer cant_disponible, Boolean alta) {
        this.id = id;
        this.autor = autor;
        this.editorial = editorial;
        this.titulo = titulo;
        this.ISNB = ISNB;
        this.cant_ejemplares = cant_ejemplares;
        this.cant_disponible = cant_disponible;
        this.alta = alta;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Long getISNB() {
        return ISNB;
    }

    public void setISNB(Long ISNB) {
        this.ISNB = ISNB;
    }

    public Integer getCant_ejemplares() {
        return cant_ejemplares;
    }

    public void setCant_ejemplares(Integer cant_ejemplares) {
        this.cant_ejemplares = cant_ejemplares;
    }

    public Integer getCant_disponible() {
        return cant_disponible;
    }

    public void setCant_disponible(Integer cant_disponible) {
        this.cant_disponible = cant_disponible;
    }

    public Boolean getAlta() {
        return alta;
    }

    public void setAlta(Boolean alta) {
        this.alta = alta;
    }
    
    
    
}

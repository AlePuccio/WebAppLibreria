/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WebAppLibreria.Api.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Ale
 */
@Entity
@Table(name= "Libros")
public class Libro {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy ="uuid2")
    private String id;
    @Column(name="Autor")
    private Autor autor;
    @Column(name="Editorial")
    private Editorial editorial;
    @Column(name="Titulo")
    private String titulo;
    @Column(name="ISBN")
    private Long ISNB;
    @Column(name="Cantidad_Ejemplares")
    private Integer cant_ejemplares;
    @Column(name="Cantidad_Disponible")
    private Integer cant_disponible;
    private Boolean alta;
    
    public Libro() {
    }

    public Libro(Autor autor, Editorial editorial, String titulo, Long ISNB, Integer cant_ejemplares, Integer cant_disponible,Boolean alta) {
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

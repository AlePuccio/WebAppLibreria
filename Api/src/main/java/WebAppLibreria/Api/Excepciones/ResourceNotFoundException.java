/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WebAppLibreria.Api.Excepciones;

import org.springframework.http.HttpCookie;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author Ale
 */
@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    
    private String nombreDelRecurso;
    private String nombreDelCampo;
    private String valorDelCampo;

    public ResourceNotFoundException(String nombreDelRecurso, String nombreDelCampo, String valorDelCampo) {
        super(String.format("%s No Encontrado con : %s : '%s'", nombreDelRecurso,nombreDelCampo,valorDelCampo));
        this.nombreDelRecurso = nombreDelRecurso;
        this.nombreDelCampo = nombreDelCampo;
        this.valorDelCampo = valorDelCampo;
    }

    public String getNombreDelRecurso() {
        return nombreDelRecurso;
    }

    public void setNombreDelRecurso(String nombreDelRecurso) {
        this.nombreDelRecurso = nombreDelRecurso;
    }

    public String getNombreDelCampo() {
        return nombreDelCampo;
    }

    public void setNombreDelCampo(String nombreDelCampo) {
        this.nombreDelCampo = nombreDelCampo;
    }

    public String getValorDelCampo() {
        return valorDelCampo;
    }

    public void setValorDelCampo(String valorDelCampo) {
        this.valorDelCampo = valorDelCampo;
    }
    
    
}

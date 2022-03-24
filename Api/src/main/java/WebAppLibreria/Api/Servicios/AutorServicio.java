/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package WebAppLibreria.Api.Servicios;

import WebAppLibreria.Api.Dtos.AutorDto;
import java.util.List;

/**
 *
 * @author Ale
 */
public interface AutorServicio {
    
    public AutorDto crearAutor(AutorDto autorDto);
    public List<AutorDto> obtenerTodosLosAutores();
    public AutorDto buscarPorId(String id);
    public AutorDto actualizarAutor(AutorDto autorDto, String id);
}

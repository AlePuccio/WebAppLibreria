/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WebAppLibreria.Api.Servicios;

import WebAppLibreria.Api.Dtos.AutorDto;
import WebAppLibreria.Api.Entidades.Autor;
import WebAppLibreria.Api.Excepciones.ResourceNotFoundException;
import WebAppLibreria.Api.Repositorios.AutorRepositorio;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ale
 */
@Service
public class AutorServicioImpl implements AutorServicio{

    @Autowired
    AutorRepositorio autorRepositorio;
    
    @Override
    public AutorDto crearAutor(AutorDto autorDto) {
        Autor nuevoAutor=mapearAutor(autorDto);
        autorRepositorio.save(nuevoAutor);
        
        AutorDto dto=mapearAutorDto(nuevoAutor);
        
        return dto;
    }
    
    private Autor mapearAutor(AutorDto autorDto){
        Autor autor= new Autor();
        autor.setNombre(autorDto.getNombre());
        autor.setAlta(autorDto.getAlta());
        return autor;
    }
    
    private AutorDto mapearAutorDto (Autor autor){
        AutorDto autorDto=new AutorDto();
        autorDto.setId(autor.getId());
        autorDto.setAlta(autor.getAlta());
        autorDto.setNombre(autor.getNombre());
        return autorDto;
    }

    @Override
    public List<AutorDto> obtenerTodosLosAutores() {
        List<Autor> autores=autorRepositorio.findAll();
        //Utiliza stream() para pasarlo a stream y poder mapear a autordto en el flujo
        //Despues lo tramsforma a una lista de AutorDto y la retorna
        return autores.stream().map(t -> mapearAutorDto(t)).collect(Collectors.toList());
    }

    @Override
    public AutorDto buscarPorId(String id) {
        Autor autor=autorRepositorio.findById(id).orElseThrow(() -> new ResourceNotFoundException("Autor", "id", id));  
        return mapearAutorDto(autor);
    }

    @Override
    public AutorDto actualizarAutor(AutorDto autorDto, String id) {
        Autor autor = autorRepositorio.findById(id).orElseThrow(() -> new ResourceNotFoundException("Autor", "id", id));
        autor.setNombre(autorDto.getNombre());
        autor.setAlta(autorDto.getAlta());
        autorRepositorio.save(autor);
        return mapearAutorDto(autor);
    }

}

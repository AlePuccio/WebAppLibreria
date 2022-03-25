/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WebAppLibreria.Api.Servicios;

import WebAppLibreria.Api.Dtos.AutorDto;
import WebAppLibreria.Api.Dtos.AutorRespuestaPaginacion;
import WebAppLibreria.Api.Entidades.Autor;
import WebAppLibreria.Api.Excepciones.ResourceNotFoundException;
import WebAppLibreria.Api.Repositorios.AutorRepositorio;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
    public AutorRespuestaPaginacion obtenerTodosLosAutores(int numeroDePagina,int medidaDePagina,String ordenarPor,String sortDir) {
        //Ordena con SORT de Spring con if ternario
        Sort sort = sortDir.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(ordenarPor).ascending()
				: Sort.by(ordenarPor).descending();
        //utiliza clase de spring para paginacion y parametros numeroDePagina y medidaDePagina
        Pageable pageable = PageRequest.of(numeroDePagina, medidaDePagina, sort);
        Page<Autor> autores=autorRepositorio.findAll(pageable);
         
        //Utiliza stream() para pasarlo a stream y poder mapear a autordto en el flujo
        //Despues lo tramsforma a una lista de AutorDto y la retorna
        List<AutorDto> contenido= autores.stream().map(t -> mapearAutorDto(t)).collect(Collectors.toList());
        
        AutorRespuestaPaginacion autoresRespuesta= new AutorRespuestaPaginacion();
        
        
        autoresRespuesta.setContenido(contenido);
        autoresRespuesta.setNumeroPagina(autores.getNumber());
        autoresRespuesta.setMedidaPagina(autores.getSize());
        autoresRespuesta.setTotalElementos(autores.getTotalElements());
        autoresRespuesta.setTotalPaginas(autores.getTotalPages());
        autoresRespuesta.setUltima(autores.isLast());

        return autoresRespuesta;
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

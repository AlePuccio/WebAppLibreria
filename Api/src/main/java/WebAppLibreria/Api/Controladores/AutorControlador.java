/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WebAppLibreria.Api.Controladores;

import WebAppLibreria.Api.Dtos.AutorDto;
import WebAppLibreria.Api.Dtos.AutorRespuestaPaginacion;
import WebAppLibreria.Api.Servicios.AutorServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Ale
 */
@RestController
@RequestMapping("/api/autor")
public class AutorControlador {
    @Autowired
    private AutorServicio autorServivio;
    
    @PostMapping("/guardar")
    public ResponseEntity<AutorDto> guardaAutor(@RequestBody AutorDto autorDto){
        return new ResponseEntity<>(autorServivio.crearAutor(autorDto),HttpStatus.CREATED);
    }
    @GetMapping("/autores")
    public AutorRespuestaPaginacion listarAutores(@RequestParam(value = "pageNo", defaultValue = "0", required = false) int numeroDePagina,
            @RequestParam(value = "pageSize", defaultValue = "10", required = false) int medidaDePagina,
            @RequestParam(value = "sortBy", defaultValue = "nombre", required = false) String ordenarPor,
            @RequestParam(value = "sortDir", defaultValue = "asc", required = false) String sortDir) {
        return autorServivio.obtenerTodosLosAutores(numeroDePagina, medidaDePagina, ordenarPor, sortDir);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<AutorDto> verAutorPorId(@PathVariable(name="id")String id){
        return ResponseEntity.ok(autorServivio.buscarPorId(id));
    } 
    
    @PutMapping("/{id}")
    public ResponseEntity<AutorDto> actualizarAutor(@RequestBody AutorDto autorDto,@PathVariable(name="id")String id){
        AutorDto autorRespuesta = autorServivio.actualizarAutor(autorDto, id);
        return new ResponseEntity<>(autorRespuesta,HttpStatus.OK);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package WebAppLibreria.Api.Repositorios;

import WebAppLibreria.Api.Entidades.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ale
 */
@Repository
public interface AutorRepositorio extends JpaRepository<Autor, String>{
    
}

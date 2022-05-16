/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseInglesFinal.demo.repository;

import BaseInglesFinal.demo.entity.Ingresante;

import java.util.List;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jorge
 */
@Repository
public interface IngresanteRepository  extends JpaRepository<Ingresante, Long>,JpaSpecificationExecutor<Ingresante>{
    @Query("SELECT a FROM Ingresante a WHERE a.numDoc=:doc")
    Ingresante findByNumDoc(@Param("doc") String doc);
    
//    @Query("SELECT a FROM Ingresante a WHERE a.nombre like %:nombre%"
//            + " OR a.numDoc like %:nombre%  OR a.apellido like %:nombre% "
//            + "OR a.nacionalidad like %:nombre% OR a.genero like %:nombre% "
//            + "OR a.mail like %:nombre%  OR a.pais like %:nombre% OR a.provincia like %:nombre% ")
//    List<Ingresante>busquedaUniversal(@Param("nombre")String nombre);
    
    @Override
    List<Ingresante>findAll(Specification<Ingresante>spec);
    
    
}




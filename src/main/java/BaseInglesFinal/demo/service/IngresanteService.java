/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseInglesFinal.demo.service;

import BaseInglesFinal.demo.entity.Ingresante;
import java.util.List;

/**
 *
 * @author jorge
 */
public interface IngresanteService {
    public List<Ingresante> devolverListaParaImportar(List<Ingresante> lista);
     public Ingresante createIngresante(Ingresante ingresante);
    public List<Ingresante> findAllIngresante();
    public Ingresante saveIngresante(Ingresante ingresante);
    public void deleteIngresante(Ingresante ingresante);
    public Ingresante findIngresante(Ingresante ingresante); 
    public Ingresante findIngresanteById(Long id); 

}
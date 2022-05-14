/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseInglesFinal.demo.controller;

import BaseInglesFinal.demo.entity.Examen;
import BaseInglesFinal.demo.entity.Ingresante;
import BaseInglesFinal.demo.service.ExamenService;
import BaseInglesFinal.demo.service.IngresanteService;
import BaseInglesFinal.demo.util.Utiles;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author jorge
 */
@Controller

@RequestMapping("/admin")
public class AdminController {
    
    @Autowired
    private ExamenService es;
    @Autowired
    private Utiles ut;
    @Autowired
    private IngresanteService is;

    @GetMapping("/listall")
    public String add(Model model) {
        List <Examen> examenes=es.findAllExamen();
      model.addAttribute("examenes",examenes);
        return "listarexamenes";
    }
    @GetMapping("/crear-ingresante")
    public String addIngresante(Model model) {
      Ingresante ingresante=new Ingresante();
      model.addAttribute("ingresante",ingresante);
      model.addAttribute("listaEgresadoDe",ut.devolverSosEgregadoDe());
      model.addAttribute("listaEstablecimientos",ut.devolverEstablecimientos());
    return "crear-modificar-ingresante";
    }
//    @GetMapping("/editar-ingresante/{id}")
//    public String modifyIngresante(Model model) {
//      Ingresante ingresante=new Ingresante();
//      model.addAttribute("ingresante",ingresante);
//      model.addAttribute("listaEgresadoDe",ut.devolverSosEgregadoDe());
//      model.addAttribute("listaEstablecimientos",ut.devolverEstablecimientos());
//    return "crear-modificar-ingresante";
//    }
//    
    
    @PostMapping("/guardar-ingresante")
    public String guardarIngresante(Ingresante ingresante) {
       Ingresante inFormulario=ingresante;
       Ingresante guardar;
        if (inFormulario.getId()!=null && is.findIngresante(ingresante)!=null) {
         guardar=is.crearIngresante(inFormulario, is.findIngresante(ingresante));  
        }else{
       guardar=is.crearIngresante(inFormulario, null);
        }
        
       is.saveIngresante(guardar);
        
        return "listarexamenes";
    }
    
    

   

    
    
    
}

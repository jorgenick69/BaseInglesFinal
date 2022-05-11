/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseInglesFinal.demo.controller;

import BaseInglesFinal.demo.entity.Ingresante;
import BaseInglesFinal.demo.service.IngresanteService;
import BaseInglesFinal.demo.util.Utiles;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author jorge
 */
@Controller

@RequestMapping("/ingresante")
public class IngresanteController {

    @Autowired
    private IngresanteService is;
    @Autowired
    private Utiles ut;
    

    @GetMapping("/consulta")
    public String subir() {

        return "buscaringresante";
    }

    @PostMapping("/traer")
    public String traerIngresante(@RequestParam String doc, Model model) {
        
        if (is.findIngresanteByDoc(doc) != null) {
            Ingresante ingre = is.findIngresanteByDoc(doc);
            model.addAttribute("listaBarriosCaba", ut.devolverBarriosCaba());
            model.addAttribute("listaDeLocalidadesGcba", ut.devolverLocalidades());
            model.addAttribute("listaProvincias", ut.devolverProvincias());
            model.addAttribute("listaPaises", ut.devolverPaises());
            model.addAttribute("ingresante", ingre);
           
            return "datosduros";
        } else {
            model.addAttribute("no", "el documento no figura en nuestra base de datos");
            return "buscaringresante";
        }

    }

    @PostMapping("/duros")
    public String save(Ingresante ingresante) {
        Ingresante modificado=is.guardarDDuros(ingresante);
        is.saveIngresante(modificado);
        return "index";
    }
}

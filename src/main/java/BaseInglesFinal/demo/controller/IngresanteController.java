/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseInglesFinal.demo.controller;

import BaseInglesFinal.demo.entity.Ingresante;
import BaseInglesFinal.demo.service.IngresanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
    
    @GetMapping("/consulta")
    public String subir() {

        return "buscaringresante";
    }
    @GetMapping("/traer")
    public String traerIngresante(@RequestParam String doc,Model model) {
        Ingresante ingre=is.findIngresanteByDoc(doc);
        model.addAttribute("ingre",ingre);
        return "traeringresanter";
    }
    
}

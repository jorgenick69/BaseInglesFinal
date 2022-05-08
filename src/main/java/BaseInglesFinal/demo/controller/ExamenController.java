/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseInglesFinal.demo.controller;

import BaseInglesFinal.demo.entity.Examen;
import BaseInglesFinal.demo.service.ExamenService;
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

@RequestMapping("/examen")
public class ExamenController {
    @Autowired
    private ExamenService es;


   

    @GetMapping("/add")
    public String add(Examen examen) {

        return "new_examen";
    }

    @PostMapping("/save")
    public String save(Examen examen) {
       Examen examenNew=new Examen();
       examenNew =es.evaluar(examen);
       es.save(examen);
        return "saludos";
    }
    
   @GetMapping("/delete")
    public String delete(@RequestParam Long id,Model model) {
        Examen examen=es.findExamenById(id);
        es.delete(examen);
        model.addAttribute(examen);
        return "delete";

    }
}


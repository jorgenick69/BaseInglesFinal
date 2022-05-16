/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseInglesFinal.demo.controller;


import BaseInglesFinal.demo.Excel.IngresanteExcelImporter;

import BaseInglesFinal.demo.entity.Ingresante;
import BaseInglesFinal.demo.repository.IngresanteRepository;
import BaseInglesFinal.demo.service.ExamenService;
import BaseInglesFinal.demo.service.IngresanteService;

import BaseInglesFinal.demo.util.Utiles;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;


import java.util.concurrent.TimeUnit;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author jorge
 */
@Controller

@RequestMapping("")
public class HomeController {

   

    @GetMapping({"", "/index", "/home", "/"})
    public String home() {

        return "index";
    }

   

    
    /*,@RequestParam("query") String query,String desde, String hasta,String genero,String encuenta,String examen*/
    
   
    
    
    
    
    
    
    
    
    
    
//    @GetMapping("/listar")
//    public String listarIngresantes(List<ingresante>) {
////       
//        model.addAttribute("ingre", ir.findAll());
//        model.addAttribute("cantidadRegistros", ir.findAll().size());
//       
//        return "listareingresantes";
//    }
//    
    
}

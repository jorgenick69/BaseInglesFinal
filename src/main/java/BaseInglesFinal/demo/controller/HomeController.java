/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseInglesFinal.demo.controller;

import BaseInglesFinal.demo.Excel.IngresanteExcelImporter;
import BaseInglesFinal.demo.entity.Examen;
import BaseInglesFinal.demo.entity.Ingresante;
import BaseInglesFinal.demo.repository.IngresanteRepository;
import BaseInglesFinal.demo.service.ExamenService;
import BaseInglesFinal.demo.service.IngresanteService;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

    @Autowired
    private IngresanteRepository ir;
    @Autowired
    private IngresanteService is;
    @Autowired
    private ExamenService es;

    @GetMapping({"", "/index", "/home", "/"})
    public String home() {

        return "index";
    }

    @GetMapping({"/subir"})
    public String subir() {

        return "subirarchivo";
    }

    @PostMapping("/import/excel")
    @ResponseBody
    public String ImportToMySql(@RequestParam("file") MultipartFile file) throws IOException {
        Date ahora=new Date();
        IngresanteExcelImporter excelImporter = new IngresanteExcelImporter();
        List<Ingresante> lista = excelImporter.excelImport(file);
        System.out.println("El tamaño de la lista es!!!!!!!!!!! " + lista.size());
        for (Ingresante in : lista) {
            Examen ex= new Examen();
            in.setExamen(es.save(ex));
        }
        ir.saveAll(lista);
        return "ImportSuccesfuly Inicio :"+ahora+ " Fin :" + new Date();
    }

    @GetMapping("/exportar")
    public String exportar(Model model) {
        model.addAttribute("ingresante", ir.findAll());
        return "ingresantes-lista";
    }
}

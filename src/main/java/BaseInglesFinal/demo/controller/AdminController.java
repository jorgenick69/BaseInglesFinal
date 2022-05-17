/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseInglesFinal.demo.controller;

import BaseInglesFinal.demo.Excel.IngresanteExcelImporter;
import BaseInglesFinal.demo.entity.Examen;
import BaseInglesFinal.demo.entity.Ingresante;
import BaseInglesFinal.demo.entity.Usuario;
import BaseInglesFinal.demo.repository.IngresanteRepository;
import BaseInglesFinal.demo.repository.UsuarioRepository;
import BaseInglesFinal.demo.service.ExamenService;
import BaseInglesFinal.demo.service.IngresanteService;
import BaseInglesFinal.demo.service.UsuarioService;
import BaseInglesFinal.demo.util.Utiles;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
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

@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private ExamenService es;
    @Autowired
    private Utiles ut;
    @Autowired
    private IngresanteService is;
    @Autowired
    private IngresanteRepository ir;
    @Autowired
    private UsuarioRepository ur;

    @GetMapping("/listall")
    public String add(Model model) {
        List<Examen> examenes = es.findAllExamen();
        model.addAttribute("examenes", examenes);
        return "listarexamenes";
    }

    @GetMapping("")
    public String home() {

        return "home-admin";
    }

    @GetMapping("/crear-ingresante")
    public String addIngresante(Model model) {
        Ingresante ingresante = new Ingresante();
        model.addAttribute("ingresante", ingresante);
        model.addAttribute("listaEgresadoDe", ut.devolverSosEgregadoDe());
        model.addAttribute("listaEstablecimientos", ut.devolverEstablecimientos());
        return "crear-modificar-ingresante";
    }

    @GetMapping("/editar-ingresante")
    public String modifyIngresante(Model model, @RequestParam(required = false, name = "id") Long id) {
        if (is.findIngresanteById(id) != null) {
            Ingresante ingresante = is.findIngresanteById(id);
            model.addAttribute("ingresante", ingresante);
            model.addAttribute("listaEgresadoDe", ut.devolverSosEgregadoDe());
            model.addAttribute("listaEstablecimientos", ut.devolverEstablecimientos());
            return "crear-modificar-ingresante";
        } else {
            Ingresante ingresante = new Ingresante();
            model.addAttribute("ingresante", ingresante);
            model.addAttribute("listaEgresadoDe", ut.devolverSosEgregadoDe());
            model.addAttribute("listaEstablecimientos", ut.devolverEstablecimientos());
            model.addAttribute("mensaje", "NO EXISTE EL REGISTRO CON ID " + id);
            return "panel-administracion-ingresantes";

        }
    }

    @GetMapping("/eliminar-ingresante")
    public String deleteIngresante(Model model, @RequestParam(required = false, name = "id") Long id) {
        Ingresante eliminado = is.findIngresanteById(id);

        if (eliminado != null) {

            is.deleteIngresante(eliminado);
            Ingresante ingresante = new Ingresante();
            model.addAttribute("ingresante", ingresante);
            model.addAttribute("listaEgresadoDe", ut.devolverSosEgregadoDe());
            model.addAttribute("listaEstablecimientos", ut.devolverEstablecimientos());
            model.addAttribute("mensaje", "SE ELIMINO AL INGRESANTE " + eliminado.getNombre() + " " + eliminado.getApellido());
            return "panel-administracion-ingresantes";

        } else {
            Ingresante ingresante = new Ingresante();

            model.addAttribute("ingresante", ingresante);
            model.addAttribute("listaEgresadoDe", ut.devolverSosEgregadoDe());
            model.addAttribute("listaEstablecimientos", ut.devolverEstablecimientos());
            model.addAttribute("mensaje", "NO SE ENCONTRO EL REGISTRO CON ID " + id);
            return "panel-administracion-ingresantes";

        }
    }

    @PostMapping("/guardar-ingresante")
    public String guardarIngresante(Ingresante ingresante, Model model) {
        Ingresante inFormulario = ingresante;
        Ingresante guardar;
        if (inFormulario.getId() != null && is.findIngresante(ingresante) != null) {
            guardar = is.crearIngresante(inFormulario, is.findIngresante(ingresante));
        } else {
            guardar = is.crearIngresante(inFormulario, null);
        }
        Ingresante comparador = is.findIngresanteByDoc(guardar.getNumDoc());
        if (comparador == null) {
            is.saveIngresante(guardar);
            model.addAttribute("mensaje", "El ingresante " + guardar.getNombre() + " " + guardar.getApellido() + " fue guardado con exito");
        } else {
            is.saveIngresante(is.crearIngresante(guardar, comparador));
            model.addAttribute("mensaje", "El ingresante con dni " + guardar.getNumDoc() + " se modifico con exito");
        }
        Ingresante ingresante2 = new Ingresante();
        model.addAttribute("ingresante", ingresante2);
        model.addAttribute("listaEgresadoDe", ut.devolverSosEgregadoDe());
        model.addAttribute("listaEstablecimientos", ut.devolverEstablecimientos());

        return "panel-administracion-ingresantes";

    }

    @GetMapping("/administrar")
    public String subir(Model model) {
        Ingresante ingresante = new Ingresante();
        model.addAttribute("ingresante", ingresante);
        model.addAttribute("listaEgresadoDe", ut.devolverSosEgregadoDe());
        model.addAttribute("listaEstablecimientos", ut.devolverEstablecimientos());
        return "panel-administracion-ingresantes";
    }

    @PostMapping("/import/excel")

    public String ImportToMySql(@RequestParam("file") MultipartFile file, Model model) throws IOException {
        try {
            Date fecha1 = new Date();
            IngresanteExcelImporter excelImporter = new IngresanteExcelImporter();
            List<Ingresante> lista = excelImporter.excelImport(file);
            List<Ingresante> listaVerificadaPaso1 = ut.evitarDocDuplicadosPaso1(lista);
            List<Ingresante> listaComparativaBase = is.findAllIngresante();
            List<Ingresante> listaFinal = ut.evitarDocDuplicadosPaso1(listaComparativaBase, listaVerificadaPaso1);

            System.out.println("El tamaño de la lista es!!!!!!!!!!! " + lista.size());
            ir.saveAll(listaFinal);
            Date fecha2 = new Date();
            long diferencia = fecha2.getTime() - fecha1.getTime();

            var minutos = (TimeUnit.MILLISECONDS.toSeconds(diferencia));
            Ingresante ingresante = new Ingresante();
            model.addAttribute("ingresante", ingresante);
            model.addAttribute("listaEgresadoDe", ut.devolverSosEgregadoDe());
            model.addAttribute("listaEstablecimientos", ut.devolverEstablecimientos());
            model.addAttribute("mensaje", "La importacion se realizo correctamente en " + minutos + " segundos con un total de " + listaFinal.size() + " registros");
            return "panel-administracion-ingresantes";
        } catch (Exception e) {
            Ingresante ingresante = new Ingresante();
            model.addAttribute("ingresante", ingresante);
            model.addAttribute("listaEgresadoDe", ut.devolverSosEgregadoDe());
            model.addAttribute("listaEstablecimientos", ut.devolverEstablecimientos());
            model.addAttribute("mensaje", "Se a generado un error en la carga intente nuevamente");
            return "panel-administracion-ingresantes";
        }

    }

    @GetMapping("/exportar")
    public String exportar(Model model,
            @RequestParam(required = false, name = "query") String query,
            @RequestParam(required = false, name = "desde") String desde,
            @RequestParam(required = false, name = "hasta") String hasta,
            @RequestParam(required = false, name = "genero") String genero,
            @RequestParam(required = false, name = "encuesta") String encuenta,
            @RequestParam(required = false, name = "examen") String examen,
            @RequestParam(required = false, defaultValue = "ASC") String order
    ) {
        List<Ingresante> lista = new ArrayList<>();
        if (query.equalsIgnoreCase("") && desde.equalsIgnoreCase("") && hasta.equalsIgnoreCase("") && genero.equalsIgnoreCase("") && encuenta.equalsIgnoreCase("") && examen.equalsIgnoreCase("")) {
            lista = is.findAllIngresante();
        } else {
            if (query.equalsIgnoreCase("")) {
                query = null;
            }
            if (encuenta.equalsIgnoreCase("")) {
                encuenta = null;
            }
            if (examen.equalsIgnoreCase("")) {
                examen = null;
            }
            if (genero.equalsIgnoreCase("")) {
                genero = null;
            }
            lista = is.getByFilter(query, desde, hasta, genero, encuenta, examen, order);
        }

        Integer mujeres = 0;
        Integer varones = 0;
        Integer otros = 0;
        Integer encuentaT = 0;
        Integer examenT = 0;
        for (Ingresante in : lista) {
            if (in.getI_estado() != false) {
                encuentaT++;
            }
            if (in.getI_examen() != false) {
                examenT++;
            }
            if (in.getGenero() != null) {
                if (!in.getGenero().equalsIgnoreCase("femenino") && !in.getGenero().equalsIgnoreCase("masculino")) {
                    otros++;
                }
                if (in.getGenero().equalsIgnoreCase("femenino")) {
                    mujeres++;
                }
                if (in.getGenero().equalsIgnoreCase("femenino")) {
                    varones++;
                }
            }
        }
        Integer tamaño = lista.size();
        model.addAttribute("ingre", lista);
        model.addAttribute("sudo", lista);
        model.addAttribute("quer", query);
        model.addAttribute("des", desde);
        model.addAttribute("has", hasta);
        model.addAttribute("gen", genero);
        model.addAttribute("enc", encuenta);
        model.addAttribute("exam", examen);
        model.addAttribute("ord", order);
        model.addAttribute("cantidadRegistros", tamaño);
        model.addAttribute("rMujeres", mujeres);
        model.addAttribute("rHombres", varones);
        model.addAttribute("rOtros", otros);
        model.addAttribute("rEncuesta", encuentaT);
        model.addAttribute("rExamen", examenT);
        String mensaje = ut.creador(query);
        model.addAttribute("mensaje", mensaje);

        return "ingresantes-lista";
    }

    @GetMapping("/administrar-user")
    public String adminUser(Model model) {
        Usuario usuario = new Usuario();
        model.addAttribute("usuario", usuario);
        model.addAttribute("listaUsuarios", ur.findAll());
        for (Usuario usuario1 : ur.findAll()) {
            System.out.println(usuario1.toString());
        }

        return "crear-user";
    }

    @PostMapping("/guardar-user")
    public String guardarUser(Usuario usuario, Model model) {
        List<Usuario> userlist = ur.findAll();
        Boolean validador = true;
        System.out.println(usuario.toString());
        for (Usuario usu : userlist) {
            if (usu.getEmail().equalsIgnoreCase(usuario.getEmail())) {
                validador = false;
            }
        }
        if (validador) {
            ur.save(usuario);
            model.addAttribute("mensaje", "El usuario " + usuario.getEmail() + " se a creado con exito");
            model.addAttribute("listaUsuarios", ur.findAll());
            Usuario usuario2 = new Usuario();
            model.addAttribute("usuario", usuario2);
            return "crear-user";
        } else {
            model.addAttribute("mensaje", "El usuario " + usuario.getEmail() + " ya existe no es posible cargarlo");
            model.addAttribute("listaUsuarios", ur.findAll());
            Usuario usuario2 = new Usuario();
            model.addAttribute("usuario", usuario2);
            return "crear-user";
        }

    }

    @GetMapping("/eliminar-user")
    public String deleteUser(Model model, @RequestParam(required = false, name = "id") Long id) {
        Usuario eliminado = ur.findById(id).orElse(null);

        if (eliminado != null) {

            ur.delete(eliminado);

            model.addAttribute("listaUsuarios", ur.findAll());
            Usuario usuario2 = new Usuario();
            model.addAttribute("usuario", usuario2);
            model.addAttribute("mensaje", "SE ELIMINO AL USUARIO " + eliminado.getNombre() + " " + eliminado.getApellido());
            return "crear-user";

        } else {
            model.addAttribute("listaUsuarios", ur.findAll());
            Usuario usuario2 = new Usuario();
            model.addAttribute("usuario", usuario2); 
            
            model.addAttribute("mensaje", "EL USUARIO NO EXISTE");
            return "crear-user";

        }
    }

}

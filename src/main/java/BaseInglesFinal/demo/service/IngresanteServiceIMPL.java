/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseInglesFinal.demo.service;

import BaseInglesFinal.demo.entity.Examen;
import BaseInglesFinal.demo.entity.Ingresante;
import BaseInglesFinal.demo.filters.IngresanteFilterDto;
import BaseInglesFinal.demo.repository.IngresanteRepository;
import BaseInglesFinal.demo.repository.IngresanteSpecification;
import BaseInglesFinal.demo.util.Utiles;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author jorge
 */
@Service
public class IngresanteServiceIMPL implements IngresanteService {
@Autowired
IngresanteSpecification ingresanteSpecification;
    @Autowired
    private IngresanteRepository ir;
    @Autowired
    private Utiles uti;

    @Transactional
    @Override
    public List<Ingresante> devolverListaParaImportar(List<Ingresante> lista) {
        List<Ingresante> listaGuardar = new ArrayList<>();
        for (Ingresante in : lista) {
            if (in.getId() != null && ir.findById(in.getId()) != null) {

                Ingresante nuevo = ir.findById(in.getId()).orElse(null);
                nuevo.setApellido(in.getApellido());
                nuevo.setNombre(in.getNombre());
                nuevo.setNumDoc(in.getNumDoc());
                nuevo.setMail(in.getMail());
                nuevo.setE_egresadoDe(in.getE_egresadoDe());
                nuevo.setE_establecimiento(in.getE_establecimiento());
                listaGuardar.add(nuevo);

            } else {
                listaGuardar.add(in);
            }
        }
        return listaGuardar;
    }

    @Override
    public Ingresante createIngresante(Ingresante ingresante) {

        ingresante.setExamen(new Examen());
        return ingresante;
    }

    @Transactional(readOnly = true)
    @Override
    public List<Ingresante> findAllIngresante() {
        return (List<Ingresante>) ir.findAll();

    }

    @Transactional
    @Override
    public Ingresante saveIngresante(Ingresante ingresante) {
        return ir.save(ingresante);
    }

    @Transactional
    @Override
    public void deleteIngresante(Ingresante ingresante) {
        ir.delete(ingresante);
    }

    @Transactional(readOnly = true)
    @Override
    public Ingresante findIngresante(Ingresante ingresante) {
        return ir.findById(ingresante.getId()).orElse(null);
    }

    @Transactional(readOnly = true)
    @Override
    public Ingresante findIngresanteById(Long id) {
        return ir.findById(id).orElse(null);
    }

    @Transactional(readOnly = true)
    @Override
    public Ingresante findIngresanteByDoc(String numDoc) {
        return ir.findByNumDoc(numDoc);
    }

    @Transactional
    @Override
    public Ingresante guardarDDuros(Ingresante ingresante) {
        Ingresante modificado = findIngresanteById(ingresante.getId());

        modificado.setMail(ingresante.getMail());
        modificado.setTDoc(ingresante.getTDoc());
        modificado.setCelu(ingresante.getCelu());
        modificado.setFNacimiento(ingresante.getFNacimiento());
        modificado.setGenero(ingresante.getGenero());
        modificado.setNacionalidad(ingresante.getNacionalidad());
        modificado.setPais(ingresante.getPais());
        modificado.setProvincia(ingresante.getProvincia());
        modificado.setLocalidadResi(ingresante.getLocalidadResi());
        modificado.setDomicilio(ingresante.getDomicilio());
        modificado.setLocalidadResi(uti.comprobardorDecomas(ingresante.getLocalidadResi()));
        modificado.setD_estado(true);
        return modificado;
    }

    @Transactional
    @Override
    public Ingresante guardarEncuenta(Ingresante ingresante) {
        Ingresante modificado = findIngresanteById(ingresante.getId());
        modificado.setE_nivelMaximo(ingresante.getE_nivelMaximo());
        modificado.setE_egresadoDe(ingresante.getE_egresadoDe());
        modificado.setE_establecimiento(ingresante.getE_establecimiento());
        modificado.setE_anioEgreso(ingresante.getE_anioEgreso());
        modificado.setE_estado(true);
        modificado.setT_situacionActual(ingresante.getT_situacionActual());
        modificado.setT_relacion(ingresante.getT_relacion());
        modificado.setT_actividadPrincipal(ingresante.getT_actividadPrincipal());
        modificado.setT_roles(ingresante.getT_roles());
        modificado.setT_duracion(ingresante.getT_duracion());
        modificado.setT_antiguedad(ingresante.getT_antiguedad());
        modificado.setT_aniosDelSector(ingresante.getT_aniosDelSector());
        modificado.setT_estudiosSector(ingresante.getT_estudiosSector());
        modificado.setT_aportesJ(ingresante.getT_aportesJ());
        modificado.setT_plataPara(ingresante.getT_plataPara());
        modificado.setT_horas(ingresante.getT_horas());
        modificado.setT_franja(ingresante.getT_franja());
        modificado.setT_estado(true);
        return modificado;
    }
 @Transactional
    @Override
    public Ingresante guardarNivel(Ingresante ingresante, String i_uso_t_situacion_otro, String i_donde_otro) {
        Ingresante modificado = findIngresanteById(ingresante.getId());
        modificado.setI_estudiaste(ingresante.getI_estudiaste());
      
        if (ingresante.getI_donde().equalsIgnoreCase("Otro")) {
            modificado.setI_donde(i_donde_otro);
        } else {
            modificado.setI_donde(ingresante.getI_donde());
        }

        modificado.setI_nivel_oral(ingresante.getI_nivel_oral());
        modificado.setI_nivel_escrito(ingresante.getI_nivel_escrito());
        modificado.setI_nivel_lectura(ingresante.getI_nivel_lectura());
        modificado.setI_uso_trabajo(ingresante.getI_uso_trabajo());
        
        
        if (ingresante.getI_uso_t_situacion().equalsIgnoreCase("Otro")) {
            modificado.setI_uso_t_situacion(i_uso_t_situacion_otro);
        } else {
            modificado.setI_uso_t_situacion(ingresante.getI_uso_t_situacion());
        }

        modificado.setI_conseguirOportunidades(ingresante.getI_conseguirOportunidades());
        modificado.setI_programacion(ingresante.getI_programacion());
        modificado.setI_cercerProfecionalmente(ingresante.getI_cercerProfecionalmente());
        modificado.setI_valorTiempo(ingresante.getI_valorTiempo());
        modificado.setI_estado(true);
        modificado.setFechaEncuenta(new Date());

        return modificado;
    }

    @Override
    public Ingresante crearIngresante(Ingresante ingresante,Ingresante ingresanteModificado) {
        Ingresante retorno;
        if (ingresanteModificado==null) {
           retorno=new Ingresante();
        } else {
        retorno=ingresanteModificado;
        }
        
        retorno.setId(ingresante.getId());
        retorno.setApellido(ingresante.getApellido());
        retorno.setNombre(ingresante.getNombre());
        retorno.setNumDoc(ingresante.getNumDoc());
        retorno.setMail(ingresante.getMail());
        retorno.setE_egresadoDe(ingresante.getE_egresadoDe());
        retorno.setE_establecimiento(ingresante.getE_establecimiento());
        return retorno;
    }


 @Transactional(readOnly = true)
    @Override
    public List<Ingresante> getByFilter(String query, String desde, String hasta, String genero, String encuenta, String examen,String order) {
        IngresanteFilterDto ifd= new IngresanteFilterDto( query,  query, query,  query, genero,  query,  query, query, desde, hasta, encuenta, examen, order);
      System.out.println("nombre "+ifd.getNombre());
      System.out.println("apellido "+ifd.getApellido());
      System.out.println("genero "+ifd.getGenero());
      System.out.println("nacionalidad "+ifd.getNacionalidad());
      System.out.println("mail "+ ifd.getMail());
      System.out.println("numdocumento "+ifd.getNumDoc());
      System.out.println("provincia "+ifd.getProvincia());
      System.out.println("pais "+ifd.getPais());
      
        List <Ingresante>lista=ir.findAll(ingresanteSpecification.getByFilters(ifd));
    return lista;
    }

    
}

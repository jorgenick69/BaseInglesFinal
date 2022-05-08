/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseInglesFinal.demo.service;
import BaseInglesFinal.demo.entity.Examen;
import BaseInglesFinal.demo.entity.Ingresante;
import BaseInglesFinal.demo.repository.IngresanteRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
/**
 *
 * @author jorge
 */
@Service
public class IngresanteServiceIMPL implements IngresanteService {

    @Autowired
    private IngresanteRepository ir;

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

}

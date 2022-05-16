/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseInglesFinal.demo.filters;

import java.util.Date;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author jorge
 */
@Data
public class IngresanteFilterDto {

    private String nombre;
    private String numDoc;
    private String apellido;
    private String nacionalidad;
    private String genero;
    private String mail;
    private String pais;
    private String provincia;
    private String desde;
    private String hasta;
    private String encuenta;
    private String examen;
    private String order;

  

    public IngresanteFilterDto(String nombre, String numDoc, String apellido, String nacionalidad, String genero, String mail, String pais, String provincia, String desde, String hasta, String encuenta, String examen, String order) {
        this.nombre = nombre;
        this.numDoc = numDoc;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.genero = genero;
        this.mail = mail;
        this.pais = pais;
        this.provincia = provincia;
        this.desde = desde;
        this.hasta = hasta;
        this.encuenta = encuenta;
        this.examen = examen;
        this.order = order;
    }
    public boolean isASC(){
    return this.order.compareToIgnoreCase("ASC")==0;
    }
    public boolean isDESC(){
    return this.order.compareToIgnoreCase("DESC")==0;
    }

}

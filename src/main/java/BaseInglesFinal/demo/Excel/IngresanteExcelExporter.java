/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseInglesFinal.demo.Excel;

import BaseInglesFinal.demo.entity.Ingresante;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

/**
 *
 * @author jorge
 */
@Component("ingresantes-lista.xlsx")
public class IngresanteExcelExporter extends AbstractXlsxView {

    @Override
    protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request, HttpServletResponse response) throws Exception {

        response.setHeader("Content-Disposition", "attachment; filename=\"listado-ingresantes.xlsx\"");
        Sheet hoja = workbook.createSheet("Ingresantes");
        Row filaTitulo = hoja.createRow(0);
        Cell celda = filaTitulo.createCell(0);
        celda.setCellValue("Listado de ingresantes");
        Row filaData = hoja.createRow(1);

        String[] comlunas = {
            "ID",
            "Nombre",
            "Apellido",
            "Documento",
            "mail",
            "Sos egresado/a de...",
            "Establecimiento educativo de egreso",
            "fecha examen",
            "Respuestas correctas",
            "Teléfono Celular",
            "Tipo de documento",
            "Fecha de nacimiento",
            "genero",
            "Nacionalidad",
            "País",
            "Provincia",
            "Localidad de residencia",
            "Domicilio",
            "Máximo nivel educativo alcanzado",
            "Año de egreso",
            "¿Cuál es tu situación laboral actual?",
            "Vos trabajás…",
            "Por favor indicá cuál es la rama principal de actividad de la organización en donde trabajás.",
            "En tu trabajo ¿ocupás alguno de los siguientes roles relacionados con el perfil IT?",
            "Ese trabajo es...",
            "¿Qué antigüedad tenés en el trabajo actual? Si tenés más de uno elegí el que considerás tu principal fuente de ingresos.",
            "¿Cuántos años hace que trabajás en el sector?",
            "Cuando iniciaste a trabajar en ese sector: ¿tenías estudios en el mismo sector?",
            "Por ese trabajo ¿te realizan descuentos jubilatorios?",
            "Los ingresos obtenidos en este trabajo son...",
            "¿Cuántas horas semanales trabajás habitualmente?",
            "¿En qué franja horaria trabajás?",
            "¿Estudiaste inglés en alguna oportunidad?",
            "Especificá dónde",
            "nivel oral",
            "nivel escrito",
            "nivel lectura",
            "¿Has tenido que utilizar el idioma ingles en alguna situación laboral?",
            "Indicá en que tipo de situación..",
            "i. Para conseguir mayores y mejores oportunidades laborales en el sector informático es un requisito indispensable contar con conocimiento del idioma inglés.",
            "ii. Para tener mayor capacidad de comprensión y desarrollo de código y lenguajes de programación, es necesario tener conocimiento del idioma inglés.",
            "iii. Para crecer profesionalmente y/o tener mayores oportunidades laborales es necesario manejar fluidamente el idioma inglés.",
            "iv. Aprender inglés es una inversión de tiempo y esfuerzo a largo plazo muy enriquecedora."};
        for (int i = 0; i < comlunas.length; i++) {
            celda = filaData.createCell(i);
            celda.setCellValue(comlunas[i]);
        }
//        List<Ingresante> Ingresantes = (List<Ingresante>) model.get("ingre");
        List<Ingresante> ingresantes = (List<Ingresante>) model.get("sudo");
        int numFila = 2;
        for (Ingresante in : ingresantes) {
            filaData = hoja.createRow(numFila);
            
            if (in.getId()!=null) {
                 filaData.createCell(0).setCellValue(in.getId());//
            } else {
                 filaData.createCell(0).setCellValue("");//
            }
           
            if (in.getNombre()!=null) {
                filaData.createCell(1).setCellValue(in.getNombre());//
            } else {
                filaData.createCell(1).setCellValue("");//
            }
            
            if (in.getApellido()!=null) {
                filaData.createCell(2).setCellValue(in.getApellido());//
            } else {
                filaData.createCell(2).setCellValue("");//
            }
            
            if (in.getNumDoc()!=null) {
                filaData.createCell(3).setCellValue(in.getNumDoc());
            } else {
                filaData.createCell(3).setCellValue("");
            }
            
            if (in.getMail()!=null) {
                 filaData.createCell(4).setCellValue(in.getMail());
            } else {
                 filaData.createCell(4).setCellValue("");
            }
           
            if (in.getE_egresadoDe()!=null) {
                filaData.createCell(5).setCellValue(in.getE_egresadoDe());
            } else {
                filaData.createCell(5).setCellValue("");
            }
            
            if (in.getE_establecimiento()!=null) {
                 filaData.createCell(6).setCellValue(in.getE_establecimiento());
            } else {
                 filaData.createCell(6).setCellValue("");
            }
           
            if (in.getExamen()!=null) {
            
                if (in.getExamen().getFechaDeFinalizacion()!=null) {
                    filaData.createCell(7).setCellValue(in.getExamen().getFechaDeFinalizacion().toLocaleString()); 
                } else {
                     filaData.createCell(7).setCellValue("");
                }
            
                if (in.getExamen().getR_Correctas()!=null) {
                     filaData.createCell(8).setCellValue(in.getExamen().getR_Correctas());
                } else {
                     filaData.createCell(8).setCellValue("");
                }
            }else{
            
                filaData.createCell(7).setCellValue("");
            
                filaData.createCell(8).setCellValue("");
            }
            if (in.getCelu()!=null) {
                filaData.createCell(9).setCellValue(in.getCelu());
            } else {
                filaData.createCell(9).setCellValue("");
            }
            
            if (in.getTDoc()!=null) {
                filaData.createCell(10).setCellValue(in.getTDoc());
            } else {
                filaData.createCell(10).setCellValue("");
            }
            
            if (in.getFNacimiento()!=null) {
                filaData.createCell(11).setCellValue(in.getFNacimiento());
            } else {
                filaData.createCell(11).setCellValue("");
            }
            
            if (in.getGenero()!=null) {
                 filaData.createCell(12).setCellValue(in.getGenero());
            } else {
                 filaData.createCell(12).setCellValue("");
            }
           
            if (in.getNacionalidad()!=null) {
                filaData.createCell(13).setCellValue(in.getNacionalidad());
            } else {
                filaData.createCell(13).setCellValue("");
            }
            
            if (in.getPais()!=null) {
                 filaData.createCell(14).setCellValue(in.getPais());
            } else {
                 filaData.createCell(14).setCellValue("");
            }
           
            if (in.getProvincia()!=null) {
               filaData.createCell(15).setCellValue(in.getProvincia()); 
            } else {
                filaData.createCell(15).setCellValue("");
            }
            
            if (in.getLocalidadResi()!=null) {
                filaData.createCell(16).setCellValue(in.getLocalidadResi());
            } else {
                filaData.createCell(16).setCellValue("");
            }
            
            if (in.getDomicilio()!=null) {
                 filaData.createCell(17).setCellValue(in.getDomicilio());
            } else {
                 filaData.createCell(17).setCellValue("");
            }
           
            if (in.getE_nivelMaximo()!=null) {
                filaData.createCell(18).setCellValue(in.getE_nivelMaximo());
            } else {
                filaData.createCell(18).setCellValue("");
            }
            
            if (in.getE_anioEgreso()!=null) {
                  filaData.createCell(19).setCellValue(in.getE_anioEgreso());
            } else {
                  filaData.createCell(19).setCellValue("");
            }
          
            if (in.getT_situacionActual()!=null) {
                filaData.createCell(20).setCellValue(in.getT_situacionActual());
            } else {
                filaData.createCell(20).setCellValue("");
            }
            
            if (in.getT_relacion()!=null) {
                filaData.createCell(21).setCellValue(in.getT_relacion());
            } else {
                filaData.createCell(21).setCellValue("");
            }
            
            if (in.getT_actividadPrincipal()!=null) {
                 filaData.createCell(22).setCellValue(in.getT_actividadPrincipal());
            } else {
                 filaData.createCell(22).setCellValue("");
            }
           
            if (in.getT_roles()!=null) {
                 filaData.createCell(23).setCellValue(in.getT_roles());
            } else {
                 filaData.createCell(23).setCellValue("");
            }
           
            if (in.getT_duracion()!=null) {
                 filaData.createCell(24).setCellValue(in.getT_duracion());
            } else {
                 filaData.createCell(24).setCellValue("");
            }
           
            if (in.getT_antiguedad()!=null) {
                 filaData.createCell(25).setCellValue(in.getT_antiguedad());
            } else {
                 filaData.createCell(25).setCellValue("");
            }
           
            if (in.getT_aniosDelSector()!=null) {
                filaData.createCell(26).setCellValue(in.getT_aniosDelSector());
            } else {
                filaData.createCell(26).setCellValue("");
            }
            
            if (in.getT_estudiosSector()!=null) {
                 filaData.createCell(27).setCellValue(in.getT_estudiosSector());
            } else {
                 filaData.createCell(27).setCellValue("");
            }
           
            if (in.getT_aportesJ()!=null) {
                 filaData.createCell(28).setCellValue(in.getT_aportesJ());
            } else {
                 filaData.createCell(28).setCellValue("");
            }
           
            if (in.getT_plataPara()!=null) {
                filaData.createCell(29).setCellValue(in.getT_plataPara());
            } else {
                filaData.createCell(29).setCellValue("");
            }
            
            if (in.getT_horas()!=null) {
                filaData.createCell(30).setCellValue(in.getT_horas());
            } else {
                filaData.createCell(30).setCellValue("");
            }
            
            if (in.getT_franja()!=null) {
                filaData.createCell(31).setCellValue(in.getT_franja());
            } else {
                filaData.createCell(31).setCellValue("");
            }
            
            if (in.getI_estudiaste()!=null) {
                 filaData.createCell(32).setCellValue(in.getI_estudiaste());
            } else {
                 filaData.createCell(32).setCellValue("");
            }
           
            if (in.getI_donde()!=null) {
                  filaData.createCell(33).setCellValue(in.getI_donde());
            } else {
                filaData.createCell(33).setCellValue("");
            }
            
            if (in.getI_nivel_oral()!=null) {
                filaData.createCell(34).setCellValue(in.getI_nivel_oral());
            } else {
                filaData.createCell(34).setCellValue("");
            }
            
            if (in.getI_nivel_escrito()!=null) {
                   filaData.createCell(35).setCellValue(in.getI_nivel_escrito());
            } else {
                   filaData.createCell(35).setCellValue("");
            }
         
            if (in.getI_nivel_lectura()!=null) {
                filaData.createCell(36).setCellValue(in.getI_nivel_lectura());
            } else {
                filaData.createCell(36).setCellValue("");
            }
            
            if (in.getI_uso_trabajo()!=null) {
                filaData.createCell(37).setCellValue(in.getI_uso_trabajo());
            } else {
                filaData.createCell(37).setCellValue("");
            }
            
            if (in.getI_uso_t_situacion()!=null) {
                filaData.createCell(38).setCellValue(in.getI_uso_t_situacion());
            } else {
                filaData.createCell(38).setCellValue("");
            }
            
            if (in.getI_conseguirOportunidades()!=null) {
                filaData.createCell(39).setCellValue(in.getI_conseguirOportunidades());
            } else {
                filaData.createCell(39).setCellValue("");
            }
            
            if (in.getI_programacion()!=null) {
                filaData.createCell(40).setCellValue(in.getI_programacion());
            } else {
                filaData.createCell(40).setCellValue("");
            }
            
            if (in.getI_cercerProfecionalmente()!=null) {
                filaData.createCell(41).setCellValue(in.getI_cercerProfecionalmente());
            } else {
                 filaData.createCell(41).setCellValue("");
            }
            
            if (in.getI_valorTiempo()!=null) {
                filaData.createCell(42).setCellValue(in.getI_valorTiempo());
            } else {
                filaData.createCell(42).setCellValue("");
            }
           

            numFila++;
        }
    }

}

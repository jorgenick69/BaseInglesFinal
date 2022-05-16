/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseInglesFinal.demo.repository;

import BaseInglesFinal.demo.entity.Ingresante;
import BaseInglesFinal.demo.filters.IngresanteFilterDto;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.springframework.data.jpa.domain.Specification;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

/**
 *
 * @author jorge
 */
@Component
public class IngresanteSpecification {
    public Specification<Ingresante>getByFilters(IngresanteFilterDto ifd){
     return (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();

            if (StringUtils.hasLength(ifd.getApellido())){
                predicates.add(
                        criteriaBuilder.like(
                                criteriaBuilder.lower(root.get("apellido")),
                                "%" + ifd.getApellido().toLowerCase() + "%"
                        )
                );

            }
            if (StringUtils.hasLength(ifd.getMail())){
                predicates.add(
                        criteriaBuilder.like(
                                criteriaBuilder.lower(root.get("mail")),
                                "%" + ifd.getMail().toLowerCase() + "%"
                        )
                );

            }
            if (StringUtils.hasLength(ifd.getNacionalidad())){
                predicates.add(
                        criteriaBuilder.like(
                                criteriaBuilder.lower(root.get("nacionalidad")),
                                "%" + ifd.getNacionalidad().toLowerCase() + "%"
                        )
                );

            }
            if (StringUtils.hasLength(ifd.getNombre())){
                predicates.add(
                        criteriaBuilder.like(
                                criteriaBuilder.lower(root.get("nombre")),
                                "%" + ifd.getNombre().toLowerCase() + "%"
                        )
                );

            }
            
            if (StringUtils.hasLength(ifd.getNumDoc())){
                predicates.add(
                        criteriaBuilder.like(
                                criteriaBuilder.lower(root.get("numDoc")),
                                "%" + ifd.getNumDoc().toLowerCase() + "%"
                        )
                );

            }
            if (StringUtils.hasLength(ifd.getGenero())){
                predicates.add(
                        criteriaBuilder.like(
                                criteriaBuilder.lower(root.get("genero")),
                                "%" + ifd.getGenero().toLowerCase() + "%"
                        )
                );

            }
            if (StringUtils.hasLength(ifd.getPais())){
                predicates.add(
                        criteriaBuilder.like(
                                criteriaBuilder.lower(root.get("pais")),
                                "%" + ifd.getPais().toLowerCase() + "%"
                        )
                );

            }
            if (StringUtils.hasLength(ifd.getProvincia())){
                predicates.add(
                        criteriaBuilder.like(
                                criteriaBuilder.lower(root.get("provincia")),
                                "%" + ifd.getProvincia().toLowerCase() + "%"
                        )
                );

            }
            if (ifd.getDesde()!= null && ifd.getHasta() !=null ){
                
                try {
                    SimpleDateFormat desde = new SimpleDateFormat("yyyy-MM-dd");
                    SimpleDateFormat hasta = new SimpleDateFormat("yyyy-MM-dd");
                    Date desde2 = desde.parse(ifd.getDesde());
                    Date hasta2 = hasta.parse(ifd.getHasta());
                    predicates.add(
                            criteriaBuilder.between(root.<Date>get("fechaEncuenta"), desde2, hasta2)
                     );
                } catch (ParseException ex) {
                    Logger.getLogger(IngresanteSpecification.class.getName()).log(Level.SEVERE, null, ex);
                }


            }                  
            
            
            
            if (ifd.getEncuenta() != null){
                if (ifd.getEncuenta().equalsIgnoreCase("si")) {
                    predicates.add(
                       criteriaBuilder.isTrue(root.get("i_estado").as(Boolean.class)));
                            
            
                } else {
                     predicates.add(
                        criteriaBuilder.isFalse(root.get("i_estado").as(Boolean.class)));
                }                
               
            }
            if (ifd.getExamen() != null){
                if (ifd.getExamen().equalsIgnoreCase("si")) {
                    predicates.add(
                       criteriaBuilder.isTrue(root.get("i_examen").as(Boolean.class)));
                            
            
                } else {
                     predicates.add(
                        criteriaBuilder.isFalse(root.get("i_examen").as(Boolean.class)));
                }                
               
            }


            

            query.distinct(true);


            String order = "apellido";

            query.orderBy(
                    ifd.isASC()?
                            criteriaBuilder.asc(root.get(order)) :
                            criteriaBuilder.desc(root.get(order))
            );

            return criteriaBuilder.or(predicates.toArray(new Predicate[0]));

        };
    }
}
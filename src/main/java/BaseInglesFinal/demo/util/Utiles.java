/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseInglesFinal.demo.util;

import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author jorge
 */
@Component
public class Utiles {

    public String comprobardorDecomas(String cadena) {

        String nueva = "";
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ',') {
                nueva = nueva + cadena.charAt(i);
            } else {
                nueva = nueva + "";
            }
        }
        return nueva;
    }

    public List<String> devolverProvincias() {
        List<String> listaProvincias = Arrays.asList("Buenos Aires", "Catamarca", "Chaco", "Chubut", "Ciudad Autonoma de Buenos Aires", "Cordoba", "Corrientes", "Entre Rios", "Formosa", "Jujuy", "La Pampa", "La Rioja", "Mendoza", "Misiones", "Neuquen", "Rio Negro", "Salta", "San Juan", "San Luis", "Santa Cruz", "Santa Fe", "Santiago del Estero", "Tierra del Fuego", "Tucuman");
        return listaProvincias;
    }

    public List<String> devolverLocalidades() {

        List<String> listaDeLocalidadesGcba = Arrays.asList("Adolfo Alsina", "Adolfo Gonzales Chaves", "Alberti", "Almirante Brown", "Arrecifes", "Avellaneda", "Ayacucho", "Azul", "Bahía Blanca", "Balcarce", "Baradero", "Benito Juárez", "Berazategui", "Berisso", "Bolívar", "Bragado", "Brandsen", "Campana", "Cañuelas", "Capitán Sarmiento Carlos", "Carlos Casares", "Carlos Tejedor", "Carmen de Areco", "Castelli", "Chacabuco", "Chascomús", "Chivilcoy", "Colón", "Coronel de Marina Leonardo Rosales", "Coronel Dorrego", "Coronel Pringles", "Coronel Suárez", "Daireaux", "Dolores", "Ensenada", "Escobar", "Esteban Echeverría", "Exaltación de la Cruz", "Ezeiza", "Florencio Varela", "Florentino Ameghino", "General Alvarado", "General Alvear", "General Arenales", "General Belgrano", "General Guido", "General Juan Madariaga", "General La Madrid", "General Las Heras", "General Lavalle", "General Paz", "General Pinto", "General Pueyrredón", "General Rodríguez", "General San Martín", "General Viamonte", "General Villegas", "Guaminí", "Hipólito Yrigoyen", "Hurlingham", "Ituzaingó", "José C. Paz", "Junín", "La Costa", "La Matanza", "Lanús", "La Plata", "Laprida", "Las Flores", "Leandro N. Alem", "Lincoln", "Lobería", "Lobos", "Lomas de Zamora", "Luján", "Magdalena", "Maipú", "Malvinas Argentinas", "Mar Chiquita", "Marcos Paz", "Mercedes", "Merlo", "Monte", "Monte Hermoso", "Moreno", "Morón", "Navarro", "Necochea", "Nueve de Julio (9 de Julio)", "Olavarría", "Patagones", "Pehuajó", "Pellegrini", "Pergamino", "Pila", "Pilar", "Pinamar", "Presidente Perón", "Puan", "Punta Indio", "Quilmes", "Ramallo", "Rauch", "Rivadavia", "Rojas", "Roque Pérez", "Saavedra", "Saladillo", "Salliqueló", "Salto", "San Andrés de Giles", "San Antonio de Areco", "San Cayetano", "San Fernando", "San Isidro", "San Miguel", "San Nicolás", "San Pedro", "San Vicente", "Suipacha", "Tandil", "Tapalqué", "Tigre", "Tordillo", "Tornquist", "Trenque Lauquen", "Tres Arroyos", "Tres de Febrero", "Tres Lomas", "Veinticinco de Mayo (25 de Mayo)", "Vicente López", "Villa Gesell", "Villarino", "Zárate");
        return listaDeLocalidadesGcba;
    }

    public List<String> devolverBarriosCaba() {
        List<String> listaBarriosCaba = Arrays.asList("Agronomía (incl. Parque Chas)", "Almagro", "Balvanera", "Barracas", "Belgrano", "Boedo", "Caballito", "Chacarita", "Coghlan", "Colegiales", "Constitución", "Flores", "Floresta", "La Boca", "La Paternal", "Liniers", "Mataderos", "Monserrat", "Monte Castro", "Nueva Pompeya", "Núñez", "Palermo", "Parque Avellaneda", "Parque Chacabuco", "Parque Patricios", "Puerto Madero (incl. Área Reserva Ecológica)", "Recoleta", "Retiro", "Saavedra", "San Cristóbal", "San Nicolás", "San Telmo", "Vélez Sársfield", "Versalles", "Villa Crespo", "Villa del Parque", "Villa Devoto", "Villa General Mitre", "Villa Lugano", "Villa Luro", "Villa Ortúzar", "Villa Pueyrredón", "Villa Real", "Villa Riachuelo", "Villa Santa Rita", "Villa Soldati", "Villa Urquiza");
        return listaBarriosCaba;
    }

    public List<String> devolverPaises() {
        List<String> listaPaises = Arrays.asList("Argentina", "Bolivia", "Brasil", "Chile", "Colombia", "Costa Rica", "Cuba", "Ecuador", "El Salvador", "Guayana Francesa", "Granada", "Guatemala", "Guayana", "Haití", "Honduras", "Jamaica", "México", "Nicaragua", "Paraguay", "Panamá", "Perú", "Puerto Rico", "República Dominicana", "Surinam", "Uruguay", "Venezuela", "Otro");
        return listaPaises;
    }
    public List<String> devolverNivelEstudios() {
        List<String> estudios = Arrays.asList( "Secundario completo" , "Terciario completo" , "Terciario en curso" , "Terciario incompleto" , "Universitario incompleto" , "Universitario en curso" , "Universitario completo" , "Posgrado incompleto" , "Posgrado en curso" , "Posgrado completo"  );
        return estudios;
       
    }

}

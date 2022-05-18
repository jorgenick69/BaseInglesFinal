/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaseInglesFinal.demo.util;

import BaseInglesFinal.demo.entity.Ingresante;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

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
        List<String> listaPaises = Arrays.asList(
                "Afganistán",
                "Alemania",
                "Arabia Saudita",
                "Argentina",
                "Australia",
                "Bélgica",
                "Bolivia",
                "Brasil",
                "Camboya",
                "Canadá",
                "Chile",
                "China",
                "Colombia",
                "Corea",
                "Costa Rica",
                "Cuba",
                "Dinamarca",
                "Ecuador",
                "Egipto",
                "El Salvador",
                "Escocia",
                "España",
                "Estados Unidos",
                "Estonia",
                "Etiopia",
                "Filipinas",
                "Finlandia",
                "Francia",
                "Gales",
                "Grecia",
                "Guatemala",
                "Haití",
                "Holanda",
                "Honduras",
                "Indonesia",
                "Inglaterra",
                "Irak",
                "Irán",
                "Irlanda",
                "Israel",
                "Italia",
                "Japón",
                "Jordania",
                "Laos",
                "Letonia",
                "Lituania",
                "Malasia",
                "Marruecos",
                "México",
                "Nicaragua",
                "Noruega",
                "Nueva Zelanda",
                "Nueva Zelandia",
                "Panamá",
                "Paraguay",
                "Perú",
                "Polonia",
                "Portugal",
                "Puerto Rico",
                "Republica Dominicana",
                "Rumania",
                "Rusia",
                "Suecia",
                "Suiza",
                "Tailandia",
                "Taiwán",
                "Turquía",
                "Ucrania",
                "Uruguay",
                "Venezuela",
                "Vietnam", "Otro");

        return listaPaises;
    }

    public List<String> devolverNacionalidades() {
        List<String> listaNacionalidades = Arrays.asList(
                "afgano",
                "afgana",
                "alemán",
                "alemana",
                "árabe",
                "argentino",
                "argentina",
                "australiano",
                "australiana",
                "belga",
                "boliviano",
                "boliviana",
                "brasileño",
                "brasileña",
                "camboyano",
                "camboyana",
                "canadiense",
                "chileno",
                "chilena",
                "chino",
                "china",
                "colombiano",
                "colombiana",
                "coreano",
                "coreana",
                "costarricense",
                "cubano",
                "cubana",
                "danés",
                "danesa",
                "ecuatoriano",
                "ecuatoriana",
                "egipcio",
                "egipcia",
                "salvadoreño",
                "salvadoreña",
                "escocés",
                "escocesa",
                "español",
                "española",
                "estadounidense",
                "estonio",
                "estonia",
                "etiope",
                "filipino",
                "filipina",
                "finlandés",
                "finlandesa",
                "francés",
                "francesa",
                "galés",
                "galesa",
                "griego",
                "griega",
                "guatemalteco",
                "guatemalteca",
                "haitiano",
                "haitiana",
                "holandés",
                "holandesa",
                "hondureño",
                "hondureña",
                "indonés",
                "indonesa",
                "inglés",
                "inglesa",
                "iraquí",
                "iraní",
                "irlandés",
                "irlandesa",
                "israelí",
                "italiano",
                "italiana",
                "japonés",
                "japonesa",
                "jordano",
                "jordana",
                "laosiano",
                "laosiana",
                "letón",
                "letona",
                "letonés",
                "letonesa",
                "malayo",
                "malaya",
                "marroquí",
                "mexicano",
                "mexicana",
                "nicaragüense",
                "noruego",
                "noruega",
                "neozelandés",
                "neozelandesa",
                "panameño",
                "panameña",
                "paraguayo",
                "paraguaya",
                "peruano",
                "peruana",
                "polaco",
                "polaca",
                "portugués",
                "portuguesa",
                "puertorriqueño",
                "dominicano",
                "dominicana",
                "rumano",
                "rumana",
                "ruso",
                "rusa",
                "sueco",
                "sueca",
                "suizo",
                "suiza",
                "tailandés",
                "tailandesa",
                "taiwanes",
                "taiwanesa",
                "turco",
                "turca",
                "ucraniano",
                "ucraniana",
                "uruguayo",
                "uruguaya",
                "venezolano",
                "venezolana",
                "vietnamita",
                "vietnamita"
        );
        return listaNacionalidades;
    }

    public List<String> devolverNivelEstudios() {
        List<String> estudios = Arrays.asList("Secundario completo", "Terciario completo", "Terciario en curso", "Terciario incompleto", "Universitario incompleto", "Universitario en curso", "Universitario completo", "Posgrado incompleto", "Posgrado en curso", "Posgrado completo");
        return estudios;

    }

    public List<String> devolverSosEgregadoDe() {
        List<String> egresadoDe = Arrays.asList("CAC 4.0 Full Stack – Java",
                "CAC 4.0  Full Stack – PHP",
                "CAC 4.0  Full Stack – Python",
                "CAC 4.0  FullStack – Desarrollo Web (JavaScript/Node JS)",
                "CAC 4.0  FullStack – React/Mongo/GoLang/GO",
                "CAC 4.0 Testing/QA",
                "CAC 4.0 Big Data",
                "CAC 4.0 UX/UI",
                "Especialización en programación Web",
                "Especialización Profesional en Programación de Videojuegos",
                "Programador",
                "Programador de base de datos",
                "Tecnicatura Superior en Análisis de Sistemas",
                "Tecnicatura Superior en Automatización y Robótica",
                "Tecnicatura Superior en Telecomunicaciones",
                "Tecnicatura Superior en Teleinformática"
        );
        return egresadoDe;

    }

    public List<String> devolverActividadesPrincipales() {
        List<String> actividadesPrincipales = Arrays.asList("ELECTRÓNICA", "ESTÉTICA PROFESIONAL", "HOTELERÍA Y GASTRONOMÍA", "TEXTIL E INDUMENTARIA", "ADMINISTRACIÓN", "GESTIÓN Y SERVICIOS EMPRESARIALES", "SEGURIDAD", "AMBIENTE E HIGIENE", "ELECTROMECÁNICA", "MECÁNICA", "METALMECÁNICA Y METALURGIA", "INFORMÁTICA", "CUERO Y CALZADO", "AGROPECUARIO", "MADERA Y MUEBLE", "INDUSTRIAS DE PROCESOS", "TURISMO", "ACTIVIDADES ARTISTICAS TECNICAS", "CONSTRUCCIONES", "SALUD", "AUTOMOTRIZ", "ENERGÍA", "INDUSTRIAS GRAFICA", "PUBLICITARIA Y MULTIMEDIAL", "INDUSTRIA ALIMENTARIA", "MINERÍA E HIDROCARBUROS", "NAVAL", "FERROVIARIO", "AERONÁUTICA", "COMERCIO", "ACTIVIDAD FINANCIERA", "ADMINISTRACIÓN PÚBLICA", "ENSEÑANZA", "DESARROLLO HUMANO"
        );
        return actividadesPrincipales;

    }

    public List<String> devolverRolesIt() {
        List<String> listaRolesIt = Arrays.asList(
                "ADMINISTRADOR DE BASE DE DATOS (DBA)", "ADMINISTRADOR DE REDES", "ANALISTA BIG DATA (DATA SCIENTIST)", "ANALISTA UX", "ANALISTA FUNCIONAL", "ARQUITECTO DE SOFTWARE", "DESARROLLADOR DE SOFTWARE", "DISEÑADOR WEB", "LÍDER DE DESARROLLO", "PROJECT MANAGER (PM)", "SOPORTE TÉCNICO", "TESTER", "NO OCUPO UN ROL IT"
        );
        return listaRolesIt;

    }

    public List<String> devolverEstablecimientos() {
        List<String> listaEstablecimientos = Arrays.asList(
                "C.F.P. Nº 01",
                "C.F.P. Nº 02 Hospital Moyano",
                "C.F.P. Nº 03",
                "C.F.P. Nº 04",
                "C.F.P. Nº 05",
                "C.F.P. Nº 06 - C.I.F.P.A.",
                "C.F.P. Nº 07",
                "C.F.P. Nº 08 - SMATA",
                "C.F.P. Nº 09",
                "C.F.P. Nº 10",
                "C.F.P. Nº 11",
                "C.F.P. Nº 12 - Eva Perón",
                "C.F.P. Nº 13",
                "C.F.P. Nº 14",
                "C.F.P. Nº 15",
                "C.F.P. Nº 16",
                "C.F.P. Nº 17",
                "C.F.P. Nº 18",
                "C.F.P. Nº 19",
                "C.F.P. Nº 20",
                "C.F.P. Nº 21",
                "C.F.P. Nº 22",
                "C.F.P. Nº 23",
                "C.F.P. Nº 24",
                "C.F.P. Nº 25",
                "C.F.P. Nº 26",
                "C.F.P. Nº 27",
                "C.F.P. Nº 28",
                "C.F.P. Nº 29",
                "C.F.P. Nº 30",
                "C.F.P. Nº 31",
                "C.F.P. Nº 32",
                "C.F.P. Nº 33",
                "C.F.P. Nº 34",
                "C.F.P. Nº 35",
                "C.F.P. Nº 36",
                "C.F.P. Nº 37",
                "C.F.P. Nº 38",
                "C.F.P. Nº 39",
                "C.F.P. Nº 40",
                "41",
                "Escuela de la Joya Maestro Joyero Sergio Lukez",
                "43",
                "44",
                "45",
                "46",
                "47",
                "48",
                "49",
                "50",
                "51",
                "52",
                "C.A.E.T. Nº 12 LIBERTADOR GRAL. SAN MARTIN",
                "C.A.E.T. Nº 32 Gral. José de San Martín",
                "INSTITUTO AMERICANO DE MOTORES",
                "UTEDYC",
                "DIGITAL HOUSE",
                "COSIENDO REDES",
                "ESCUELA DE ARTE GASTRONÓMICO",
                "ALEARA",
                "SECASFPI",
                "AIERH",
                "ESCUELA ARGENTINA DE AUTOMOTORES",
                "STPSRCPHyA",
                "ADEF",
                "TECSON",
                "CADMIRA",
                "ASOCIACIÓN PERSONAL LEGISLATIVO",
                "CETIC",
                "ASOFAR",
                "UPACP",
                "IEEC",
                "FUNDACIÓN EXCELENCIA ",
                "EXO Sede central",
                "C.O.P.I.M.E",
                "C.A.E.T. Nº 26",
                "C.C.F.P.",
                "C.F.P. Nº 04 Lola",
                "C.F.P. Nº 16 Castañares",
                "C.F.P. Nº 08 Medrano",
                "C.F.P. Nº 02 Hospital Borda",
                "DIGITAL HOUSE Lima",
                "CETIC camargo",
                "C.F.P. Nº 10 Fraga",
                "C.F.P. Nº 10 La Porteña",
                "C.F.P. Nº 10 Falcon",
                "C.F.P. Nº 10 Chacabuco",
                "C.F.P. Nº 11 Emilio Castro",
                "C.F.P. Nº 11 Dorrego",
                "C.F.P. Nº 10 Liniers",
                "C.F.P. Nº 10 Rivadavia",
                "C.F.P. Nº 10 Urquiza",
                "C.F.P. Nº 36 Anexo Los Patos",
                "C.F.P. Nº 28 PERÓN",
                "C.F.P. Nº 28 Freire",
                "C.F.P. Nº 28 Jujuy",
                "C.F.P. Nº 34 Casa Remedios",
                "C.F.P. Nº 34 Casa Pio IX",
                "C.F.P. Nº 34 Casa Leon XIII",
                "C.F.P. Nº 15 Villa 20",
                "C.F.P. Nº 36 POLO MATADEROS",
                "C.F.P. Nº 12 Lavalle",
                "C.F.P. Nº 12",
                "C.F.P. N° 35 Anexo C.C.D.",
                "C.F.P. Nº 24 Yo no fui",
                "EXO Sede Microcentro",
                "C.F.P. Nº 8 I.N.E.T.",
                "C.F.P. Nº 17 C.E.N.S. Nº 35",
                "C.F.P. Nº 29 C.F.P. Nº 4",
                "C.F.P. Nº 23 PAULA ALBARRACIN DE SARMIENTO",
                "C.F.P. Nº 23 CASAL CALVIÑO",
                "C.F.P. Nº 23 Defensa de Buenos Aires",
                "C.F.P. Nº 23 Ing. Otto Krause",
                "C.F.P. Nº 23 M.  R. de Escalada de San Martín",
                "C.F.P. Nº 23 Fray Luis Beltrán",
                "C.F.P. Nº 23 Libertad",
                "C.F.P. Nº 23 ET 18	Jose Antonio Alvarez Condarco",
                "C.F.P. Nº 23 ET 30       Norberto Piñero",
                "C.F.P. Nº 25 Luis Agote",
                "C.F.P. Nº 25 San Martín",
                "C.F.P. Nº 25 Manuel Belgrano",
                "C.F.P. Nº 25 Manuel Rocca",
                "C.F.P. Nº 25 Devoto",
                "C.F.P. Nº 25 Casa Lucero",
                "C.F.P. Nº 25 Casa Puerto",
                "UPACP ANEXO",
                "C.F.P. Nº 04 Terminalidad",
                "C.F.P. Nº 01 Terminalidad",
                "C.F.P. Nº 06 – C.I.F.P.A. Terminalidad",
                "C.F.P. Nº 07 Terminalidad",
                "C.F.P. Nº 10 Terminalidad",
                "C.F.P. Nº 34 Terminalidad",
                "C.F.P. Nº 24 COPA",
                "C.F.P.  Nº 24 ",
                "C.F.P. N° 04 (Satelite JE - LOLA)",
                "C.F.P. N° 08 (Satélite JE - MEDRANO 162)",
                "C.F.P. N° 09 (Satélite JE)",
                "C.F.P. N° 12 (Satélite JE)",
                "C.F.P. N° 13 (Satélite JE)",
                "C.F.P. N° 14 (Satélite JE)",
                "C.F.P. N° 15 (Satélite JE)",
                "C.F.P. N° 18 (Satélite JE)",
                "C.F.P. N° 24 (Satélite JE) ",
                "C.F.P. N° 27 (Satélite JE)",
                "C.F.P. N° 28 (Satélite JE) ",
                "C.F.P. N° 34 (Satélite JE)",
                "C.F.P. N° 38 (Satélite JE)",
                "C.F.P. N° 10 (Satélite JE - FRAGA)",
                "C.F.P. N° 10 (Satélite JE - La Porteña)",
                "C.F.P. N° 10 (Satélite JE - MONROE)",
                "C.F.P. N° 11 (Satélite JE - CABALLITO)",
                "C.F.P. N° 11 (Satélite JE - MATADEROS)",
                "C.F.P. N° 16 (Satélite JE - CASTAÑARES)",
                "C.F.P. N° 36 (Satélite JE - MATADEROS)",
                "C.F.P. N° 36 (Satélite JE - LOS PATOS)",
                "C.F.P. Nº 33 (Satélite JE )",
                "C.F.P. Nº 38 Terminalidad",
                "333",
                "C.F.P. Nº 16 CIFA",
                "C.F.P. Nº 8 E.T. Nº 35",
                "C.F.P. Nº 23 Técnicas Raggio",
                "C.F.P. Nº 36 Asociacion Mutual 20 de Mayo",
                "C.F.P. Nº 25   (Devoto)",
                "E.T. N° 31 Maestro Quinquela",
                "C.F.P. Nº 09 CAACUPE",
                "C.F.P. Nº 09 CASA DE LA CULTURA y OFICIOS ",
                "C.F.P. Nº 23 Dolores  Lavalle de Lavalle",
                "C.F.P. Nº 23 Ing. Luis A. Huergo",
                "C.F.P. Nº 23 Ing. J. L. Delpini",
                "C.F.P. Nº 23 España",
                "C.F.P. Nº 23 Tte. 1° de Artillería Fray Luis Beltr",
                "C.F.P. Nº 23 Confederación Suiza",
                "C.F.P. Nº 23 Reconquista de Buenos Aires",
                "C.F.P. Nº 23 Gral. Jose de San Martin",
                "C.F.P. Nº 23 Fundición Maestranza del  Plumerillo",
                "C.F.P. Nº 23 Republica del Libano",
                "C.F.P. Nº 23 Libertador Gral. Jose de San Martin",
                "C.F.P. Nº 23 Maipu",
                "C.F.P. Nº 23 Fragata Escuela Libertad",
                "C.F.P. Nº 23 Hipolito Yrigoyen",
                "C.F.P. Nº 23 Republica Francesa",
                "C.F.P. Nº 23 Ing. Eduardo Latzina",
                "C.F.P. Nº 23 Hogar Naval Stella Maris",
                "C.F.P. Nº 23 A.M.E.T.",
                "C.F.P. Nº 23 C.F.P. Nº 7",
                "C.F.P. Nº 23 C.F.P. Nº 17",
                "C.F.P. Nº 23  Alte. Guillermo Brown",
                "C.F.P. Nº 23 Brigadier Gral. Cornelio Saavedra",
                "Asociación Civil Colectivo gráfico",
                "C.F.P. Nº 23 - Cristóbal Hicken",
                "C.F.P. Nº 04 Hosp. de Rehabilitación M. Rocca",
                "C.F.P. Nº 04 Poli. Nueva Chicago",
                "C.F.P. Nº 15 Villa 15",
                "C.F.P. Nº 15 Villa 31",
                "C.F.P. Nº 17 San Nicolas",
                "C.F.P. Nº 17 Chutro",
                "C.F.P. Nº 19  Vicaría Flores",
                "C.F.P. Nº 19 Pquia Santa Elisa",
                "C.F.P. Nº 19 Pquia Santa Rosa de Lima",
                "C.F.P. Nº 19 Pquia San Juan Diego",
                "C.F.P. Nº 19 Vicaria Devoto",
                "C.F.P. Nº 19 Vicaría Belgrano",
                "C.F.P. Nº 19 Santo Cristo",
                "C.F.P. Nº 19 Pquia San Bartolomé",
                "C.F.P. Nº 19 María Madre de la Esperanza",
                "C.F.P. Nº 26 Devoto",
                "C.F.P. Nº 26 Pque. Centenario",
                "C.F.P. Nº 26 Belgrano",
                "C.F.P. Nº 26 Liniers",
                "C.F.P. Nº 29 Asociación Patriótica Italiana",
                "C.F.P. Nº 27 Defensa",
                "C.F.P. Nº 27 IFTS 16",
                "C.F.P. Nº 27",
                "C.F.P. Nº 19 Nuestra Señora de la Misericordia",
                "C.F.P. Nº 29 Rawson",
                "C.F.P. Nº 29 Sarmiento",
                "C.F.P. Nº 29 Lacarra",
                "C.F.P. Nº 29 Lavalle",
                "C.F.P. Nº 23 E.T. Nº 11",
                "C.F.P. Nº 23 E.T. Nº 3",
                "C.F.P. Nº 23 E.T. Nº 24",
                "C.F.P. Nº 23 E.T. Nº 34",
                "C.F.P. Nº 23 E.T. Nº 6",
                "C.F.P. Nº 23 C.F.P. Nº 4",
                "C.F.P. Nº 29 C.G.P N º10",
                "E.F.I. Nº 29 DE 18º DR. OSVALDO MAGNASCO",
                "E.F.I.  N° 37 DE 3",
                "C.F.P. Nº 14 Biblioteca Popular Hacha y Tiza",
                "C.F.P. Nº 14 JIC 3",
                "C.F.P. Nº 14 Colegio Mariano Moreno",
                "C.F.P. Nº 14 El Corralón de Floresta",
                "C.F.P. Nº 14 E.E.I Nº 15",
                "C.F.P. Nº 14 MATADEROS",
                "C.F.P. Nº 14 Centro Cultural Cultrum",
                "C.F.P. Nº 14 San Cristobal",
                "C.F.P. Nº 14 POMPEYA",
                "C.F.P. Nº 14 La Usina",
                "C.F.P. Nº 14 El Local",
                "C.F.P. Nº 14 Carlos Pellegrini",
                "C.F.P. Nº 14 Casa de la Cultura",
                "C.F.P. Nº 14 Biblioteca Juanito Laguna",
                "C.F.P. Nº 14 Esc. N° 2 DE 5",
                "C.F.P. Nº 14 Esc. I. I. Nº 08",
                "C.F.P. Nº 14 EII 3 DE 3",
                "C.F.P. Nº 14 Esc. 6 D.E. 21",
                "C.F.P. Nº 14 E.I.I. Nº 14 D.E. 14",
                "C.F.P. Nº 14 Esc. 10 D.E. 9",
                "C.F.P. Nº 14 Esc. 9 D.E. 16",
                "C.F.P. Nº 14 E15 DE14",
                "C.F.P. Nº 14 EEI Nº 5 DE 21",
                "C.F.P. Nº 14 Escuela Nº 23 DE 3",
                "C.F.P. Nº 14 Esc. Nº 4 DE 17º",
                "C.F.P. Nº 14 E.E. Nº 28 DE 16",
                "C.F.P. Nº 14 J.I.I. 4 DE 15",
                "C.F.P. Nº 14 Esc. Nº 16 DE 1",
                "C.F.P. Nº 14 EEI Nº 1 DE 8",
                "C.F.P. Nº 14 Esc. 23 DE 18 ",
                "C.F.P. Nº 14 JIN 17 DE 2",
                "C.F.P. Nº 14 Bernasconi",
                "C.F.P. Nº 14 EPC 5 DE 11",
                "C.F.P. Nº 33 (Satélite Esquina Libertad)",
                "Aula satélite ACS C.F.P. Nº 1",
                "Aula satélite ACS C.F.P. Nº 3",
                "Aula satélite ACS C.F.P. Nº 16",
                "Aula satélite ACS C.F.P. Nº 17",
                "Aula satélite ACS C.F.P. Nº 27",
                "Aula satélite ACS C.F.P. Nº 36",
                "Aula satélite ACS C.F.P. Nº 37",
                "Aula satélite ACS C.F.P. Nº 8 Maza",
                "Aula satélite ACS C.F.P. Nº 8 Medrano",
                "C.F.P: N° 5 Pringles",
                "C.F.P: N° 5 BERNARDO DE IRIGOYEN",
                "C.F.P: N° 5 Peron",
                "C.F.¨P. N° 5 Leopoldo Marechal",
                "C.F.P. N° 5  VUELTA DE OBLIGADO",
                "C.F.P: N° 5 Acoyte",
                "Aula satélite ACS C.F.P. Nº 999",
                "IFTS N° 01",
                "IFTS N° 02",
                "IFTS N° 03",
                "IFTS N° 04",
                "IFTS N° 05",
                "IFTS N° 06",
                "IFTS N° 07",
                "IFTS N° 08",
                "IFTS N° 09",
                "IFTS N° 10",
                "IFTS N° 11",
                "IFTS N° 12",
                "IFTS N° 13",
                "IFTS N° 14",
                "IFTS N° 15",
                "IFTS N° 16",
                "IFTS N° 17",
                "IFTS N° 18",
                "IFTS N° 19",
                "IFTS N° 20",
                "IFTS N° 21",
                "IFTS N° 22",
                "IFTS N° 23",
                "IFTS N° 24",
                "IFTS N° 25",
                "IFTS N° 26",
                "IFTS N° 27",
                "IFTS N° 28",
                "IFTS N° 30",
                "IFTS N° 31",
                "IFTS N° 32 LyF",
                "IFTS N° 33 UOCRA",
                "IFTS N° 34",
                "IFTS N° 87 IsTLyR",
                "IFTS N° 89 ISDE",
                "IFTS N° 90 C. Grierson",
                "IFTS N° 91 C. Grierson - Anexo",
                "Programa Codo a Codo"
        );
        return listaEstablecimientos;

    }

    public List<Ingresante> evitarDocDuplicadosPaso1(List<Ingresante> lista) {
        List<Ingresante> listaVerificada = new ArrayList<>();
        int contador = 0;
        var verificado = true;
        Ingresante ingre = new Ingresante();
        System.out.println("El tamaño al entrar de la lista paso 1 es"+lista.size());
        for (Ingresante ingreOri : lista) {
            contador++;
            verificado = true;
            if (contador == 0) {
                listaVerificada.add(ingreOri);
            } else {
                ingre = ingreOri;
                for (Ingresante ingresante : listaVerificada) {
                    if (ingresante.getNumDoc().equalsIgnoreCase(ingreOri.getNumDoc())) {
                        verificado = false;
                        System.out.println("DNI REPETIDO "+ingresante.getNumDoc());
                    }
                }
                if (verificado) {
                    listaVerificada.add(ingre);
                }

            }
        }
        System.out.println("La lista que salio en paso 1 tiene " + listaVerificada.size());
        return listaVerificada;
    }

    public List<Ingresante> evitarDocDuplicadosPaso1(List<Ingresante> base, List<Ingresante> aCargar) {
        List<Ingresante> listaVerificada = new ArrayList<>();
        System.out.println("la lista tiene "+ aCargar.size());
        var verificado = true;
        Ingresante ingresante = new Ingresante();
        for (Ingresante aCar : aCargar) {
            verificado = true;
            ingresante = aCar;
           
            for (Ingresante bas : base) {
                if (aCar.getNumDoc().equalsIgnoreCase(bas.getNumDoc())) {
                    verificado = false;
                }

            }
            if (verificado) {
                listaVerificada.add(ingresante);
            }

        }
        return listaVerificada;
    }
    public String creador(String query){
    String mensaje=null;
        if ( query.equalsIgnoreCase("30082320")|| query.equalsIgnoreCase("hernaneduvisconti@gmail.com")) {
            mensaje= "Usted esta buscando a mi creador Hernan Visconti";
        }
        if ( query.equalsIgnoreCase("43095096")|| query.equalsIgnoreCase("jorgemartindominguezdiaz@gmail.com")) {
             mensaje="Usted esta buscando a mi creador Jorge Dominguez";
        }
       return mensaje;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;

/**
 * Clase donde se encuentran las estructuras con datos necesarios para generar los registros académicos
 * @author CeciliaTorres, CeciliaZurita, JacielHernández, MarioTerán, MiguelCamacho
 */
public class Listas {
    //Nombre completo
    List<String> nombres;
    List<String> apellidos;
    
    //Dirección
    List<String> calles;
    List<String> asentamientos;
    List<List<String>> estados;
    List<String> municipios;
   
    /**
     * Método constructor vacío
     */
    public Listas() {
    }

    /**
     * Sobrecarga del constructor con atributos de la clase
     * @param nombres
     * @param apellidos 
     */
    public Listas(List<String> nombres, List<String> apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    /**
     * Método con donde se crea lista con nombres
     * @param nombres nombres de los alumnos
     * @return lista con los 50 nombres
     */
    public List estructuraNombres(List<String> nombres){
        nombres.add("Elisabet");
        nombres.add("Rosaura");
        nombres.add("Tatiana");
        nombres.add("Heraclio");
        nombres.add("Bernardino");
        nombres.add("Trinidad");
        nombres.add("Nazario");
        nombres.add("Abel Adan");
        nombres.add("Jonatan");
        nombres.add("Isidro");
        nombres.add("Iker");
        nombres.add("Lucas");
        nombres.add("Eladio");
        nombres.add("Samuel");
        nombres.add("Maximo");
        nombres.add("Esmeralda");
        nombres.add("Jacobo");
        nombres.add("Bárbara");
        nombres.add("Ines");
        nombres.add("Miguel");
        nombres.add("Amanda Maria");
        nombres.add("Jenny Victoria");
        nombres.add("Agustina");
        nombres.add("Melania");
        nombres.add("Fidela");
        nombres.add("Amilcar");
        nombres.add("Maxi");
        nombres.add("Marina");
        nombres.add("Santos");
        nombres.add("Leyre");
        nombres.add("Isaac");
        nombres.add("Adolfo");
        nombres.add("Gracia");
        nombres.add("Rogelio");
        nombres.add("Vito");
        nombres.add("Victor");
        nombres.add("Consuelo");
        nombres.add("Virginia");
        nombres.add("Bonifacio");
        nombres.add("Pacifica");
        nombres.add("Ani");
        nombres.add("Jose Marcos");
        nombres.add("Marita Anna");
        nombres.add("Sofia");
        nombres.add("Anacleto");
        nombres.add("Jennifer");
        nombres.add("Rosalina");
        nombres.add("Nicolasa");
        nombres.add("Ester");
        nombres.add("Nicolas");
        
        return nombres;
    }
    
    /**
     * Método donde se crea una lista con apellidos
     * @param apellidos apellidos de los alumnos
     * @return lista con los 50 apellidos
     */
    public List estructuraApellidos(List<String> apellidos){
        apellidos.add("Perera Gomez");
        apellidos.add("Aranda Roura");
        apellidos.add("Pinto Salgado");
        apellidos.add("Alcolea Soriano");
        apellidos.add("Diaz Oliveras");
        apellidos.add("Sanchez Cortina");
        apellidos.add("Maestre Herrera");
        apellidos.add("Bermejo Rivero");
        apellidos.add("Sastre Moreno");
        apellidos.add("Silva Acosta");
        apellidos.add("Perales Abellan");
        apellidos.add("Eufemia Amo Carbajo");
        apellidos.add("Catala Verdugo");
        apellidos.add("Celso Valbuena Araujo");
        apellidos.add("Julia Quiros");
        apellidos.add("Yañez Carro");
        apellidos.add("Viña Peláez");
        apellidos.add("Coca Ballesteros");
        apellidos.add("Mercader Cepeda");
        apellidos.add("Cáceres Gordillo");
        apellidos.add("Oliveras Morán");
        apellidos.add("Ríos Leon");
        apellidos.add("Robles Roca");
        apellidos.add("Miralles Reina");
        apellidos.add("Giralt Font");
        apellidos.add("Clavero Marquez");
        apellidos.add("Gutiérrez Alvarado");
        apellidos.add("Peña Revilla");
        apellidos.add("Uría Asensio");
        apellidos.add("Moles Barón");
        apellidos.add("Alcalá Armas");
        apellidos.add("Valenzuela Quero");
        apellidos.add("Ayala Borrell");
        apellidos.add("Fuertes Aguado");
        apellidos.add("Barreda Cabeza");
        apellidos.add("Arenas Cabo");
        apellidos.add("Cano Carreras");
        apellidos.add("Caparrós Mascaró");
        apellidos.add("Paniagua Aragón");
        apellidos.add("Castilla Vergara");
        apellidos.add("Lopez Ortiz");
        apellidos.add("Sanchez Checa");
        apellidos.add("Valera Bustos");
        apellidos.add("Lara Coello");
        apellidos.add("Méndez Iriarte");
        apellidos.add("Bas Garmendia");
        apellidos.add("Caña Salgado");
        apellidos.add("Campillo Soriano");
        apellidos.add("Segarra Bru");
        apellidos.add("Cardenas Montesinos");

        return apellidos;
    }

    /**
     * Método para leer el archivo correspondiente y generar una lista con los valores del archivo
     * @param asentamientos lista vacía con los asentamientos de la dirección del alumno
     * @return lista con los posibles asentamientos
     */
    public List estructuraAsentamientos(List<String> asentamientos){
        Scanner fileIn;
        String line;
        
        try {
            fileIn = new Scanner(new FileReader("asentamientos.txt"));
            while (fileIn.hasNextLine()) {
                line = fileIn.nextLine();
                asentamientos.add(line);
            }
            fileIn.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Error: " + e.getMessage());
        }
        
        return asentamientos;
    }
    
    /**
     * Método para leer el archivo correspondiente y generar una lista con los valores del archivo
     * @param delegaciones lista vacía con las delegaciones de la dirección del alumno
     * @return lista con las posibles delegaciones
     */
    public List estrucutraDelegaciones(List<String> delegaciones){
        delegaciones.add("Álvaro Obregon");
        delegaciones.add("Azcapotzalco");
        delegaciones.add("Benito Juarez");
        delegaciones.add("Coyoacan");
        delegaciones.add("Cuajimalpa de Morelos");
        delegaciones.add("Cuahutemoc");
        delegaciones.add("Gustavo A. Madero");
        delegaciones.add("Iztacalco");
        delegaciones.add("Itzapalapa");
        delegaciones.add("La Magdalena en Contreras");
        delegaciones.add("Miguel Hidalgo");
        delegaciones.add("Milpa Alta");
        delegaciones.add("Tlahuac");
        delegaciones.add("Tlalpan");
        delegaciones.add("Venustiano Carranza");
        delegaciones.add("Xochimilco");
        return delegaciones;
    }
    
    /**
     * Método para leer el archivo correspondiente y generar una lista con los valores del archivo
     * @param calles lista vacía con las calles de la dirección del alumno
     * @return lista con las posibles calles
     */
    public List estructuraCalles(List<String> calles){
        Scanner fileIn;
        String line;
        
        try {
            fileIn = new Scanner(new FileReader("calles.txt"));
            while (fileIn.hasNextLine()) {
                line = fileIn.nextLine();
                calles.add(line);
            }
            fileIn.close();
        }
        catch (FileNotFoundException e){
            System.out.println("Error: " + e.getMessage());
        }
        
        return calles;
    }
   
}
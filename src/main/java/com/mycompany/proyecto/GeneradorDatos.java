/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Clase para generar los datos personales
 * Extiende de la clase Listas
 * @author CeciliaTorres, CeciliaZurita, JacielHernández, MarioTerán, MiguelCamacho
 */
public class GeneradorDatos extends Listas{
    int semestre;
    int edad;
    String direccion;
    String nombreCompleto;
    String calle, asentamiento, municipio, estado;
    int cp, numeroInterior;
    List<GeneradorDatos> datosAlumnos;
    
    /**
     * Método constructor vacío
     */
    public GeneradorDatos() {
    }

    /**
     * Sobrecarga del constructor con atributos del generador de datos 
     * @param nombres lista con los nombres de alumnos
     * @param apellidos lista con los apellidos de alumnos
     */
    public GeneradorDatos(List<String> nombres, List<String> apellidos) {
        super(nombres, apellidos);
    }

    /**
     * Sobrecarga del constructor con atributos del generador de datos
     * @param datosAlumnos lista con los datos de alumnos
     */
    public GeneradorDatos(List<GeneradorDatos> datosAlumnos) {
        this.datosAlumnos = datosAlumnos;
    }

    /**
     * Sobrecarga del constructor con atributos del generador de datos
     * @param semestre semestre del alumno
     * @param edad edad del alumno
     * @param direccion dirección del alumno
     * @param nombres nombre del alumno
     */
    public GeneradorDatos(int semestre, int edad, String direccion, String nombres) {
        this.semestre = semestre;
        this.edad = edad;
        this.direccion = direccion;
        this.nombreCompleto = nombreCompleto;
    }

    /**
     * Getter para obtener el semestre
     * @return semestre del alumno
     */
    public int getSemestre() {
        return semestre;
    }

    /**
     * Setter para definir el semestre 
     * @param semestre semestre del alumno
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    /**
     * Getter para obtener la edad 
     * @return edad del alumno
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Setter para definir la edad
     * @param edad edad del alumno
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Getter para obtener la dirección
     * @return dirección del alumno
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Setter para definir la dirección
     * @param direccion dirección del alumno
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Getter para obtener el nombre completo
     * @return nombre completo del alumno
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    /**
     * Setter para obtener el nombre completo
     * @param nombreCompleto nombre completo del alumno
     */
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    /**
     * Getter para obtener los datos de alumnos
     * @return lista con datos del alumno
     */
    public List<GeneradorDatos> getDatosAlumnos() {
        return datosAlumnos;
    }

    /**
     * Setter para definir los datos de alumnos
     * @param datosAlumnos lista con datos del alumno
     */
    public void setDatosAlumnos(List<GeneradorDatos> datosAlumnos) {
        this.datosAlumnos = datosAlumnos;
    }

    /**
     * Override que permite imprimir todas las variables del objeto GeneradorDatos
     * @return datos del generador de datos
     */
    @Override
    public String toString() {
        return "\nNombre: " + nombreCompleto + "\nEdad: " + edad + "\nSemestre: " + semestre +  "\nDirección: " + direccion;
    }
    
    /* + + + + + + + + + + + + + + + */
    
    /**
     * Método para generar los datos personales
     * @param datosAlumnos lista con datos del alumno
     * @param cantAlumnos cantidad de alumnos a generar
     */
    public void datosPersonales(List<GeneradorDatos> datosAlumnos, int cantAlumnos){
        for (int i = 0; i < cantAlumnos; i++) {
            datosAlumnos.add(null);
        }
        GeneradorDatos datos = new GeneradorDatos();
        
        for (int i = 0; i < cantAlumnos; i++) {
            GeneradorDatos l = new GeneradorDatos();
            
            nombreCompleto = nombres();
            semestre = semestre();
            edad = edad();
            direccion = direccion();

            l.setNombreCompleto(nombreCompleto);
            l.setSemestre(semestre);
            l.setEdad(edad);
            l.setDireccion(direccion);
            
            
            datosAlumnos.set(i, l);
       
        }
        
        datos.setDatosAlumnos(datosAlumnos);
    }
    
    /**
     * Método para generar el nombre completo
     * @return nombre completo del alumno
     */
    private String nombres(){
        Random rnd = new Random();
        String N1,A1;
        int n = rnd.nextInt(49);
        int a = rnd.nextInt(49);
        
        List<String> nom = new ArrayList(50);
        List<String> ap = new ArrayList(50);
        
        GeneradorDatos l = new GeneradorDatos(nom, ap);
        nom = l.estructuraNombres(nom);
        ap = l.estructuraApellidos(ap);
        
        N1 = nom.get(n);
        A1 = ap.get(a);
        
        nombreCompleto = N1 + " " + A1;
        
        return nombreCompleto;
    } 
    
    /**
     * Método para generar aleatoriamente el semestre
     * @return semestre del alumno
     */
    private int semestre(){
        Random rnd = new Random();
        int n = rnd.nextInt(11 - 1) + 1;
        
        semestre = n;

        return semestre;
    }
    
    /**
     * Método para generar, de acuerdo al semestre, la edad del alumno
     * @return edad del alumno
     */
    private int edad(){
        Random rnd = new Random();
        int n;
        
        if(semestre == 1 || semestre == 2){
            n = rnd.nextInt(21 - 18) + 18;
            edad = n;
        }
        if(semestre == 3 || semestre == 4){
            n = rnd.nextInt(23 - 19) + 19;
            edad = n;  
        }
        if(semestre == 5 || semestre == 6){
            n = rnd.nextInt(25 - 21) + 21;
            edad = n;
        }
        if(semestre == 7 || semestre == 8){
            n = rnd.nextInt(27 - 23) + 23;
            edad = n;
        }
        if(semestre == 9 || semestre == 10){
            n = rnd.nextInt(28 - 24) + 24;
            edad = n;
        }

        return edad;
    }
    
    /**
     * Método para generar la dirección
     * Se obtienen valores aleaotrios de las listas generadas en la clase Listas
     * @return dirección del alumno
     */
    private String direccion(){
        Random rnd = new Random();
        int n = rnd.nextInt(499);
        int n2 = rnd.nextInt(15);
        int n3 = rnd.nextInt(99999 - 01000) + 01000;
        int n4 = rnd.nextInt(99);
        
        GeneradorDatos l = new GeneradorDatos();
        List<String> asen = new ArrayList(500);
        asen = l.estructuraAsentamientos(asen);
        asentamiento = asen.get(n);
        
        estado = "Ciudad de Mexico";
        
        List<String> deleg = new ArrayList(16);
        deleg = l.estrucutraDelegaciones(deleg);
        municipio = deleg.get(n2);
        
        cp = n3;
        
        numeroInterior = n4;
        
        List<String> av = new ArrayList(500);
        av = l.estructuraCalles(av);
        calle = av.get(n);
        
        direccion = calle + "|" + numeroInterior + "|" + asentamiento + "|" + municipio + "|" + estado + "|" + cp;
        
        return direccion;
    }
}
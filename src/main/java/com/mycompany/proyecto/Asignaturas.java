/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

/**
 * Clase para definir las asignaturas que ha cursado cada alumno
 * @author CeciliaTorres, CeciliaZurita, JacielHernández, MarioTerán, MiguelCamacho
 */
public class Asignaturas{
    protected String nombre;
    protected int creditos, semestre;
    protected float calificacion;

    /**
     * Método constructor vacío
     */
    public Asignaturas() {
    }

    /**
     * Setter para definir el nombre de la asignatura
     * @param nombre nombre de la asignatura
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Setter para definir los créditos de la asignatura
     * @param creditos créditos de la asignatura
     */
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    /**
     * Setter para definir el semestre de la asignatura
     * @param semestre semestre de la asignatura
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    /**
     * Setter para definir la calificación de la asignatura
     * @param calificacion calificación obtenida de la asignatura
     */
    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    /**
     * Override que permite imprimir todas las variables del objeto Asignaturas
     * @return datos del generador de asignaturas
     */
    @Override
    public String toString() {
        return  "\n\n\tNombre: " + nombre + "\n\tCreditos: " + creditos + "\n\tSemestre: " + semestre + "\n\tCalificación: " + calificacion;
    }
    
    /**
     * Método para generar el objeto de asignaturas con su respectivo nombre, créditos y semestre
     * @param asignaturas lista con asignaturas de la carrera
     * @param tamaño número de materias inscritas
     * @return lista con asignaturas
     * @throws IOException excepción en caso de que ocurra un error al leer el archivo de texto con las asignaturas
     */
    public List<Asignaturas> estructuraAsignaturas(List<Asignaturas> asignaturas, int tamaño) throws IOException{
        
        String line;
        int n = 0;
        
        while(n<tamaño){
            Asignaturas a = new Asignaturas();
            line = Files.readAllLines(Paths.get("asignaturas.txt")).get(n);
            String[] claves = line.split(",", 3);

            String nombre = claves[0];
            a.setNombre(nombre);

            String creditos = claves[1];
            a.setCreditos(Integer.parseInt(creditos));

            String semestre = claves[2];
            a.setSemestre(Integer.parseInt(semestre));

            Random rnd = new Random();
            int calif = rnd.nextInt(11 - 6) + 6;
            a.setCalificacion(calif);
            
            asignaturas.add(n, a);

            n++;
        }
        
        return asignaturas;
    }
    
}

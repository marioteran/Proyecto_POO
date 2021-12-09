/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.List;

/**
 * Clase para generar el archivo csv
 * @author CeciliaTorres, CeciliaZurita, JacielHernández, MarioTerán, MiguelCamacho
 */
public class ArchivoCSV{
    
    /**
     * Método que permite crear un archivo csv con los registros de los alumnos
     * @param registrosAlumnos  lista que contiene a los registros de los alumnos
     */
    public void crear(List<GeneradorRegistros> registrosAlumnos){
        
        try{
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            FileWriter fw = new FileWriter("registrosAcademicos.csv"); 
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(fw);
            salida.println("Nombre completo,Edad,Semestre,Dirección,Número de cuenta,Asignaturas Aprobadas,Promedio,Escolaridad,Velocidad,Número de Inscripción");

            for(GeneradorRegistros reg : registrosAlumnos)
                salida.println(reg.nombreCompleto+","+reg.edad+","+reg.semestre+","+reg.direccion+","+reg.numeroCuenta+","+reg.asignaturasAprobadas+" de "+((reg.semestre)*5)+","+
            reg.promedio+","+reg.escolaridad+","+reg.velocidad+","+reg.numeroInscripcion);
            
            salida.close();
        } 
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        
    }

}

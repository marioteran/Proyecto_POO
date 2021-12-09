/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto;
import java.util.List;

/**
 * Clase para ordenar los registros de los alumnos de acuerdo al indicador escolar
 * @author CeciliaTorres, CeciliaZurita, JacielHernández, MarioTerán, MiguelCamacho
 */
public class NumeroDeInscripcion {
    /**
     * Método para dividir la colección
     * @param arr lista con los registros académicos
     * @param low índice con el menor elemento
     * @param high índice con el mayor elemento
     * @return pivote con el que trabajará QuickSort
     */
    public int partition(List<GeneradorRegistros> arr, int low, int high){
        GeneradorRegistros pivot = arr.get(high);
        int i = (low-1);
        for (int j=low; j<high; j++){
            if (arr.get(j).getIndicadorEscolar() >= pivot.getIndicadorEscolar()) {
                i++;
                swap(arr, i,j);
            }
        }
        GeneradorRegistros temp = arr.get(i+1);
        arr.set(i+1, arr.get(high));
        arr.set(high, temp);
        return i+1;
    }

    /**
     * Método para 
     * @param arr lista con los registros académicos
     * @param low índice con el menor elemento
     * @param high índice con el mayor elemento 
     */
    public void QuickSort(List<GeneradorRegistros> arr, int low, int high){
        if (low < high){
            int pi = partition(arr, low, high);
            QuickSort(arr, low, pi-1);
            QuickSort(arr, pi+1, high);
        }
    }
    
    /**
     * Método para intercambiar dos valores de la lista
     * @param arr lista con los registros académicos
     * @param i índice del primer elemento a intercambiar
     * @param j índice del segundo elemento a intercambiar
     */
    public void swap (List<GeneradorRegistros> arr, int i, int j){
        GeneradorRegistros temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }

}

package com.mycompany.ordenamientos;
import java.util.Random;

public class InteraccionesClase {
    
    OrdenamientoClase ordenamientos = new OrdenamientoClase();
    Random random = new Random();

    public void interacciones(int n) {
        
        System.out.println("");
        System.out.println("Ordenamiento de " + n + " datos");
        System.out.println("");
        
        
        long startTime = System.nanoTime();
        ordenamientos.Burbuja(n);
        long endTime = System.nanoTime();
        System.out.println("Algoritmo burbuja: " + (endTime-startTime) +  "ms" );
        
        
        long startTime2 = System.nanoTime();
        ordenamientos.Insercion(n);
        long endTime2 = System.nanoTime();
        System.out.println("Algoritmo de inserccion: " + (endTime2-startTime2) +  "ms" );
        
        
        long startTime3 = System.nanoTime();
        ordenamientos.Seleccion(n);
        long endTime3 = System.nanoTime();
        System.out.println("Algoritmo de seleccion: " + (endTime3-startTime3) +  "ms" );
        
        
        long startTime4 = System.nanoTime();
        ordenamientos.Shellsort(n);        
        long endTime4 = System.nanoTime();
        System.out.println("Algoritmo shell sort: " + (endTime4-startTime4) +  "ms" );
        
        
        // Genera el arreglo de n numeros
        int arreglo[] = new int[n];
        // Generar numeros aleatorios
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(101) + 0;
        }
        
        long startTime5 = System.nanoTime();
        ordenamientos.quicksort(arreglo, 0, arreglo.length - 1);
        long endTime5 = System.nanoTime();
        System.out.println("Algoritmo shell sort: " + (endTime5-startTime5) +  "ms" );
        
    }
}

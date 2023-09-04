package com.mycompany.ordenamientos;
import java.util.Random;

public class OrdenamientoClase {
    
    Random random = new Random();
    
    // Algoritmo de ordenamiento Burbuja
    public void Burbuja(int n) {
        
        // Genera el arreglo de n numeros
        int arreglo[] = new int[n];
        // Generar numeros aleatorios
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(101) + 0;
        }

        for (int x = 0; x < arreglo.length; x++) {
            // Aquí "y" se detiene antes de llegar
            // a length - 1 porque dentro del for, accedemos
            // al siguiente elemento con el índice actual + 1
            for (int y = 0; y < arreglo.length - 1; y++) {
                int elementoActual = arreglo[y],
                        elementoSiguiente = arreglo[y + 1];
                if (elementoActual > elementoSiguiente) {
                    // Intercambiar
                    arreglo[y] = elementoSiguiente;
                    arreglo[y + 1] = elementoActual;
                }
            }
        }  
    }

    
    
    // Algoritmo de ordenamiento Inserción
    public void Insercion(int n) {
        
        // Genera el arreglo de n numeros
        int arreglo[] = new int[n];
        // Generar numeros aleatorios
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(101) + 0;
        }
      
        int p, j;
        int aux;
        for (p = 1; p < arreglo.length; p++){ // desde el segundo elemento hasta
            aux = arreglo[p];           // el final, guardamos el elemento y
            j = p - 1;            // empezamos a comprobar con el anterior
            while ((j >= 0) && (aux < arreglo[j])){ // mientras queden posiciones y el                                
                // valor de aux sea menor que los
                arreglo[j + 1] = arreglo[j];   // de la izquierda, se desplaza a
                j--;               // la derecha
            }
            arreglo[j + 1] = aux;       // colocamos aux en su sitio
        }
    }

    
    
    // Algoritmo de ordenamiento Selección
    public void Seleccion(int n) {
        
        // Genera el arreglo de n numeros
        int arreglo[] = new int[n];
        // Generar numeros aleatorios
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(101) + 0;
        }
             
        for (int i = 0; i < arreglo.length; i++) {
            int menor = i;
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[menor] > arreglo[j]) {
                    menor = j;
                }
            }
            int aux = arreglo[i];
            arreglo[i] = arreglo[menor];
            arreglo[menor] = aux;
        }
    }

    
    
    // Algoritmo de ordenamiento Shell Sort
    public void Shellsort(int n) {
        
        // Genera el arreglo de n numeros
        int arreglo[] = new int[n];
        // Generar numeros aleatorios
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = random.nextInt(101) + 0;
        }
        
        int salto, aux, i;
        boolean cambios;
  
        for (salto = arreglo.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {   // Mientras se intercambie algún elemento                                         
                cambios = false;
                for (i = salto; i < arreglo.length; i++)   // se da una pasada
                {
                    if (arreglo[i - salto] > arreglo[i]) {       // y si están desordenados
                        aux = arreglo[i];                  // se reordenan
                        arreglo[i] = arreglo[i - salto];
                        arreglo[i - salto] = aux;
                        cambios = true;              // y se marca como cambio.                                   
                    }
                }
            }
        }
    }

    
    
    // Algoritmo de ordenamiento Quick Sort
    public void quicksort(int arreglo[], int primer, int ultimo) {
        
        int i, j, pivote, aux;
        i = primer;
        j = ultimo;
        pivote = arreglo[(primer + ultimo) / 2];

        while (i <= j) {
            while (arreglo[i] < pivote) {
                i++;
            }
            while (arreglo[j] > pivote) {
                j--;
            }

            //Se hace el intercambio cuando los dos ciclos while pasados pararon, lo que significa que los numeros no van ahi
            if (i <= j) {
                aux = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = aux;
                i++;
                j--;
            }
        }

        if (primer < j) {
            quicksort(arreglo, primer, j);
        }
        if (i < ultimo) {
            quicksort(arreglo, i, ultimo);
        }
    }
}


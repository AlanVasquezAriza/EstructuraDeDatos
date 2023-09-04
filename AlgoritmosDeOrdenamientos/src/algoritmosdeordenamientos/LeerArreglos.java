package algoritmosdeordenamientos;

import java.util.Scanner;
import java.util.Random;

public class LeerArreglos {
    
    Scanner in = new Scanner(System.in);
    Algoritmos obj = new Algoritmos();
    Random random = new Random();
    
    public void llenarArrayTamaño(int array []){
        for(int i=0;i<array.length;i++){
            array[i] = random.nextInt(101)+0; // (maxValue - minValue + 1) + minValue
        }
    }
    
    public void leerArreglos(){
        System.out.println("Ingrese el tamaño del arreglo");
        int tamaño = in.nextInt();
        
        //int array [] = new int [tamaño];
        
        int array [] = new int [tamaño];
        llenarArrayTamaño(array);
        
        long initialTime = System.currentTimeMillis(); //Inicia el cronometro
        obj.quickSort(array, 0, array.length-1);
        long finishTime = System.currentTimeMillis(); //Termina el cronometro
        System.out.println("Duracion del algoritmo QuickSort: " + (finishTime-initialTime) + " milisegundos \n");
        
        System.out.println("Arreglo ordenado");
        //obj.mostrarArray(array); 
        
        long initialTime1 = System.currentTimeMillis(); //Inicia el cronometro
        obj.seleccionSort(array);
        long finishTime1 = System.currentTimeMillis(); //Termina el cronometro
        System.out.println("Duracion del algoritmo Seleccion: " + (finishTime1-initialTime1) + " milisegundos \n");
        
        System.out.println("Arreglo ordenado \n");
        //obj.mostrarArray(array);
    }
    
    public void tablaDuracion(){
        System.out.println("Ingrese el tamaño del arreglo");
        int tamaño = in.nextInt();
        
        int array [] = new int [tamaño];
        llenarArrayTamaño(array);
        
        //QuickSort
        long initialTime = System.currentTimeMillis(); //Inicia el cronometro
        obj.quickSort(array, 0, array.length-1);
        long finishTime = System.currentTimeMillis(); //Termina el cronometro
        System.out.println("Duracion del algoritmo QuickSort: " + (finishTime-initialTime) + " milisegundos \n");
        //obj.mostrarArray(array);
        
        //SeleccionSort
        long initialTime1 = System.currentTimeMillis(); //Inicia el cronometro
        obj.seleccionSort(array);
        long finishTime1 = System.currentTimeMillis(); //Termina el cronometro
        System.out.println("Duracion del algoritmo Seleccion: " + (finishTime1-initialTime1) + " milisegundos \n");
        //obj.mostrarArray(array);
    }
    
}

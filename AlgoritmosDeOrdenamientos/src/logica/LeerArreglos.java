package logica;

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
    
    public long burbujaSortNumeros(int tamaño){
        int array [] = new int [tamaño];
        
        llenarArrayTamaño(array);
//        obj.mostrarArray(array);
        
        long initialTime = System.currentTimeMillis(); //Inicia el cronometro
        obj.burbujaSort(array);
        long finishTime = System.currentTimeMillis(); //Termina el cronometro
        
        return finishTime-initialTime;
    }
    
    public long insercionSortNumeros(int tamaño){
        int array [] = new int [tamaño];
        
        llenarArrayTamaño(array);
//        obj.mostrarArray(array);
        
        long initialTime = System.currentTimeMillis(); //Inicia el cronometro
        obj.insercionSort(array);
        long finishTime = System.currentTimeMillis(); //Termina el cronometro
        
        return finishTime-initialTime;
    }
    
    public long seleccionSortNumeros(int tamaño){
        int array [] = new int [tamaño];
        
        llenarArrayTamaño(array);
//        obj.mostrarArray(array);
        
        long initialTime = System.currentTimeMillis(); //Inicia el cronometro
        obj.seleccionSort(array);
        long finishTime = System.currentTimeMillis(); //Termina el cronometro
        
        return finishTime-initialTime;
    }
    
    public long shellSortNumeros(int tamaño){
        int array [] = new int [tamaño];
        
        llenarArrayTamaño(array);
//        obj.mostrarArray(array);
        
        long initialTime = System.currentTimeMillis(); //Inicia el cronometro
        obj.shellSort(array);
        long finishTime = System.currentTimeMillis(); //Termina el cronometro
        
        return finishTime-initialTime;
    }
    
    public long quickSortNumeros(int tamaño){
        int array [] = new int [tamaño];
        
        llenarArrayTamaño(array);
//        obj.mostrarArray(array);
        
        long initialTime = System.currentTimeMillis(); //Inicia el cronometro
        obj.quickSort(array, 0, array.length-1);
        long finishTime = System.currentTimeMillis(); //Termina el cronometro
        
        return finishTime-initialTime;
    }
    
}

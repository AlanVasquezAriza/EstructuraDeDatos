package matrizempresa;

import java.util.ArrayList;
import java.util.Scanner;

public class MatrizEmpresa {
    
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> mayorMedia = new ArrayList();
    ArrayList<Double> menorMedia = new ArrayList();
    
    //Funcion que llena la matriz
    public void llenarMatriz(int [][] ventas){
        for(int i=0;i<ventas.length;i++){
            System.out.println("Ventas de la sede " + (i+1));

            for(int j=0;j<ventas[i].length;j++){
                ventas[i][j] = in.nextInt();
            }
        }
    }
    
    public void encontrarPromedio(int [][] ventas){
                int sumPromedio = 0;
        for(int i=0;i<ventas.length;i++){

            int suma = 0;
            for(int j=0;j<ventas[i].length;j++){
                suma += ventas[i][j];
            }
            int promedio = suma / ventas[i].length;
            System.out.println("\n \nPromedio semana " + (i+1) + ": " + promedio);

            for(int j=0;j<ventas[i].length;j++){
                if(ventas[i][j]>promedio){
                    mayorMedia.add(ventas[i][j]);
                }
                else{
                    double menorVenta = ventas[i][j];
                    menorMedia.add(menorVenta);
                }
            }

            System.out.println("Ventas mayores al promedio de la semana " + (i+1));
            for(int k=0;k<mayorMedia.size();k++){
                System.out.print(mayorMedia.get(k) + "  ");
            }
           
            System.out.println("\nVentas menores al promedio de la semana +15%");
            for(int k=0;k<menorMedia.size();k++){
                double menor = menorMedia.get(k);
                menor = (menor * 0.15) + menor;
               
                System.out.println(menor + "  ");
            }
           
            //Se eliminan los datos del ArrayList
            mayorMedia.clear();
            menorMedia.clear();

            //Calcula el promedio totsl
            sumPromedio += promedio;

 //            if(i == (ventas.length)-1){ //Cuando este en la ultima fila el -1 es por el for
 //                sumPromedio = sumPromedio / 6;
 //            }
        }
        System.out.println("\n \nPromedio Total: " + sumPromedio / ventas.length);
    }
    
    public void muestraMatriz(int [][] ventas){
        //Muestra la matriz
        for(int i=0;i<ventas.length;i++){

            for(int j=0;j<ventas[i].length;j++){
                System.out.print(ventas[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        //Declaracion de la matriz
        int ventas [][] = new int [3][3];
        MatrizEmpresa var = new MatrizEmpresa();
        
        var.llenarMatriz(ventas);

        System.out.print("Promedios Semanales:");
        var.encontrarPromedio(ventas);
        
        var.muestraMatriz(ventas);
    }
    
}
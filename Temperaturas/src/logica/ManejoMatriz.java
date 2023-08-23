package logica;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ManejoMatriz {
    
    Scanner in = new Scanner(System.in);
    private static final ManejoMatriz objeto = new ManejoMatriz(); //Creacion del objeto con Singleton, final porque siempre es el mismo
    int [][] matriz = new int [7][2]; //7 2 
    
    //ArrayList para guardar los datos de las temperaturas y sacar la media
    ArrayList<Integer> mediaMax = new ArrayList<>();
    ArrayList<Integer> mediaMin = new ArrayList<>();
    
    String dias [] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
    
    int num = 0, mediaMaxx = 0, mediaMinn = 0;
    String impMatriz = "", tempMax = "", tempMin = "";
    
    //Constructor oculto
    private ManejoMatriz(){}
    
    //Metodo que devuelve la unica instancia del objeto
    public static ManejoMatriz getInstancia(){
        return objeto;
    }
    
    public void llenarMatriz(){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                
                try{ //Captura excepcion cuando no se ingresa int
                    
                    //Bloque condicional que indentifica si es medida max o min
                    if(j==0){
                        String num1 = JOptionPane.showInputDialog("Ingrese la temperatura maxima del dia " + dias[i]);
                        num = Integer.parseInt(num1);
                    }
                    else{
                        String num1 = JOptionPane.showInputDialog("Ingrese la temperatura minima del dia " + dias[i]);
                        num = Integer.parseInt(num1);
                    }
                    
                    if(num<-40 || num>40){ //Se devuelve la iteracion si el numero no esta en el rango
                        System.out.println("El valor tiene que estar en el rango (-40,40)");
                        j--;
                    }
                    else{
                        matriz[i][j] = num;
                    }
                    
                }
                catch(Exception e){
                    System.out.println("Debe ingresar un numero");
                    j--;
                }
                
            }
        }
    }
    
    public String tempMax(){
        tempMax = "";
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                if(j==0){
                    if(matriz[i][j]>=15 && matriz[i][j]<=20){
                        tempMax += dias[i] + ": [" + matriz[i][j] + "]\n";
                    }
                }
            }
        }
        return tempMax;
    }
    
    public String tempMin(){
        tempMin = "";
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                if(j==1){
                    if(matriz[i][j]<=0){
                        tempMin += dias[i] + ": [" + matriz[i][j] + "]\n";
                    }
                }
            }
        }
        return tempMin;
    }
    
    public int mediaMax(){
        mediaMaxx = 0;
        int mediaMa = 0;
        for(int i=0;i<matriz.length;i++){
            mediaMax.add(matriz[i][0]);
        }
        for(int i=0;i<mediaMax.size();i++){
            mediaMaxx += mediaMax.get(i);
        }
        
        mediaMa = mediaMaxx / mediaMax.size();
        return mediaMa;
    }
    
    public int mediaMin(){
        mediaMinn = 0;
        int mediaMi = 0;
        for(int i=0;i<matriz.length;i++){
            mediaMin.add(matriz[i][1]);
        }
        for(int i=0;i<mediaMin.size();i++){
            mediaMinn += mediaMin.get(i);
        }
        
        mediaMi = mediaMinn / mediaMin.size();
        return mediaMi;
    }
    
    public String mostrarMatriz(){
        impMatriz = "";
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                if(j==0){
                    impMatriz += String.valueOf(dias[i] + ": [" + matriz[i][j]) + "   ,   ";
                }
                else{
                    impMatriz += String.valueOf(matriz[i][j]) + "]";
                }
            }
            impMatriz += "\n";
        }
        return impMatriz;
    }
    
}

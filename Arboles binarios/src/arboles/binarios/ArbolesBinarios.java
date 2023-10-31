package arboles.binarios;

import javax.swing.*;

public class ArbolesBinarios {

    public static void main(String[] args) {
        
        ArbolBinario arbol = new ArbolBinario();
        
        int i=1, opcion = 0;
        ArbolBinarioGraficoString pantalla;
        
        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog("1. Arbol de enteros \n2. Arbol de cadenas \n3. Salir"));
            }
            catch(Exception e){
                System.out.println("Ingrese una opcion valida");
            }
            
            switch(opcion){
                case 1:
                    //Entero
                    //arbol.insertarNodoCadena("45,23,2,7,65,38,52,96,48");
                    arbol.insertarNodoCadena("45,23,2,1,7,65,50,70");
                    System.out.print("In-Orden: ");
                    ArbolBinario.inOrdenInt(arbol.getRaiz());
                    System.out.println();

                    System.out.print("Pre-Orden: ");
                    ArbolBinario.preOrdenInt(arbol.getRaiz());
                    System.out.println();

                    System.out.print("Post-Orden: ");
                    ArbolBinario.postOrdenInt(arbol.getRaiz());
                    
                    System.out.println("\nAltura del arbol: " + arbol.retornarAltura());
                    
                    arbol.busquedaEnAmplitudInt();
                    
                    System.out.println();
                    
                    System.out.println("Grado del arbol: " + arbol.calcularGrado());
                    
                    pantalla = new ArbolBinarioGraficoString(arbol, 1);
                    pantalla.setVisible(true);
                    pantalla.setSize(400, 400);
                    pantalla.setLocationRelativeTo(null);
                    break;
                case 2:
                    //Cadena
                    arbol.insertar("A");
                    arbol.insertar("R");
                    arbol.insertar("D");
                    arbol.insertar("N");
                    arbol.insertar("Q");
                    arbol.insertar("B");
                    arbol.insertar("O");
                    arbol.insertar("I");
                    arbol.insertar("W");
                    arbol.insertar("G");

                    System.out.print("In-Orden: ");
                    ArbolBinario.inOrden(arbol.getRaiz());
                    System.out.println();

                    System.out.print("Pre-Orden: ");
                    ArbolBinario.preOrden(arbol.getRaiz());
                    System.out.println();

                    System.out.print("Post-Orden: ");
                    ArbolBinario.postOrden(arbol.getRaiz());
                    
                    System.out.println("\nAltura del arbol: " + arbol.retornarAltura());
                    
                    arbol.busquedaEnAmplitudString();
                    
                    System.out.println("\nGrado del arbol: " + arbol.calcularGrado());
                    
                    pantalla = new ArbolBinarioGraficoString(arbol, 2);
                    pantalla.setVisible(true);
                    pantalla.setSize(400, 400);
                    pantalla.setLocationRelativeTo(null);
                    break;
                case 3:
                    i = 0;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
        }
        while(i>0);
        
    }
}
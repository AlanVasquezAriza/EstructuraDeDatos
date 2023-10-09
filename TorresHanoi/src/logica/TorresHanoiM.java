package logica;

import igu.Juego;
import javax.swing.JOptionPane;

public class TorresHanoiM {

    public static void main(String[] args) {
        
        int cantidadDiscos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de discos"));
        
        
        Juego pantalla = new Juego(cantidadDiscos);
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);

//        Pilas pila1 = new Pilas();
//        
//        pila1.push(3);
//        pila1.push(2);
//        pila1.push(1);
//        
//        System.out.println(pila1.mostrar(pila1));
//        System.out.println(pila1.mostrarNumerales(pila1));
//        
//        pila1.pop(pila1);
//        pila1.pop(pila1);
//        pila1.pop(pila1);
//        
//        System.out.println("peek: " + pila1.peek(pila1));
//        
//        
//        
//        System.out.println("");
//        
//        System.out.println(pila1.mostrar(pila1));
//        System.out.println(pila1.mostrarNumerales(pila1));
//        
//        pila1.push(4);
//        pila1.push(4);
//        
//        System.out.println(pila1.mostrar(pila1));
//        System.out.println(pila1.mostrarNumerales(pila1));
    }
    
}

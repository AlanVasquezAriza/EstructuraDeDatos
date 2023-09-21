package cantantesfamosos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CantanteFamoso {
   
    protected String nombre = "";
    protected String nombreDisco = "";
    protected int ventaDiscos = 0;
    protected int totalVentas = 0;
    protected HashMap<String, Integer> discosVendidos = new HashMap<>();
    Scanner inStr = new Scanner(System.in);
    Scanner inInt = new Scanner(System.in);
   
    public CantanteFamoso(String nombreR){
        this.nombre  = nombreR;
        int cuantosDiscos = Integer.parseInt(JOptionPane.showInputDialog("Cuantos discos tiene " + nombreR));
        for(int i=0;i<cuantosDiscos;i++){
            System.out.println("Nombre del disco N° " + (i+1));
            nombreDisco = inStr.nextLine();
            System.out.println("Cuantos discos " + nombreDisco + " se vendieron");
            ventaDiscos = inInt.nextInt();
            this.discosVendidos.put(nombreDisco, ventaDiscos);
        }
        for(Map.Entry<String, Integer> entry : discosVendidos.entrySet()){
            totalVentas += entry.getValue();
        }
    }
    
    public int getTotalVentas(){
        return this.totalVentas;
    }

    public String getNombre(){
        return this.nombre;
    }
   
    public void setNombre(String nombreR){
        this.nombre  = nombreR;
    }
   
    public void mostrarObjeto(){
        System.out.println("Nombre: " + this.nombre);
        
        for(Map.Entry<String, Integer> entry : discosVendidos.entrySet()){
            System.out.println("Disco: " + entry.getKey() + " | Ventas: " + entry.getValue());
        }
        System.out.println("Total ventas: " + totalVentas);
    }
    
}
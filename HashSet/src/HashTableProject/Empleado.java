package HashTableProject;

import java.util.Hashtable;
import java.util.Map;
import java.util.Random;

public class Empleado {
    
    protected Hashtable<Integer, Integer> rut = new Hashtable<>();
    protected Hashtable<Integer, Integer> sueldo = new Hashtable<>();
    protected AlgoritmoOrdenamiento algoritmo = new AlgoritmoOrdenamiento();
    protected Random random = new Random();
    
    protected String numEmpleado = "";
    protected int numRUT = 0;
    
    protected int sueldoEmpleado = 0;
    protected double sueldoMasCinco = 0, totalBonificaciones = 0;
    protected int array [] = new int [10];
    
    //Constructor
    public Empleado(){}
    
    //Llena los datos del empleado en los hashTable
    public void llenarRUT(int pos, int num){
        rut.put(pos, numRUT = num);
    }
    
    public void llenarSueldo(int pos){
        sueldo.put(pos, sueldoEmpleado = random.nextInt(2001) + 1000);
    }
    
    //Muestra la informacion de los empleados
    public void mostrarInfoEmpleado(int i){
        System.out.println("Objeto " + (i) + " :" + rut.get(i));
        
        System.out.println("Sueldo: " + sueldo.get(i) + "\n");
    }
    
    //Se llena un array con los los sueldos
    public void comparaPrimerosTreinta(){
        for(int i=0;i<=9;i++){
            array[i] = sueldo.get(i);
        }
        mostrarArray();
        OrganizarSueldos();
        mostrarArray();
        System.out.println();
        
        for(int i=1;i<=9;i++){
            for(int j=0;j<=9;j++){
                
                if(i == 1){
                    if(array[0] == sueldo.get(j)){
                        System.out.println("**El valor: " + array[0] + " esta en la posicion " + (j));
                    }
                }
                
                if(array[i] == array[i-1]){
                    break;
                }
                
                if(array[i] == sueldo.get(j)){
                    System.out.println("El valor: " + array[i] + " esta en la posicion " + j);
                }
                
            }
        }
    }
    
    public void bonificacion5Porciento(){
        System.out.println();
        System.out.println("Los empleados identificados con los siguientes RUT han sido beneficiados con aumento del 5% de su sueldo: ");
        System.out.println("    RUT    ||    Sueldo    ||      +5%    ");
        
        for(int i=0;i<=4;i++){ //Se limita el for para dar la bonificacion
            if(sueldo.containsValue(array[i])){
            
                for (Map.Entry<Integer, Integer> entry : sueldo.entrySet()) {
                    if (entry.getValue().equals(array[i])) {
                        Integer claveCorrespondiente = entry.getKey();
                        sueldoMasCinco = (sueldo.get(claveCorrespondiente) * 0.05) + sueldo.get(claveCorrespondiente);
                        totalBonificaciones += 0.05 * sueldo.get(claveCorrespondiente);
                        System.out.println("    " + rut.get(claveCorrespondiente) + "    ||     " + sueldo.get(claveCorrespondiente) + "     ||    " + sueldoMasCinco);
                        break; 
                    }
                }
            }
        }
        System.out.println("Costo total de las bonificaciones: " + totalBonificaciones);
        
    }
    
    public void OrganizarSueldos(){
        algoritmo.quickSort(array, 0, array.length-1);
    }
    
    public void mostrarArray(){
        for(int i : array){
            System.out.print(i + "  ");
        }
        System.out.println();
    }
    
}

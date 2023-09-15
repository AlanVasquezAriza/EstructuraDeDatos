package HashTableProject;

import java.util.Hashtable;
import java.util.Map;
import java.util.Random;
import javax.swing.JOptionPane;

public class Empleado {
    
    protected Hashtable<Integer, Empleado> rut = new Hashtable<>();
    protected Hashtable<Integer, Empleado> sueldo = new Hashtable<>();
    protected AlgoritmoOrdenamiento algoritmo = new AlgoritmoOrdenamiento();
    protected Random random = new Random();
    
    protected int numRUT = 0;
    
    protected int sueldoEmpleado = 0;
    protected double sueldoMasCinco = 0, totalBonificaciones = 0;
    protected int array [] = new int [100];
    
    //Constructor
    public Empleado(){}
    
    public Empleado(String i){
        this.sueldoEmpleado = random.nextInt(2001) + 100;
    }
    
    public Empleado(int num){
        this.numRUT = num;
    }
    
    //Llena los datos del empleado en los hashTable
    public void llenarRUT(int pos, int num){
        rut.put(pos, new Empleado(num));
    }
    
    public void llenarSueldo(int pos){
        sueldo.put(pos, new Empleado("e"));
    }
    
    //Muestra la informacion de los empleados
    public void mostrarInfoEmpleado(int i){
        Empleado obj = rut.get(i);
        System.out.println("Objeto " + (i) + " :" + obj.getNumRUT());
        
        Empleado obj1 = sueldo.get(i);
        System.out.println("Sueldo: " + obj1.getSueldoEmpleado() + "\n");
    }
    
    //Se llena un array con los los sueldos
    public void comparaPrimerosTreinta(){
        for(int i=0;i<=99;i++){
            Empleado obj = sueldo.get(i);
            array[i] = obj.getSueldoEmpleado();
        }
        //mostrarArray();
        OrganizarSueldos();
        //mostrarArray();
        System.out.println();
        
        /*for(int i=1;i<=99;i++){
            for(int j=0;j<=99;j++){
                Empleado obj = sueldo.get(j);
                if(i == 1){
                    if(array[0] == obj.getSueldoEmpleado()){
                        System.out.println("**El valor: " + array[0] + " esta en la posicion " + (j));
                    }
                }
                
                if(array[i] == array[i-1]){
                    break;
                }
                
                if(array[i] == obj.getSueldoEmpleado()){
                    System.out.println("El valor: " + array[i] + " esta en la posicion " + j);
                }
                
            }
        }*/
    }
    
    public void bonificacion5Porciento(){
        System.out.println();
        System.out.println("Los empleados identificados con los siguientes RUT han sido beneficiados con aumento del 5% de su sueldo: ");
        System.out.println("    RUT    ||    Sueldo    ||      +5%    ");
        
        for(int i=0;i<=29;i++){ //Se limita el for para dar la bonificacion
            for (Map.Entry<Integer, Empleado> entry : sueldo.entrySet()) {
                if (entry.getValue().getSueldoEmpleado() == array[i]) {
                    Integer claveCorrespondiente = entry.getKey();
                    sueldoMasCinco = (sueldo.get(claveCorrespondiente).getSueldoEmpleado() * 0.05) + sueldo.get(claveCorrespondiente).getSueldoEmpleado();
                    totalBonificaciones += 0.05 * sueldo.get(claveCorrespondiente).getSueldoEmpleado();
                    System.out.println("    " + rut.get(claveCorrespondiente).getNumRUT() + "    ||     " + sueldo.get(claveCorrespondiente).getSueldoEmpleado() + "     ||    " + sueldoMasCinco);
                    break; 
                }
            }
            
        }
        System.out.println("Costo total de las bonificaciones: " + totalBonificaciones);
    }
    
    public void menorBonificacion(){
        System.out.println("\nEmpleado con menor bonificacion: ");
        Integer claveCorrespondiente = 0;
        for (Map.Entry<Integer, Empleado> entry : sueldo.entrySet()) {
            if (entry.getValue().getSueldoEmpleado() == array[0]) {
                claveCorrespondiente = entry.getKey();
                break; 
            }
        }
        System.out.println("Rut " + rut.get(claveCorrespondiente).getNumRUT() + " con sueldo de: " + sueldo.get(claveCorrespondiente).getSueldoEmpleado());
    }
    
    public void mayorBonificacion(){
        System.out.println("\nEmpleado con mayor bonificacion: ");
        Integer claveCorrespondiente = 0;
        for (Map.Entry<Integer, Empleado> entry : sueldo.entrySet()) {
            if (entry.getValue().getSueldoEmpleado() == array[29]) {
                claveCorrespondiente = entry.getKey();
                break; 
            }
        }
        System.out.println("Rut " + rut.get(claveCorrespondiente).getNumRUT() + " con sueldo de: " + sueldo.get(claveCorrespondiente).getSueldoEmpleado());
    }
    
    public void encontrarEmpleadoRut(int rutBuscar){
        Integer claveCorrespondiente = 0;
        for (Map.Entry<Integer, Empleado> entry : rut.entrySet()) {
            if (entry.getValue().getNumRUT() == rutBuscar) {
                claveCorrespondiente = entry.getKey();
                break; 
            }
        }
        System.out.println("\nRut ingresado: " + rutBuscar);
        System.out.println("Empleado " + claveCorrespondiente + " con rut " + rut.get(claveCorrespondiente).getNumRUT() + " sueldo: " + sueldo.get(claveCorrespondiente).getSueldoEmpleado());
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
    
     //Getters
    public int getSueldoEmpleado(){
        return sueldoEmpleado;
    }

    public int getNumRUT() {
        return numRUT;
    }
    
}

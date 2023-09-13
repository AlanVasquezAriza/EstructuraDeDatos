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
        mostrarArray();
        System.out.println();
        
        for(int i=0;i<=4;i++){
            if(sueldo.containsValue(array[i])){
                System.out.println(sueldo.containsValue(array[i]) + " " + array[i]);
            }
            for (Map.Entry<Integer, Integer> entry : sueldo.entrySet()) {
                if (entry.getValue().equals(array[i])) {
                    Integer claveCorrespondiente = entry.getKey();
                    System.out.println("La clave correspondiente al valor '" + array[i] + "' es: " + claveCorrespondiente + "\n");
                    break; // Detiene la búsqueda una vez que se encuentra la primera coincidencia
                }
            }
        }
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
    public String getNumEmpleado(){
        return numEmpleado;
    }
    
    public int getSueldoEmpleado(){
        return sueldoEmpleado;
    }

    public int getNumRUT() {
        return numRUT;
    }
    
}

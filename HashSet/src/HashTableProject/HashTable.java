package HashTableProject;

public class HashTable {

    public static void main(String[] args) {
        
        Empleado empleado = new Empleado();
        int num = 123;
        
        for(int i=0;i<=9;i++){
            empleado.llenarRUT(i, num);
            empleado.llenarSueldo(i);
            num++;
        }
        
        for(int i=0;i<=9;i++){
            empleado.mostrarInfoEmpleado(i);
        }
        
        empleado.comparaPrimerosTreinta();
        
        empleado.bonificacion5Porciento();
        
    }
    
}

package HashTableProject;

import javax.swing.JOptionPane;

public class HashTable {

    public static void main(String[] args) {
        
        Empleado empleado = new Empleado();
        int num = 123;
        
        //Ciclo for que llena los rut con el apuntador "i" y el sueldo de manera aleatoria
        for(int i=0;i<=99;i++){
            empleado.llenarRUT(i, num);
            empleado.llenarSueldo(i);
            num++;
        }
        
        for(int k=0; k<=10; k++){
            int opcion =  Integer.parseInt(JOptionPane.showInputDialog("Empresa ABC \n1. Informacion de los empleados "
                    + "\n2. Dar la bonificacion \n3. Empleado con menor bonificacion"
                    + "\n4. Empleado con mayor bonificacion \n5. Encontrar empleado con su RUT \n6. Salir"));
            
            switch(opcion){
                case 1:
                    for(int i=0;i<=99;i++){
                        empleado.mostrarInfoEmpleado(i);
                    }
                    break;
                case 2:
                    empleado.comparaPrimerosTreinta();
                    empleado.bonificacion5Porciento();
                    break;
                case 3:
                    empleado.menorBonificacion();
                    break;
                case 4:
                    empleado.mayorBonificacion();
                    break;
                case 5:
                    for(int j=0; j<1; j++){
                        int rutBuscar =  Integer.parseInt(JOptionPane.showInputDialog("Ingrese el empleado a buscar con el rut "));
        
                        if(rutBuscar >= 123 && rutBuscar <=222){
                            empleado.encontrarEmpleadoRut(rutBuscar);
                        }
                        else{
                            System.out.println("Ingrese valores entre 123 y 222 que es el rango de los RUT");
                            j--;
                        }
                    }
                    break;
                case 6:
                    System.out.println("Salir");
                    k = 11;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
        }
        
    }
    
}

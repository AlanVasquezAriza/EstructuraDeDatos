package cantantesfamosos;

import javax.swing.JOptionPane;

public class CantantesFamosos {

    public static void main(String[] args) {
       
        ListaCantantesFamosos lista = new ListaCantantesFamosos();
        
        int i=1, opcion = 0;
        
        do{
            try{
                opcion = Integer.parseInt(JOptionPane.showInputDialog("1. Registrar cantante \n2. Mostrar lista \n3. Modificar Cantante"
                    + "\n4. Eliminar cantante \n5. Lista de discos vendidos Mayor a menor \n6. Salir "));
            }
            catch(Exception e){
                System.out.println("Ingrese una opcion valida");
            }
            
            switch(opcion){
                case 1:
                    //Añadir cantantes
                    String nombre = JOptionPane.showInputDialog("Ingresa el nombre");
                    lista.registrarCantante(nombre);
                    break;
                case 2:
                    //Mostrar ArrayList
                    if(!lista.addCantantesFamosos.isEmpty()){
                        lista.mostrarArrayList();
                    }
                    else{
                        System.out.println("No se han registrado cantantes");
                    }
                    break;
                case 3:
                    //Modificar cantante
                    String nombreBuscado = JOptionPane.showInputDialog("Nombre actual a modificar");
                    String nombreNuevo = JOptionPane.showInputDialog("Nombre a actualizar");
                    lista.modificarCantante(nombreBuscado, nombreNuevo);
                    break;
                case 4:
                    //Eliminar cantante
                    String nombreEliminar = JOptionPane.showInputDialog("Nombre actual a eliminar");
                    lista.eliminarCantante(nombreEliminar);
                    break;
                case 5:
                    //Lista de discos vendidos Mayor a menor
                    lista.ordenarArrayCantantesDisco();
                    break;
                case 6:
                    i = 0;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
        }
        while(i>0);
       
    }
   
}
package cantantesfamosos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ListaCantantesFamosos {
    
    protected ArrayList<CantanteFamoso> addCantantesFamosos = new ArrayList<>();
    
    public void registrarCantante(String nombre){
        this.addCantantesFamosos.add(new CantanteFamoso(nombre));
    }
    
    public void mostrarArrayList(){
        for(int i=0;i<addCantantesFamosos.size();i++){
            addCantantesFamosos.get(i).mostrarObjeto();
        }
    }
    
    public void modificarCantante(String nombreBuscado, String nombreNuevo){
        for(int i=0;i<addCantantesFamosos.size();i++){
            if(addCantantesFamosos.get(i).getNombre().equals(nombreBuscado)){
                addCantantesFamosos.get(i).setNombre(nombreNuevo);
            }
        }
    }
    
    public void eliminarCantante(String nombreEliminar){
        for(int i=0;i<addCantantesFamosos.size();i++){
            if(addCantantesFamosos.get(i).getNombre().equals(nombreEliminar)){
                addCantantesFamosos.remove(i);
            }
        }
    }
    
    public void ordenarArrayCantantesDisco(){
        Comparator<CantanteFamoso> comparador = new Comparator<CantanteFamoso>() {
            @Override
            public int compare(CantanteFamoso cantante1, CantanteFamoso cantante2) {
                // Comparar por el atributo "valor"
                return Integer.compare(cantante2.getTotalVentas(), cantante1.getTotalVentas());
            }
        };

        // Ordenar la lista utilizando el comparador personalizado
        Collections.sort(addCantantesFamosos, comparador);

        // Imprimir la lista ordenada
        for (CantanteFamoso objeto : addCantantesFamosos) {
            objeto.mostrarObjeto();
        }
    }
   
}
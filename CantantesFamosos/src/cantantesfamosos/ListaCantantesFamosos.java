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
        
        for(Iterator<CantanteFamoso> iterator = addCantantesFamosos.iterator(); iterator.hasNext();){
            CantanteFamoso obj = (CantanteFamoso) iterator.next();
            obj.mostrarObjeto();
        }
        
    }
    
    public void modificarCantante(String nombreBuscado, String nombreNuevo){
        
        for(Iterator<CantanteFamoso> iterator = addCantantesFamosos.iterator(); iterator.hasNext();){
            CantanteFamoso obj = (CantanteFamoso) iterator.next();
            if(obj.getNombre().equals(nombreBuscado)){
                obj.setNombre(nombreNuevo);
            }
        }
        
    }
    
    public void eliminarCantante(String nombreEliminar){
        
        for(Iterator<CantanteFamoso> iterator = addCantantesFamosos.iterator(); iterator.hasNext();){
            CantanteFamoso obj = (CantanteFamoso) iterator.next();
            if(obj.getNombre().equals(nombreEliminar)){
                addCantantesFamosos.remove(obj);
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
        for(Iterator<CantanteFamoso> iterator = addCantantesFamosos.iterator(); iterator.hasNext();){
            CantanteFamoso obj = (CantanteFamoso) iterator.next();
            obj.mostrarObjeto();
        }
    }
   
}

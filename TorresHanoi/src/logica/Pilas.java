package logica;

public class Pilas {
    
    public Nodo primero;
    public Nodo ultimo;
    public int tamaño;
    
    public String str = "";
    
    public Pilas(){
        primero = null;
        tamaño = 0;
    }
    
    public boolean isEmpty(){
        return (primero == null);
    }
    
    //Agrega un dato en la ultima posicion
    public void push(int dato){
        
        Nodo nodo = new Nodo();
        
        if(isEmpty()){
            primero = nodo;
            ultimo = nodo;
            nodo.enlace = null;
            nodo.setDato(dato);
        }
        else{
            nodo.enlace = null;
            ultimo.enlace = nodo;
            ultimo = nodo;
            nodo.setDato(dato);
        }
        
        tamaño ++;
        
    }
    
    //Elimina el ultimo dato en la pila
    public void pop(Pilas pila){
        
        Nodo eliminar = null;
        Nodo aux = pila.primero;
        
        for(int i=0;i<pila.tamaño;i++){
            if(i == (pila.tamaño)-2){
                
                eliminar = aux.enlace;
                ultimo = aux;
                ultimo.enlace=null;
                //eliminar = null;
                
                tamaño--;
            }
            aux = aux.enlace;
        }
        
    }
    
    //Devuelve el ultimo dato en la pila
    public int peek(Pilas pila){
        
        Nodo aux = pila.primero;
        
        while(aux != pila.ultimo){
            aux = aux.enlace;
        }
        
        return aux.getDato();
    }
    
    //Devuelve una cadena de "#" con el dato en cada posicion
    public String mostrar(Pilas pila){
        
        str = "";
        
        if(pila.isEmpty()){
            str = "La pila esta vacia";
        }
        else{
            Nodo aux = pila.primero;
            for(int i=0;i<pila.tamaño;i++){
                str += aux.getDato() + "\n";
                aux = aux.enlace;
            }
        }
        
        return str;
        
    }
    
    //Devuelve una cadena de "#" con la cantidad correspondiente al dato en la pila, empezando por el ultimo elemento en la pila y terminando por el peek
    public String mostrarNumerales(Pilas pila){
        
        str = "";
        
        int array [] = new int [pila.tamaño];
        
        if(pila.isEmpty()){
            str = "La pila esta vacia";
        }
        else{
            
            Nodo aux = pila.primero;
            for(int i=0;i<pila.tamaño;i++){
                array[i] = aux.getDato();
                aux = aux.enlace;
            }
            
            for(int i=array.length-1;i>=0;i--){
                str += "#".repeat(array[i]) + "\n";
            }
            
        }
        
        return str;
        
    }
    
}

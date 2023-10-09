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
        
        // Define un nuevo nodo.
        Nodo nuevo = new Nodo();
        // Agrega al valor al nodo.
        nuevo.setDato(dato);
        // Consulta si la pila esta vacia.
        if (isEmpty()) {
            // Inicializa la pila con el nuevo valor.
            primero = nuevo;
            ultimo = nuevo;
        }
        // Caso contrario agrega el nuevo nodo al inicio de la pila.
        else{
            nuevo.setEnlace(primero);
            primero = nuevo;
        }
        // Incrementa el contador del tamaño.
        tamaño++;
        
    }
    
    //Elimina el ultimo dato en la pila
    public void pop(Pilas pila){
        
        if (!isEmpty()) {
            // Asigna como primer nodo al siguiente de la pila.
            primero = primero.getEnlace();
            // Decrementa el contador del tamaño de la pila
            // System.out.println("Enlace: " + primero + " " + ultimo.getDato()); //El ultimo enlace es null
            tamaño--;
        }
        else{
            System.out.println("Esta vacia");
        }
        
    }
    
    //Devuelve el ultimo dato en la pila
    public int peek(Pilas pila){
        
        int dato = 0;
        
        if(!isEmpty()){
            dato = primero.getDato();
        }
        else {
            System.out.println("La pila se encuentra vacia.");
        }
        return dato;
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
            
            for(int i=0;i<array.length;i++){
                str += "#".repeat(array[i]) + "\n";
            }
            
        }
        
        return str;
        
    }
    
}

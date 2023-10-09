package logica;

public class Nodo {
    
    public int dato;
    public Nodo enlace;
    
    public Nodo (){
        dato = 0;
        enlace = null;
    }
    
    public int getDato(){
        return this.dato;
    }
    
    public Nodo getEnlace(){
        return this.enlace;
    }
    
    public void setDato(int dato){
        this.dato = dato;
    }
    
    public void setEnlace(Nodo enlace){        
        this.enlace = enlace;
    }
    
}

package arboles.binarios;

public class Nodo {
    public String datoString;
    public int datoInt;
    public Nodo hijoIzquierdo, hijoDerecho;

    //Constructor cuando es String
    public Nodo(String datoString) {
        this.datoString = datoString;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
    }
    
    //Constructor cuando es int
    public Nodo(int datoInt, int i) {
        this.datoInt = datoInt;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
    }

    public String getDatoString() {
        return datoString;
    }

    public int getDatoInt() {
        return datoInt;
    }

    public Nodo getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public Nodo getHijoDerecho() {
        return hijoDerecho;
    }

    
    
}
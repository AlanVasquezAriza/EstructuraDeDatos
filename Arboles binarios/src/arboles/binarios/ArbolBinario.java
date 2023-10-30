package arboles.binarios;

import java.util.LinkedList;
import java.util.Queue;

public class ArbolBinario {

    private Nodo raiz;
    private int cant;
    private int cantHojas;
    private int altura;
    private int nodoMenor;
    private int nodoMayor;

    public ArbolBinario () {
        raiz = null;
    }

    //Cuando el dato es String
    public void insertar(Nodo padre, String num) {
        
        //System.out.println(num.compareTo(padre.datoString));
        
        if (num.compareTo(padre.datoString) < 0) {
            if (padre.hijoDerecho == null) {
                padre.hijoDerecho = new Nodo(num);
            } else {
                insertar(padre.hijoDerecho, num);
            }
        } else {
            if (padre.hijoIzquierdo == null) {
                padre.hijoIzquierdo = new Nodo(num);
            } else {
                this.insertar(padre.hijoIzquierdo, num);
            }
        }

    }
    
    public void insertar(String dato) {
       if (raiz == null) {
           raiz = new Nodo(dato);
       } else {
           insertar(this.raiz, dato);
       }
    }
    
    //Ordenamientos
    public static void inOrden(Nodo nodo) {
        if (nodo != null) {
            inOrden(nodo.hijoIzquierdo);
            System.out.print(nodo.datoString + ", ");
            inOrden(nodo.hijoDerecho);
        }
    }

    public static void preOrden(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.datoString + ", ");
            preOrden(nodo.hijoIzquierdo);
            preOrden(nodo.hijoDerecho);
        }
    }

    public static void postOrden(Nodo nodo) {
        if (nodo != null) {
            postOrden(nodo.hijoIzquierdo);
            postOrden(nodo.hijoDerecho);
            System.out.print(nodo.datoString + ", ");
        }
    }
    
    //Cuando el dato es int
    public void insertarNodo (int num) {
        Nodo nuevoNodo = new Nodo(num, 1);
        if (raiz == null) raiz = nuevoNodo;
        else {
            Nodo aux = raiz;
            Nodo padre;

            while (true) {
                padre = aux;
                if (num < aux.datoInt) {
                    aux = aux.hijoIzquierdo;

                    if (aux == null) {
                        padre.hijoIzquierdo = nuevoNodo;
                        return;
                    }
                } else {
                    aux = aux.hijoDerecho;

                    if (aux == null) {
                        padre.hijoDerecho = nuevoNodo;
                        return;
                    }
                }
            }
        }


    }

    public void insertarNodoCadena (String cadenaNodos) {
        String[] nodos = cadenaNodos.split(",");
        for (String nodo : nodos) {
            insertarNodo(Integer.valueOf(nodo));
        }
    }
    
    public boolean estaVacio() {
        return raiz == null;
    }

    //Ordenamientos
    public static void inOrdenInt(Nodo nodo) {
        if (nodo != null) {
            inOrdenInt(nodo.hijoIzquierdo);
            System.out.print(nodo.datoInt + ", ");
            inOrdenInt(nodo.hijoDerecho);
        }
    }

    public static void preOrdenInt(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.datoInt + ", ");
            preOrdenInt(nodo.hijoIzquierdo);
            preOrdenInt(nodo.hijoDerecho);
        }
    }

    public static void postOrdenInt(Nodo nodo) {
        if (nodo != null) {
            postOrdenInt(nodo.hijoIzquierdo);
            postOrdenInt(nodo.hijoDerecho);
            System.out.print(nodo.datoInt + ", ");
        }
    }
    
    public int retornarAltura () {
        altura = 0;
        retornarAltura(raiz, 1);
        return altura;
    }

    private void retornarAltura (Nodo nodo, int nivel) {
        if (nodo != null) {
            retornarAltura(nodo.hijoIzquierdo, (nivel +1 ));
            if (nivel > altura) altura = nivel;
            retornarAltura(nodo.hijoDerecho, (nivel + 1));
        }
    }
    
    public void busquedaEnAmplitudInt() {
        if (raiz == null) {
            return; // Si el árbol está vacío, no hay nada que buscar.
        }

        Queue<Nodo> cola = new LinkedList<>();
        cola.offer(raiz); // Agrega la raíz a la cola

        while (!cola.isEmpty()) {
            Nodo nodoActual = cola.poll(); // Obtiene el primer nodo de la cola
            System.out.print(nodoActual.datoInt + " "); // Realiza la operación deseada (por ejemplo, imprimir el valor)

            // Agrega los hijos a la cola si existen
            if (nodoActual.hijoIzquierdo != null) {
                cola.offer(nodoActual.hijoIzquierdo);
            }
            if (nodoActual.hijoDerecho != null) {
                cola.offer(nodoActual.hijoDerecho);
            }
        }
    }
    
        public void busquedaEnAmplitudString() {
        if (raiz == null) {
            return; // Si el árbol está vacío, no hay nada que buscar.
        }

        Queue<Nodo> cola = new LinkedList<>();
        cola.offer(raiz); // Agrega la raíz a la cola

        while (!cola.isEmpty()) {
            Nodo nodoActual = cola.poll(); // Obtiene el primer nodo de la cola
            System.out.print(nodoActual.datoString + " "); // Realiza la operación deseada (por ejemplo, imprimir el valor)

            // Agrega los hijos a la cola si existen
            if (nodoActual.hijoIzquierdo != null) {
                cola.offer(nodoActual.hijoIzquierdo);
            }
            if (nodoActual.hijoDerecho != null) {
                cola.offer(nodoActual.hijoDerecho);
            }
        }
    }

    public Nodo getRaiz() {
        return raiz;
    }

}
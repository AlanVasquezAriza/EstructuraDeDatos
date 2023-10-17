public class ListaCircular {
    private Nodo cabeza;
    private int tamaño;

    public ListaCircular() {
        cabeza = null;
        tamaño = 0;
    }

    public void insertar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cabeza.setSiguiente(cabeza);
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != cabeza) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
            nuevoNodo.setSiguiente(cabeza);
        }
        tamaño++;
    }

    public boolean eliminar(int valor) {
        if (cabeza == null) {
            return false;
        }

        if (cabeza.getValor() == valor) {
            if (tamaño == 1) {
                cabeza = null;
            } else {
                Nodo actual = cabeza;
                while (actual.getSiguiente() != cabeza) {
                    actual = actual.getSiguiente();
                }
                cabeza = cabeza.getSiguiente();
                actual.setSiguiente(cabeza);
            }
            tamaño--;
            return true;
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != cabeza) {
                if (actual.getSiguiente().getValor() == valor) {
                    actual.setSiguiente(actual.getSiguiente().getSiguiente());
                    tamaño--;
                    return true;
                }
                actual = actual.getSiguiente();
            }
        }
        return false;
    }

    public boolean actualizar(int valorAntiguo, int valorNuevo) {
        if (cabeza == null) {
            return false;
        }

        boolean seActualizo = false;

        Nodo actual = cabeza;
        do {
            if (actual.getValor() == valorAntiguo) {
                actual.setValor(valorNuevo);
                seActualizo = true;
            }
            actual = actual.getSiguiente();
        } while (actual != cabeza);

        return seActualizo;
    }

    public boolean actualizarPorPosicion(int posicion, int valorNuevo) {
        if (cabeza == null || posicion < 0 || posicion >= tamaño) {
            return false;
        }

        Nodo actual = cabeza;
        for (int i = 0; i < posicion; i++) {
            actual = actual.getSiguiente();
        }
        actual.setValor(valorNuevo);

        return true;
    }



    public int buscar(int valor) {
        if (cabeza == null) {
            return -1;
        }

        Nodo actual = cabeza;
        int posicion = 0;

        do {
            if (actual.getValor() == valor) {
                return posicion;
            }
            actual = actual.getSiguiente();
            posicion++;
        } while (actual != cabeza);

        return -1;
    }



    public void mostrar() {
        if (cabeza == null) {
            System.out.println("La lista circular está vacía.");
            return;
        }

        Nodo actual = cabeza;
        do {
            System.out.print(actual.getValor() + " ");
            actual = actual.getSiguiente();
        } while (actual != cabeza);

        System.out.println();
    }

    public int getTamaño() {
        return tamaño;
    }

    public boolean estaVacia() {
        return tamaño == 0;
    }
}

package compresorhuffman;
import java.util.PriorityQueue;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Clase para representar un nodo del árbol de Huffman
class NodoHuffman implements Comparable<NodoHuffman> {
    char caracter;
    int frecuencia;
    NodoHuffman izquierdo, derecho;

    // Método para comparar nodos basados en frecuencia
    public int compareTo(NodoHuffman nodo) {
        return this.frecuencia - nodo.frecuencia;
    }
}

public class CompresorHuffman {

    // Método para construir el árbol de Huffman a partir de una cadena de texto
    public static NodoHuffman construirArbolHuffman(String texto) {
        // Crear un mapa de frecuencias de caracteres
        HashMap<Character, Integer> frecuencias = new HashMap<>();
        for (char c : texto.toCharArray()) {
            frecuencias.put(c, frecuencias.getOrDefault(c, 0) + 1);
        }

        // Crear una cola de prioridad (minHeap) para los nodos del árbol
        PriorityQueue<NodoHuffman> minHeap = new PriorityQueue<>();
        for (char c : frecuencias.keySet()) {
            NodoHuffman nodo = new NodoHuffman();
            nodo.caracter = c;
            nodo.frecuencia = frecuencias.get(c);
            nodo.izquierdo = null;
            nodo.derecho = null;
            minHeap.add(nodo);
        }

        // Construir el árbol de Huffman
        while (minHeap.size() > 1) {
            NodoHuffman izquierdo = minHeap.poll();
            NodoHuffman derecho = minHeap.poll();
            NodoHuffman padre = new NodoHuffman();
            padre.caracter = '\0';  // Carácter especial para nodos internos
            padre.frecuencia = izquierdo.frecuencia + derecho.frecuencia;
            padre.izquierdo = izquierdo;
            padre.derecho = derecho;
            minHeap.add(padre);
        }

        // Devolver el nodo raíz del árbol de Huffman
        return minHeap.poll();
    }

    // Método para obtener los códigos de Huffman en orden de longitud
    public static ArrayList<String> obtenerCodigosOrdenados(NodoHuffman raiz) {
        ArrayList<String> codigos = new ArrayList<>();
        obtenerCodigos(raiz, "", codigos);
        Collections.sort(codigos, (a, b) -> a.length() - b.length());
        return codigos;
    }

    private static void obtenerCodigos(NodoHuffman raiz, String codigo, ArrayList<String> codigos) {
        if (raiz == null) {
            return;
        }
        if (raiz.caracter != '\0') {
            codigos.add(raiz.caracter + ": " + codigo);
        }
        obtenerCodigos(raiz.izquierdo, codigo + "0", codigos);
        obtenerCodigos(raiz.derecho, codigo + "1", codigos);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena de texto: ");
        String texto = scanner.nextLine();

        // Construir el árbol de Huffman
        NodoHuffman raiz = construirArbolHuffman(texto);

        // Obtener los códigos de Huffman en orden de longitud
        ArrayList<String> codigosOrdenados = obtenerCodigosOrdenados(raiz);

        // Imprimir los códigos de Huffman
        System.out.println("Códigos de Huffman (de más corto a más largo):");
        for (String codigo : codigosOrdenados) {
            System.out.println(codigo);
        }
    }
}


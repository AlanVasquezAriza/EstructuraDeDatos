
```java

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
```
Importamos las clases y paquetes necesarios, incluyendo PriorityQueue para la cola de prioridad, HashMap para mantener las frecuencias de caracteres, ArrayList para almacenar los códigos de Huffman y Scanner para leer la entrada del usuario.

Creamos una clase llamada NodoHuffman que representa un nodo en el árbol de Huffman. Esta clase implementa la interfaz Comparable para que los nodos se puedan comparar en función de sus frecuencias.

```java
public class CompresorHuffman {

    // Método para construir el árbol de Huffman a partir de una cadena de texto
    public static NodoHuffman construirArbolHuffman(String texto) {
        // Crear un mapa de frecuencias de caracteres
        HashMap<Character, Integer> frecuencias = new HashMap<>();
        for (char c : texto.toCharArray()) {
            frecuencias.put(c, frecuencias.getOrDefault(c, 0) + 1);
        }
```
Comienza la definición de la clase CompresorHuffman y del método construirArbolHuffman. El método recibe una cadena de texto como argumento.

Se crea un HashMap llamado frecuencias para almacenar las frecuencias de los caracteres en el texto. El bucle for recorre cada carácter en el texto y actualiza las frecuencias en el mapa.

```java
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
```
Se crea una cola de prioridad (PriorityQueue) llamada minHeap para almacenar los nodos del árbol de Huffman. Cada nodo representa un carácter.

Se recorren las claves (caracteres) del mapa frecuencias y se crean nodos NodoHuffman para cada carácter, con sus respectivas frecuencias. Luego, se agregan a la cola de prioridad minHeap.

```java
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
```
Se construye el árbol de Huffman mediante un bucle while. En cada iteración, se toman los dos nodos con las frecuencias más bajas (izquierdo y derecho) de la cola minHeap.

Se crea un nuevo nodo padre con un carácter especial ('\0') para representar un nodo interno. El nodo padre tiene una frecuencia igual a la suma de las frecuencias de sus hijos (izquierdo y derecho). Luego, se conecta el padre a los nodos izquierdo y derecho.

El nodo padre se agrega nuevamente a la cola de prioridad minHeap.

```java
        // Devolver el nodo raíz del árbol de Huffman
        return minHeap.poll();
    }
```
El método devuelve el nodo raíz del árbol de Huffman, que se encuentra en la parte superior de la cola de prioridad minHeap después de construir el árbol.
```java
    // Método para obtener los códigos de Huffman en orden de longitud
    public static ArrayList<String> obtenerCodigosOrdenados(NodoHuffman raiz) {
        ArrayList<String> codigos = new ArrayList<>();
        obtenerCodigos(raiz, "", codigos);
        Collections.sort(codigos, (a, b) -> a.length() - b.length());
        return codigos;
    }
```
Se define el método obtenerCodigosOrdenados que recibe la raíz del árbol de Huffman y devuelve una lista de códigos ordenados por longitud.

Se crea una lista codigos para almacenar los códigos de Huffman y se llama al método obtenerCodigos para llenar la lista.

Luego, se utiliza Collections.sort para ordenar los códigos por longitud, de más cortos a más largos, utilizando una expresión lambda.

```java
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
```
El método privado obtenerCodigos es una función recursiva que recorre el árbol de Huffman.

Si el nodo actual es nulo, no hace nada.

Si el nodo actual representa un carácter (es una hoja), agrega el carácter y su código a la lista codigos.

Luego, la función se llama recursivamente para el subárbol izquierdo y derecho, con el código actual actualizado concatenando "0" para el subárbol izquierdo y "1" para el subárbol derecho.

```java 
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
```
En el método main, se crea un objeto Scanner para leer la entrada del usuario.

Se solicita al usuario que ingrese una cadena de texto.

Luego, se construye el árbol de Huffman a partir de la cadena de texto ingresada.

Se obtienen los códigos de Huffman en orden de longitud y se imprimen de más cortos a más largos. Esto proporciona la salida deseada con los códigos de Huffman organizados de acuerdo a su longitud.





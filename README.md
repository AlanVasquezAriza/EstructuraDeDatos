# Estructura De Datos :shipit::trollface:


--- 


a). Elabore un programa, en el ambiente de desarrollo NetBeans, que permita leer
un arreglo de n números ingresados por teclado o generados aleatoriamente, ordenarlo
y mostrarlo, haciendo uso de los algoritmos de ordenamiento Burbuja, Inserción,
Selección, Shell y Quick Sort.(buscar los códigos en internet de cada ordenamiento)

b). Halle la duración en tiempo de ejecución de cada algoritmo haciendo uso de la utilidad
System.currentTimeMillis().
https://www.tutorialspoint.com/java/lang/system_currenttimemillis.htm

c). Haga una prueba ordenando 1000, 5000, 10000, 100000, 1000000 y 10000000
de datos enteros aleatorios. Elabore una tabla con los resultados de cada N cantidad
de datos frente a cada tipo de algoritmo de ordenamiento.

d). Explique gráficamente en qué consiste cada uno de los ordenamientos.

e). Explique gráficamente en qué consiste la complejidad algorítmica o carga
computacional.

---

### Preguntas Orientadoras

- ¿Cuales fueron los aprendizajes obtenidos al realizar esta guía?, liste como mínimo 3
aprendizajes y relaciónelos con su futuro que hacer profesional.
  + Aprendizaje en la implementación de varios algoritmos de ordenamiento en Java, incluyendo Burbuja, Inserción, Selección, Shell y Quick Sort.
  + Se adquirio conocimiento sobre cómo medir el tiempo de ejecución de un programa en Java utilizando System.currentTimeMillis().
  + Comprender la importancia de analizar la complejidad algorítmica y su relación con el rendimiento de los algoritmos de programación.

- ¿Donde presento mayor dificultad resolviendo la guía? y como lo resolvieron cuales fueron las
estrategias de solución?
  + Una de las dificultades principales que enfrentamos fue la comprensión completa del funcionamiento de algunos algoritmos de ordenamiento, como Quick Sort y Shell Sort. Para superar esto, recurrimos a ejemplos de código y documentación en línea para comprender mejor su lógica.
  + También nos enfrentamos a desafíos al asegurarnos de que la medición del tiempo de ejecución fuera precisa. Para abordar este problema, consultamos documentación y ejemplos específicos de Java sobre cómo utilizar System.currentTimeMillis() correctamente.
  + La organización y presentación efectiva de los resultados en una tabla también fue un desafío. Para solucionar esto, revisamos ejemplos de informes de laboratorio y nos aseguramos de que los datos estuvieran claramente organizados.


--- 

### Presaberes Requeridos

- ¿Cómo adiciona datos en un arreglo de nombres, de tamaño 10 desde su creación?

  Escriba el algoritmo en Java
```
public class EjemploArregloNombres {
    public static void main(String[] args) {
        // Crear un arreglo de nombres de tamaño 10
        String[] nombres = new String[10];

        // Añadir nombres a los elementos del arreglo
        nombres[0] = "Ana";
        nombres[1] = "Juan";
        nombres[2] = "María";
        nombres[3] = "Pedro";
        nombres[4] = "Laura";
        nombres[5] = "Carlos";
        nombres[6] = "Sofía";
        nombres[7] = "Luis";
        nombres[8] = "Elena";
        nombres[9] = "Miguel";

        // Imprimir los nombres del arreglo
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre " + (i + 1) + ": " + nombres[i]);
        }
    }
}

```
Lo que imprime:
```
Nombre 1: Ana
Nombre 2: Juan
Nombre 3: María
Nombre 4: Pedro
Nombre 5: Laura
Nombre 6: Carlos
Nombre 7: Sofía
Nombre 8: Luis
Nombre 9: Elena
Nombre 10: Miguel

```
- ¿Cómo compararía dos datos tipo String en Java? 
Describa el procedimiento.
  1. El método `equals()` compara el contenido de dos cadenas para verificar si son idénticas en términos de caracteres.
  1. Devuelve un valor booleano (true o false) como resultado de la comparación.
  1. El procedimiento es el siguiente:
  1. Invoca el método `equals()` en una de las cadenas y pasa la otra cadena como argumento.
  1. El método compara los caracteres en ambas cadenas uno por uno, verificando si son iguales.
  1. Si todos los caracteres coinciden, devuelve `true`; de lo contrario, devuelve `false`.
```
String cadena1 = "Hola";
String cadena2 = "Hola";
boolean sonIguales = cadena1.equals(cadena2);
System.out.println("¿Las cadenas son iguales? " + sonIguales);
```
- Se tiene dos variables que almacenan valores diferentes. Diseñe un algoritmo que le
  permita intercambiar los valores entre ellas.
  
  Ejemplo:
    var1 = 2;
    var2 = 600;
  después del procedimiento de intercambio las variables lucirían así:
    var1 = 600;
    var2 = 2;

```
  public class IntercambioVariables {
    public static void main(String[] args) {
        int var1 = 2;
        int var2 = 600;

        // Imprimir valores antes del intercambio
        System.out.println("Antes del intercambio:");
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);

        // Intercambiar valores utilizando una variable temporal
        int temp = var1;
        var1 = var2;
        var2 = temp;

        // Imprimir valores después del intercambio
        System.out.println("Después del intercambio:");
        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
    }
}
```
Despues del procedimiento, retorna:
```
Antes del intercambio:
var1 = 2
var2 = 600
Después del intercambio:
var1 = 600
var2 = 2
```
--- 

### Adicional responda las siguientes preguntas Orientadoras
1. Suponga que usted tiene que ordenar la siguiente lista de números: [15, 5, 4, 18, 12, 19, 14, 10,
  8, 20]

  ¿Cuál de las siguientes listas representa la lista parcialmente ordenada después de tres
  pasadas completas del ordenamiento por inserción?:
    
    a. [4, 5, 12, 15, 14, 10, 8, 18, 19, 20]
    
    b. [15, 5, 4, 10, 12, 8, 14, 18, 19, 20]
    
    _**c. "["4, 5, 15, 18, 12, 19, 14, 10, 8, 20"]"**_
    
    d. [15, 5, 4, 18, 12, 19, 14, 8, 10, 20]
2. Suponga que usted tiene que ordenar la siguiente lista de números: [11, 7, 12, 14, 19, 1, 6, 18, 8,
20]

¿Cuál de las siguientes listas representa la lista parcialmente ordenada después de tres
pasadas completas del ordenamiento por selección?
  
    a. [7, 11, 12, 1, 6, 14, 8, 18, 19, 20]
    
    b. [7, 11, 12, 14, 19, 1, 6, 18, 8, 20]
    
    c. [11, 7, 12, 14, 1, 6, 8, 18, 19, 20]
    
    d. [11, 7, 12, 14, 8, 1, 6, 18, 19, 20]
3. Cuál es la búsqueda más eficiente en grandes cantidades de datos ya ordenados?

  a. Binaria
  
  b. Burbuja
    
  c. Lineal
    
  d. Quicksort

--- 

### Actividad de Trabajo Autónomo
- Genere una lista de números aleatorios de 100 a 7000,
- Investigue como podría calcular el tiempo en milisegundos para ordenar la lista
generada utilizando los diferentes algoritmos que se estudian en esta guía.

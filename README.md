# Estructura De Datos


---


1. Elabore un programa con interfaz gráfica en el ambiente de desarrollo NetBeans, que
permita:

   a) Leer y visualizar números enteros. Arreglos Unidimensionales.

   b) Leer y visualizar cadenas de caracteres. Arreglos Bidimensionales.

   c) Mencione 9 situaciones en la que se utilizan los arreglos. (3 unidimensionales, 3 bidimensionales, 3 multidimensionales).

   - Arreglos unidimensionales
      - En un juego de video, un arreglo se puede usar para almacenar la lista de vidas de un jugador.
      - En una aplicación de hoja de cálculo, un arreglo se puede usar para almacenar una lista de números.
      - En un programa de análisis de datos, un arreglo se puede usar para almacenar una lista de valores.
   - Arreglos bidimensionales
      - En un programa de diseño gráfico, un arreglo se puede usar para almacenar una matriz de colores.
      - En un programa de edición de imágenes, un arreglo se puede usar para almacenar una matriz de píxeles.
      - En un programa de creación de música, un arreglo se puede usar para almacenar una matriz de notas musicales.
   - Arreglos multidimensionales
      - En un programa de simulación de vuelo, un arreglo se puede usar para almacenar un cubo de posiciones de aviones.
      - En un programa de modelado de clima, un arreglo se puede usar para almacenar un cubo de temperaturas.
      - En un programa de análisis de patrones, un arreglo se puede usar para almacenar un cubo de datos.

    d) Consulte qué es un ArrayList en java, para qué se utiliza y de un ejemplo.

      Un ArrayList es una estructura de datos que se utiliza para almacenar una colección de elementos de forma ordenada. Los elementos de un ArrayList pueden ser de cualquier tipo, incluyendo objetos, números, cadenas,       etc. Los ArrayLists son muy versátiles y se pueden utilizar para una gran variedad de tareas, incluyendo almacenar listas de nombres, números, fechas, etc. Para crear un ArrayList, se utiliza la clase ArrayList.         La clase ArrayList tiene una serie de métodos que se pueden utilizar para agregar, eliminar, buscar y modificar elementos en un ArrayList.
            
            import java.util.ArrayList;
            public class Main {
                public static void main(String[] args) {
                    // Create an ArrayList
                    ArrayList<String> names = new ArrayList<>();
                    // Add elements to the ArrayList
                    names.add("John");
                    names.add("Mary");
                    names.add("Peter");
                    // Print the elements of the ArrayList
                    for (String name : names) {
                        System.out.println(name);
                    }
                }
            }
   
      El código anterior imprimirá lo siguiente:
   
            John
            Mary
            Peter
         
   e) Realizar un cuadro comparativo entre el uso de arreglos y ArrayList
   

      ---
      - Tamaño:	El tamaño de un arreglo es fijo y debe especificarse al crearlo.	El tamaño de un ArrayList no es fijo y puede cambiarse agregando o eliminando elementos.
        
      ---
      - Elementos:	Los elementos de un arreglo deben ser del mismo tipo.	Los elementos de un ArrayList pueden ser de diferentes tipos.
        
      ---
      - Índices:	Los elementos de un arreglo se acceden a través de índices, que comienzan en 0.	Los elementos de un ArrayList se acceden a través de referencias, que son objetos que contienen la ubicación de un               elemento en el ArrayList.
        
      ---
      - Operaciones:	Las operaciones comunes en los arreglos incluyen agregar, eliminar, buscar y modificar elementos.	Las operaciones comunes en los ArrayLists incluyen agregar, eliminar, buscar, modificar y ordenar           elementos.
        
      ---
      - Rendimiento:	Los arreglos generalmente tienen un mejor rendimiento que los ArrayLists para operaciones que requieren acceder a elementos específicos por índice.	Los ArrayLists generalmente tienen un mejor              rendimiento que los arreglos para operaciones que requieren agregar o eliminar elementos al final del ArrayList.
        
      ---
      - Uso: Los arreglos se utilizan mejor cuando el tamaño del arreglo es conocido de antemano y los elementos se acceden a menudo por índice.	Los ArrayLists se utilizan mejor cuando el tamaño del arreglo no se              conoce de antemano o los elementos se acceden a menudo al final del ArrayList.

---


2. Elabore un programa con interfaz gráfica (Opcional para los que no vieron interfaz
gráfica en POO, Si vio interfaz gráfica lo debe hacer así) en el ambiente de desarrollo
NetBeans, para el siguiente caso utilizando ArrayList:

   a) Se tiene un programa donde se almacena una cantidad M de busetas y la
   cantidad de ventas realizada de cada buseta por cada día de la semana.
   Utilizando funciones almacenar las ventas de cada buseta en la matriz.
   Mostrar utilizando funciones la buseta que más gana en la semana y la que menos
   gana, De igual manera utilizar una función mostrar por cada buseta el día de la
   semana que más gana. Con un procedimiento aumentar las ventas de la matriz en un
   20% que estén por debajo del promedio de ventas diario.

   b) Una estación climática proporciona N pares de temperaturas diarias (máxima,
   mínima) junto al nombre del día respectivo (no es posible que alguna o ambas
   temperaturas sea menor a -40 grados y mayor a 40 grados). Se pide determinar:
   • Días y temperatura, cuyas temperaturas máximas estén entre 15 y 20 grados,
   • Días y temperatura, cuyas temperaturas mínimas estén por debajo de 0 grados
   • Calcular las medias máxima y mínima de temperaturas,
   • mostrar finalmente el listado de temperaturas con su día respectivo.
   5. Validar el desarrollo de cada uno de los puntos anteriores. Realizar las pruebas
   pertinentes para verificar que se cumple con los requerimientos.
   
      a) Especificar las causas de error que tuvo durante el desarrollo de la guía.
   
      b) Escribir las conclusiones de la práctica realizada.
   
      c) Incluir la bibliografía consultada. Normas APA.
   
      d) Incluir los anexos
      
      e) Validar que el informe de laboratorio esté completamente diligenciado.


---

   
3. Entregar informe de laboratorio para revisión

## Preguntas Orientadoras

¿Cuales fueron los aprendizajes obtenidos al realizar esta guía?, liste como mínimo 3
aprendizajes y relaciónelos con su futuro que hacer profesional.

¿Donde presento mayor dificultad resolviendo la guía? y como lo resolvieron cuales fueron las
estrategias de solución?

## Presaberes requeridos

Adicional responda las siguientes preguntas Orientadoras

---

1. Según el siguiente código al sumar todos los elementos de la columna 0 daría como resultado:

![image](https://github.com/AlanVasquezAriza/EstructuraDeDatos/assets/124604196/fe68f49e-a2fa-4bd7-8547-86cbfb444f7e)

   a. 7
   
   _**b. 5**_
   
   c. 6
   
---

2. En la variable “x” del siguiente código almacenará:

![image](https://github.com/AlanVasquezAriza/EstructuraDeDatos/assets/124604196/881006b1-2ad9-49f4-b6ce-72df36363716)
   
   a. La cantidad total de elementos de la matriz.

  _**b. La cantidad total de filas de la matriz**_

   c. La cantidad de caracteres de un elemento

   d. La cantidad números de la matriz
   
---

3. Al ejecutar el siguiente fragmento de código los ciclos anidados se ejecutan un total de:

![image](https://github.com/AlanVasquezAriza/EstructuraDeDatos/assets/124604196/ab444959-3d09-430a-9031-bdfbc90b3f0a)

a. 10

b. 11

_**c. 14**_

d. 0

---

## Trabajo autonomo

Realizar una infografía corta sobre la forma como se declara un vector y una matriz en
los leguajes:
- Java
- C#
- Python
- Visual Basic
- PHP

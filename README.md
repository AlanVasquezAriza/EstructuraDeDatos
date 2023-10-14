# Estructura De Datos :shipit:

## Sesion 1:

1. Responda las siguientes preguntas y de un ejemplo en cada caso:
   
    - ¿Qué diferencias encuentra entre un arreglo y una lista Enlazada?

      Hay varias diferencias clave entre los arreglos y las listas enlazadas en programación:
   
         - Acceso a los elementos: El acceso a un elemento en un arreglo se puede hacer directamente mediante su índice, mientras que en una lista enlazada se debe recorrer la lista desde el inicio para acceder a un elemento específico.
         - Tamaño: El tamaño de un arreglo es fijo cuando se crea, mientras que el tamaño de una lista enlazada es dinámico y puede crecer o decrecer conforme se agregan o eliminan nodos.
         - Memoria: Los arreglos se alojan de manera contigua en memoria, las listas enlazadas están dispersas en memoria y cada nodo apunta al siguiente.
         - Operaciones: Insertar y eliminar en un arreglo es costoso porque se debe mover todos los elementos, en una lista enlazada es más eficiente al modificar los punteros.
         - Implementación: Los arreglos se implementan usando tipos de datos primitivos como enteros, las listas usan nodos como estructuras que contienen datos y punteros.
         - Orden: Los arreglos permiten acceso aleatorio eficiente, las listas solo acceso secuencial.
            
    - ¿Cuáles son las diferencias entre las clases ArrayList, LinkedList y Vector utilizadas en Java? Realice un cuadro comparativo
  
   | Caracteristicas | ArrayList | LinkedList | Vector |
   | --- | --- | --- | --- |
   | Implementación | Usa un arreglo dinámico | Usa una lista doblemente enlazada | Usa un arreglo dinámico|
   | Tamaño variable |Sí | Sí | Sí |
   | Sincronización | No | No (aunque puede sincronizarse manualmente) | Sí (sincronizado por defecto) |
   | Eficiencia en inserción/eliminación | Más eficiente para inserción/eliminación en la parte final de la lista | Más eficiente para inserción/eliminación en cualquier posición de la lista | Más lento en inserción/eliminación en comparación con ArrayList |
   | Acceso a elementos | Rápido mediante índices | Rápido al inicio y al final, más lento en índices intermedios | Rápido mediante índices |
   | Capacidad inicial | Puede especificarse inicialmente | No se puede especificar inicialmente, crece automáticamente | Puede especificarse inicialmente |
   | Incremento de capacidad | Aumenta aproximadamente al 50% cuando es necesario | Aumenta aproximadamente al 100% cuando es necesario | Aumenta aproximadamente al 100% cuando es necesario |
   | Uso en aplicaciones concurrentes | No sincronizado, no es seguro para hilos | No sincronizado, no es seguro para hilos | Sincronizado y seguro para hilos |

   1.1 **Implementación**:
      - ArrayList: Utiliza un arreglo dinámico para almacenar los elementos. Esto significa que los elementos se almacenan en un bloque contiguo de memoria.
      - LinkedList: Utiliza una lista doblemente enlazada, lo que significa que cada elemento tiene referencias al elemento anterior y al siguiente en la lista. Esto permite una inserción y eliminación eficiente en cualquier posición de la lista.
      - Vector: También utiliza un arreglo dinámico, similar a ArrayList.
   
   1.2 **Tamaño variable**:
      - Todos los tres tipos (ArrayList, LinkedList y Vector) admiten colecciones de tamaño variable, lo que significa que puedes agregar y eliminar elementos según sea necesario.
   
   1.3 **Sincronización**:
      - ArrayList y LinkedList no son sincronizados, lo que significa que no están diseñados para ser utilizados en aplicaciones multihilo sin sincronización adicional. Puedes usar mecanismos de sincronización externos si necesitas acceso concurrente.
      - Vector es sincronizado por defecto, loota a través de sus métodos para garantizar que solo un hilo pueda acceder a la vez. Esto lo hace más seguro en aplicaciones concurrentes, pero también puede afectar el rendimiento en comparación con ArrayList o LinkedList si no necesitas la sincronización.
   
   1.4 **Eficiencia en inserción/eliminación**:
      - ArrayList es más eficiente para inserciones y eliminaciones en la parte final de la lista, ya que no requiere ajustar los elementos en la memoria.
      - LinkedList es más eficiente para inserciones y eliminaciones en cualquier posición de la lista, debido a su estructura de lista enlazada. Sin embargo, esto puede ser más lento que ArrayList para accesos aleatorios a elementos.
      - Vector es menos eficiente que ArrayList para inserciones y eliminaciones debido a la sincronización añadida.
   
   1.5 **Acceso a elementos**:
      - ArrayList y Vector proporcionan acceso rápido a los elementos a través de índices, ya que se almacenan en un arreglo dinámico.
      - LinkedList proporciona acceso rápido al inicio y al final de la lista (mediante referencias directas), pero es más lento para acceder a elementos en posiciones intermedias debido a que debe recorrer la lista desde el principio o el final.
   
   1.6 **Capacidad inicial**:
      - ArrayList y Vector permiten especificar una capacidad inicial para reservar un espacio en memoria al crear la colección. Esto puede ser útil si se conoce de antemano el tamaño aproximado de la colección.
      - LinkedList no permite especificar una capacidad inicial, ya que su estructura enlazada no requiere una reserva de memoria anticipada.
   
   1.7 **Incremento de capacidad**:
      - ArrayList y Vector aumentan su capacidad automáticamente cuando se alcanza el límite actual. ArrayList suele aumentar su capacidad en un 50%, mientras que Vector lo hace en un 100%.
      - LinkedList no tiene una capacidad fija, ya que no almacena elementos en un arreglo con una capacidad definida.
   
   1.8 **Uso en aplicaciones concurrentes**:
      - ArrayList y LinkedList no son seguros para aplicaciones concurrentes por defecto. Deben sincronizarse externamente si se utilizan en entornos multihilo.
      - Vector es seguro para hilos debido a su sincronización interna. Cada método público de Vector está sincronizado, lo que garantiza que solo un hilo pueda acceder a la vez. Esto hace que Vector sea más adecuado para aplicaciones multihilo, pero puede ser menos eficiente si la sincronización no es necesaria.
      
  
2. Adicione al programa una función que permita ordenar la lista circular previamente creada. La lista circular la debe construir como se indico en clase y debe tener todos los métodos que permitan insertar nodos, eliminar nodos, actualizar el valor de un nodo, buscar la posición de un valor en la lista y demás métodos (funciones del TAD Lista Circular).

3. Identifique 5 aplicaciones de las listas circulares en el ámbito de su carrera

   **3.1 Cola Circular (Circular Queue):**
   
   En la gestión de tareas o trabajos en un sistema, una cola circular puede utilizarse para gestionar la asignación de recursos de manera eficiente. Cuando la cola está llena, los nuevos elementos se insertan al principio de la cola, lo que permite una gestión eficiente de recursos en sistemas con capacidad limitada.
   
   **3.2 Juego de Cartas o Juegos en Bucle:**
   
   En aplicaciones de juegos de cartas o cualquier tipo de juego en el que los elementos se repitan una y otra vez, las listas circulares son útiles para gestionar las cartas o los elementos del juego. Cuando un jugador toma una carta o se realiza una acción, se pasa al siguiente elemento en la lista circular.
   
   **3.3 Reproducción de Medios Continua:**
   
   En reproductores multimedia, como listas de reproducción de música, las listas circulares pueden utilizarse para crear listas de reproducción que continúen reproduciéndose en un ciclo infinito. Cuando se llega al final de la lista, el siguiente elemento es el primero, creando una reproducción continua y cíclica.
   
   **3.4 Planificación de Tareas Programadas:**
   
   En sistemas de planificación y programación de tareas, las listas circulares pueden ayudar a organizar las tareas que deben realizarse de manera recurrente. Una vez que una tarea se completa, se puede mover al final de la lista para programarla nuevamente en el futuro.
   
   **3.5 Recorrido Circular en Estructuras de Datos:**
   
   Algunos algoritmos y estructuras de datos utilizan recorridos circulares para explorar elementos en un ciclo continuo, como el algoritmo del "algoritmo de Josephus" o para resolver ciertos problemas de estructuras de datos como la detección de un ciclo en una lista enlazada.

4. Explique claramente en qué consiste una pila y como es su funcionamiento.

   Una pila es una estructura de datos que sigue el principio de "último en entrar, primero en salir" (LIFO, por sus siglas en inglés), lo que significa que el último elemento que se inserta en la pila es el primero en ser retirado. Las pilas son utilizadas comúnmente en programación y en la informática en general para gestionar datos de una manera específica.
      
      El funcionamiento de una pila se puede explicar de la siguiente manera:
      
      4.1 **Inserción (Push)**: Cuando se agrega un elemento a la pila, se realiza una operación conocida como "push". El nuevo elemento se coloca en la parte superior de la pila, ocupando la posición más alta. En otras palabras, el último elemento en ser agregado es el que se encuentra en la parte superior de la pila.
      
      4.2 **Eliminación (Pop)**: Cuando se desea eliminar un elemento de la pila, se realiza una operación conocida como "pop". El elemento en la parte superior de la pila es retirado y eliminado de la pila. Esto significa que siempre se elimina el elemento más reciente que se agregó, y la pila se reduce en tamaño en una unidad.
      
      4.3 **Acceso (Peek)**: A veces, es útil poder observar el elemento en la parte superior de la pila sin eliminarlo. Esto se hace mediante la operación "peek" o "top", que permite ver el elemento en la cima de la pila sin quitarlo.

5. Describa 3 aplicaciones de las pilas en su vida como ingeniero

      5.1 **Gestión de Llamadas de Funciones (Call Stack)**:
         Las pilas se utilizan para gestionar las llamadas de funciones en un programa. Cada vez que se llama a una función, se coloca en la parte superior de la pila de llamadas. Cuando la función termina de ejecutarse, se elimina de la pila. Esto permite un seguimiento eficiente de la ejecución de funciones y garantiza que se vuelva a la función anterior después de que se complete la actual. En la depuración de programas, el seguimiento de la pila es esencial para identificar y solucionar problemas.
      
      5.2 **Historial de Navegación en un Navegador Web**:
         Los navegadores web utilizan una pila para llevar un historial de navegación. Cuando visitas una página web, se agrega a la pila. Si haces clic en un enlace para ir a otra página, se agrega a la pila. Puedes retroceder a páginas anteriores utilizando la operación "pop" de la pila. Esto facilita la navegación hacia atrás y permite un flujo de navegación eficiente en la web.
      
      5.3 **Validación de Paréntesis en Compiladores e Intérpretes**:
         En la construcción de compiladores e intérpretes, las pilas se utilizan para validar la correspondencia y el equilibrio de paréntesis, corchetes y llaves en el código fuente. Cuando se encuentra un paréntesis de apertura, se agrega a la pila, y cuando se encuentra un paréntesis de cierre, se verifica si coincide con el último paréntesis abierto en la pila. Esto asegura que la estructura del código fuente sea correcta y ayuda a evitar errores sintácticos.


## Sesion 2:

6. Elabore un programa en Java con interfaz gráfica(opcional) para implementar el juego de las Torres de Hanoi.

   
![image](https://github.com/AlanVasquezAriza/EstructuraDeDatos/assets/124604196/dca7bb44-60da-492a-ad64-812300a3c614)


7. Elabore un programa en Java con interfaz gráfica para evaluar una expresión matemática infija y transformarla a notación postfija mejor conocida como notación polaca, verificar si la expresión está balanceada en paréntesis o corchetes y Resolver laexpresión matemática (Se recomienda leer el capítulo 9.5 EVALUACIÓN DE EXPRESIONES ARITMÉTICAS CON PILAS, paginas 284-290 del libro ESTRUCTURAS DE DATOS EN JAVA de Luis Joyanes Aguilar).

8. Construya el TAD cola en Java y elabore todas las funciones (métodos) para probar su funcionamiento.

9. Describa 3 aplicaciones de las colas en su vida como ingeniero

      9.1 **Colas de Tareas (Task Queues)**:
         En muchas aplicaciones y sistemas, se utilizan colas para gestionar tareas asíncronas o en segundo plano. Por ejemplo, en un servidor web, las solicitudes de los usuarios pueden agregarse a una cola en lugar de procesarse de inmediato. Luego, un conjunto de trabajadores (workers) toma tareas de la cola y las procesa en el orden en que se recibieron. Esto es útil para evitar la congestión del servidor y garantizar que todas las solicitudes se atiendan de manera eficiente.
      
      9.2 **Colas en Sistemas de Mensajería**:
         Las colas se utilizan en sistemas de mensajería y comunicación para garantizar la entrega de mensajes en el orden correcto. Por ejemplo, en aplicaciones de mensajería instantánea o sistemas de correo electrónico, los mensajes se almacenan en una cola antes de ser entregados al destinatario. Esto asegura que los mensajes se entreguen en el orden en que se enviaron y que ningún mensaje se pierda.
      
      9.3 **Gestión de Impresiones (Print Queues)**:
         En sistemas de impresión, las colas se utilizan para gestionar trabajos de impresión. Cuando varios usuarios envían trabajos de impresión a una impresora compartida, los trabajos se agregan a una cola y se imprimen en el orden en que se recibieron. Esto evita conflictos y garantiza que los trabajos de impresión se procesen de manera justa y eficiente.


## Preguntas orientadoras

- ¿Cuales fueron los aprendizajes obtenidos al realizar esta guía?, liste como mínimo 3 aprendizajes y relaciónelos con su futuro que hacer profesional.
  
- ¿Donde presento mayor dificultad resolviendo la guía? y como lo resolvieron cuales fueron las estrategias de solución?

## Presaberes Requeridos

Revise el siguiente codigo y describa cada metodo del programa


![image](https://github.com/AlanVasquezAriza/EstructuraDeDatos/assets/124604196/df15cb1e-8115-4334-95c5-cfaa4d33ee8b)


1. Son secuencias de elementos almacenados en una lista encadenada
   
    a. Pila
  
    b. Cola
  
    **c. Lista**
  
    d. Variable

3. Comparadas con los vectores, estas permiten una mayor rapidez de inserción
y borrado, pero una menor velocidad de acceso aleatorio

    a. Pila
  
    b. Cola
  
    **c. Lista**
  
    d. Matriz

4. Es una estructura FIFO, first in, firstout.
   
    a. Pilas

    **b. Colas**
  
    c. Listas
  
    d. Árboles.


## Actividad de trabajo autonomo

Describir cómo se declara una pila en los siguientes lenguajes de programación: Pascal, Crystal, D, Delphi, Elisa, Forth, Julia, Lingo, Mercury, Prolog, Ruby, UnixPipes, R.

- Pascal

```  
program StackExample;
var
  Stack: array[1..100] of Integer;
  Top: Integer;
begin
  Top := 0; // Inicializa la pila vacía
  // Operaciones de push y pop en el arreglo Stack
end.
```

- Crystal

```
stack = [] of Int32
```


- D

```
import std.container;
Stack!int stack;
```


- Delphi

```
var
  Stack: TList<Integer>;
begin
  Stack := TList<Integer>.Create;
  // Operaciones de push y pop en Stack
end.
```

- Elisa

```
stack MyStack {
    push(x) { /* Código para agregar un elemento x a la pila */ }
    pop() { /* Código para eliminar y devolver el elemento superior de la pila */ }
}
```


- Forth

```
: push ( n -- ) stack 2! ;
: pop ( -- n ) stack @ ;
```


- Julia

```
stack = Int[]
push!(stack, 42)
pop!(stack)
```


- Lingo


```
pila = []
push pila, 42
pop pila
```


- Mercury


```
:- import_module queue.
:- type stack == queue.queue(int).
```


- Prolog


```
empty_stack([]).
push(Elem, Stack, [Elem|Stack]).
pop(Elem, [Elem|Rest], Rest).
```


- R


```
stack <- list()
stack <- c(stack, 42)  # Push
popped_element <- stack[length(stack)]  # Pop
stack <- stack[-length(stack)]  # Eliminar el último elemento
```

# **Sesion 1** :elephant:

### 1.  Elabore una lista de por lo menos 10 situaciones en las que se presente la estructura de árbol.

La estructura de árbol se encuentra en una variedad de situaciones en la vida cotidiana y en la informática. Aquí tienes una lista de 10 situaciones en las que se presenta la estructura de árbol:

1. **Sistema de archivos**: Los sistemas de archivos de las computadoras a menudo se organizan en una estructura jerárquica de árbol, con carpetas que contienen subcarpetas y archivos.

2. **Jerarquía organizacional**: Las organizaciones utilizan una estructura jerárquica en forma de árbol para representar la cadena de mando, con un CEO en la parte superior y departamentos y empleados subordinados.

3. **Árbol genealógico**: Un árbol genealógico representa las relaciones familiares en forma de un árbol, con individuos como nodos y relaciones familiares como ramas.

4. **Jerarquía de información**: En la organización y presentación de la información, a menudo se utiliza una estructura de árbol, como en un índice de un libro o un menú de navegación en un sitio web.

5. **Estructuras de datos en informática**: En programación, se utilizan árboles para implementar estructuras de datos como árboles binarios, árboles de búsqueda, árboles AVL y árboles de decisión.

6. **Redes de comunicación**: Las redes de comunicación, como las redes de internet, utilizan una topología de árbol enrutado, donde los nodos actúan como enrutadores que dirigen el tráfico.

7. **Jerarquía de carpetas en correo electrónico**: Los sistemas de correo electrónico organizan los mensajes en carpetas jerárquicas, que pueden considerarse una estructura de árbol.

8. **Árboles genealógicos en biología**: En biología, los árboles filogenéticos representan la evolución de las especies como una estructura de árbol.

9. **Estructura de productos y categorías en tiendas en línea**: Las tiendas en línea suelen organizar sus productos en categorías y subcategorías jerárquicas, formando una estructura de árbol.

10. **Árboles de juego en inteligencia artificial**: Los árboles de juego se utilizan en inteligencia artificial para modelar juegos estratégicos, como el ajedrez o el Go, representando todas las posibles jugadas y sus consecuencias como un árbol.

### 2. **Consulte acerca de los árboles B, B+ y AVL. Elabore un informe.**

**Árboles B, B+ y AVL:**

Los árboles B, B+ y AVL son estructuras de datos en informática utilizadas para organizar y gestionar datos de manera eficiente. Cada uno de estos árboles tiene características y aplicaciones específicas que los hacen adecuados para diferentes escenarios.

**Árbol B:**

1. **Definición**: El árbol B es una estructura de árbol equilibrada que se utiliza comúnmente en bases de datos y sistemas de almacenamiento. Está diseñado para mantener grandes cantidades de datos de manera eficiente y garantizar tiempos de búsqueda y inserción consistentes.

2. **Características clave**:
   - Cada nodo puede tener múltiples claves y punteros.
   - Los datos se almacenan en las hojas del árbol.
   - Los nodos internos actúan como índices para dirigir la búsqueda de datos.
   - Los árboles B son autoequilibrados, lo que garantiza un tiempo de búsqueda eficiente.

3. **Ventajas**:
   - Eficiente para operaciones de inserción y búsqueda.
   - Mantiene un equilibrio automático.
   - Ideal para bases de datos y sistemas de archivos.

4. **Desventajas**:
   - Requiere una mayor sobrecarga de almacenamiento debido a múltiples punteros.
   - La complejidad en la implementación.

**Árbol B+:**

1. **Definición**: El árbol B+ es una variante del árbol B que se utiliza comúnmente en sistemas de gestión de bases de datos. Está diseñado para mejorar la eficiencia de búsqueda en sistemas de almacenamiento.

2. **Características clave**:
   - Similar al árbol B, pero todos los datos se almacenan en las hojas.
   - Los nodos internos actúan como índices y contienen referencias a las hojas.
   - Mayor eficiencia en términos de búsqueda y rango que el árbol B estándar.

3. **Ventajas**:
   - Búsqueda y rango más eficientes que el árbol B.
   - Excelente rendimiento en aplicaciones de bases de datos.

4. **Desventajas**:
   - Mayor sobrecarga de almacenamiento debido a las hojas duplicadas.
   - Mayor complejidad en la implementación.

**Árbol AVL:**

1. **Definición**: El árbol AVL, también conocido como árbol de altura equilibrada, es una estructura de datos de árbol binario equilibrado. Se utiliza para garantizar que las operaciones de búsqueda y manipulación tengan un tiempo de ejecución logarítmico en el peor de los casos.

2. **Características clave**:
   - Garantiza que la diferencia de altura entre los subárboles izquierdo y derecho de cualquier nodo sea como máximo 1.
   - Esto asegura que el árbol esté equilibrado, lo que se traduce en un rendimiento constante en operaciones de búsqueda y manipulación.

3. **Ventajas**:
   - Tiempo de búsqueda y manipulación garantizado logarítmico.
   - Implementación relativamente sencilla.

4. **Desventajas**:
   - No es tan eficiente en términos de espacio como los árboles B y B+.
   - Las rotaciones pueden ser costosas en términos de rendimiento.


### 3. **Implemente un programa en el lenguaje de programación Java que permita en un árbol binario:**

   - Crear un Nodo.
   - Crear un árbol binario.
   - Insertar datos en el árbol (Los datos pueden ser Números o Letras) Dar la opción al usuario de ingresar un Árbol de solo números o de solo letras.    
   - Recorrer un árbol binario: in-orden, pre-orden y post-orden    
   - Calcular el grado del árbol  
   - Calcular el nivel, dado un nodo en especifico
   - Calcular la altura del árbol
   - Realizar el algoritmo de Búsqueda en Amplitud

# **Sesion 2** :guide_dog:

### 4. **Implemente un programa en el lenguaje de programación Java que permita en un árbol Binario de Busqueda (Arbol con los datos ordenados) Se recomienda leer el capitulo 13.6. ÁRBOL BINARIO DE BUSQUEDA, del libro Estructuras de datos en Java del autor Luis Joyanes Aguilar: El libro lo encuentra en el aula virtual Canvas y en la Biblioteca Virtual de la UMB:**
   
   - Crear un Nodo.

   - Crear un árbol binario.
    
   - Insertar datos en el árbol.
     
   - Buscar un nodo
     
   - Borrado de un nodo
     
   - Recorrer un árbol binario: in-orden, pre-orden y post-orden
  

# **Sesion 3** 	:motorcycle:

### **Investigue sobre:**

Árbol de códigos Huffman, su aplicación, en media página describa su funcionamiento, adjunte una porción de código explíquela.

**Árbol de Códigos Huffman: Aplicación y Funcionamiento**

El árbol de códigos Huffman es una técnica de compresión de datos ampliamente utilizada en aplicaciones de compresión de información, como la compresión de archivos y transmisión de datos en redes. Su principio básico es asignar códigos de longitud variable a los símbolos de entrada (por ejemplo, caracteres en un archivo de texto) de manera que los símbolos más comunes tengan códigos más cortos, lo que reduce el tamaño total del archivo comprimido.

**Funcionamiento del Árbol de Códigos Huffman:**

1. **Recopilación de Frecuencias**: El proceso comienza con la recopilación de las frecuencias de aparición de cada símbolo en los datos de entrada. Esto se hace mediante un análisis del archivo o secuencia de datos original.

2. **Creación de Nodos Hoja**: Cada símbolo se representa como un nodo hoja en un árbol. La frecuencia de aparición de cada símbolo se utiliza para etiquetar cada nodo hoja.

3. **Combinación de Nodos**: Se toman los dos nodos hoja con las frecuencias más bajas y se combinan en un nuevo nodo interno. La frecuencia del nuevo nodo interno es la suma de las frecuencias de los nodos hoja combinados. Este proceso se repite hasta que todos los nodos hoja estén unidos en un solo nodo raíz.

4. **Asignación de Códigos**: A medida que se construye el árbol, se asignan códigos binarios a lo largo de los bordes del árbol. Al seguir el camino desde la raíz hasta un nodo hoja, los ceros y unos representan el código correspondiente a ese símbolo.

5. **Compresión y Descompresión**: Con el árbol de códigos Huffman construido y los códigos asignados, los datos de entrada se comprimen sustituyendo cada símbolo por su código correspondiente. Durante la descompresión, el árbol se utiliza para reconstruir los datos originales.

**Aplicación del Árbol de Códigos Huffman:**

El árbol de códigos Huffman se utiliza en una amplia gama de aplicaciones, incluyendo:

1. **Compresión de Archivos**: Se utiliza en algoritmos de compresión de archivos, como el formato ZIP, para reducir el tamaño de los archivos. Esto ahorra espacio de almacenamiento y reduce el tiempo de transferencia en redes.

2. **Compresión de Imágenes y Videos**: En formatos como JPEG (imágenes) y H.264 (videos), los códigos Huffman se aplican para comprimir datos y reducir el tamaño de los archivos multimedia.

3. **Transmisión de Datos en Redes**: Los protocolos de compresión de datos en redes, como HTTP y HTTPS, utilizan la compresión Huffman para acelerar la transmisión de datos en línea.

4. **Compresión de Texto**: En la compresión de documentos de texto, los códigos Huffman se utilizan para reducir el tamaño de archivos de texto, como documentos PDF.

[Algoritmo De Huffman](CompresorHuffman/src/compresorhuffman/CompresorHuffman.java)

# **Preguntas Orientadoras**

### **¿Cuales fueron los aprendizajes obtenidos al realizar esta guía?, liste como mínimo 3 aprendizajes y relaciónelos con su futuro que hacer profesional.**

- Comprensión del tema: Al completar una guía sobre un tema específico, se puede obtener un entendimiento más profundo de ese tema. Esto podría ser valioso para futuros proyectos o trabajos relacionados con el tema, permitiendo un mayor conocimiento y competencia en el campo.

- Habilidades de resolución de problemas: Las guías a menudo implican la resolución de problemas y la aplicación de conceptos. Aprender a abordar problemas de manera estructurada y lógica es una habilidad valiosa en cualquier carrera profesional.

- Aplicación práctica: Realizar una guía puede proporcionar experiencia práctica en la aplicación de conocimientos teóricos. Esto es esencial en muchos campos profesionales, ya que la teoría debe traducirse en acciones y resultados concretos.

### ¿Donde presento mayor dificultad resolviendo la guía? y como lo resolvieron cuales fueron las estrategias de solución?

- Búsqueda de información adicional: Si se enfrenta a dificultades en la guía, buscar información adicional en fuentes confiables puede ayudar a aclarar conceptos o abordar problemas específicos.

- Descomposición de problemas: Dividir problemas complejos en pasos más pequeños y manejables puede facilitar la resolución de dificultades.

- Práctica y perseverancia: A veces, la práctica continua y la perseverancia son clave para superar desafíos y mejorar las habilidades en un tema en particular.

# **Presaberes Requeridos**

### 1. **Teniendo en cuenta la terminología que se utiliza en teoría de grafos. Identifique la definición correcta de un grafo:**
   
   - Un diagrama compuesto de nodos y conexiones
   
   - **Un conjunto de vértices y aristas, tal que cada arista está asociada a un par**
   
   - Múltiples nodos denominados vértices y caminos denominados arcos.
   
   - Un dibujo matemático que se emplea para modelar problemas de la vida real.

### 2. **A partir de los conocimientos adquiridos en la guía. Elija la opción que mejor defina a un árbol binario.**

   - **Un árbol binario es un árbol con raíz en el que cada vértice tiene ningún hijo, un hijo o dos hijos.**
     
   - Un conjunto finito de vértices todos conectados.
     
   - Dos subconjuntos de vértices que se interconectan a través de aristas externas e incidentes solo en estos conjuntos.
     
   - Un conjunto infinito de vértices todos conectados.

### 3. **En los recorridos que se hace a un árbol, este método se recorre cada uno de los subárboles luego se pasa por la raíz. Cual es?**

   - Pre-Orden
   
   - **Post-Orden**
   
   - In-Orden

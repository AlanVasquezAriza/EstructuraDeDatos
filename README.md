# **Sesion 1** :elephant:

## 1.  Describa por lo menos 5 aplicaciones (usos) prácticas de los grafos.

**Redes Sociales:**

   - Uso: Los grafos son fundamentales en la representación de relaciones sociales en plataformas como Facebook, Twitter y LinkedIn. Cada usuario es un nodo, y las conexiones de amistad o seguimiento entre ellos se representan mediante aristas. Los algoritmos de grafos se utilizan para analizar patrones de conexión, identificar comunidades y sugerir amistades o conexiones.

**Logística y Rutas:**

  - Uso: Los grafos se emplean para optimizar rutas y redes logísticas. Por ejemplo, en la planificación de la entrega de paquetes, los nodos pueden representar ubicaciones y las aristas los caminos entre ellas. Los algoritmos de grafos, como el algoritmo de Dijkstra, se utilizan para encontrar la ruta más corta entre dos puntos o para optimizar la distribución de recursos.

**Bases de Datos y Sistemas de Gestión de Información:**

  - Uso: Los grafos son utilizados en bases de datos NoSQL orientadas a grafos para modelar y representar relaciones complejas entre entidades. Esto es especialmente útil en situaciones donde las relaciones son tan importantes como los datos en sí. Ejemplos incluyen la representación de redes de conocimiento, sistemas de recomendación y análisis de dependencias.

**Circuitos Eléctricos y Electrónicos:**

   - Uso: En ingeniería eléctrica y electrónica, los grafos son utilizados para modelar circuitos. Los nodos representan componentes (como resistencias, capacitores y transistores) y las aristas representan las conexiones eléctricas entre ellos. Analizar el grafo permite entender el flujo de corriente y resolver problemas en circuitos complejos.

**Mapas y Sistemas de Navegación:**

   - Uso: Los grafos son esenciales en la representación de mapas digitales y en sistemas de navegación. Cada intersección o ubicación clave se representa como un nodo, y las carreteras o caminos entre ellos como aristas. Los algoritmos de grafos son utilizados para encontrar rutas eficientes para la navegación vehicular o peatonal, considerando factores como la distancia, el tiempo de viaje o restricciones específicas.

## 2. Elabore una tabla sobre los algoritmos más importantes aplicables a un grafo. Especifique en qué consiste cada uno y muestre un ejemplo de aplicación.
| Algoritmo         | Descripción                                       | Ejemplo de Aplicación                                       | Gráfico                                      |
|-------------------|---------------------------------------------------|--------------------------------------------------------------|----------------------------------------------|
| Dijkstra          | Encuentra el camino más corto desde un vértice origen a todos los demás vértices en un grafo ponderado con pesos no negativos. | Red de rutas de transporte para minimizar tiempo o costo.    | ![image](https://github.com/AlanVasquezAriza/EstructuraDeDatos/assets/124604196/b7c4061a-c2cc-44df-a925-4cfb855d3c28) |
| Bellman-Ford      | Similar a Dijkstra pero permite manejar grafos con aristas de peso negativo, siempre que no haya ciclos de peso negativo accesibles desde el vértice de origen. | Gestión de rutas con posibles costos negativos. | ![image](https://github.com/AlanVasquezAriza/EstructuraDeDatos/assets/124604196/23d990f1-f985-4b88-9c4a-4108d4f9ea24) |
| Floyd-Warshall    | Encuentra los caminos más cortos entre todos los pares de vértices en un grafo ponderado, ya sea dirigido o no dirigido. | Planificación de rutas en una red de comunicación. | ![image](https://github.com/AlanVasquezAriza/EstructuraDeDatos/assets/124604196/f83e6d98-3e39-4dcb-aac4-88b827e35cf4) |


### Adjunte el archivo de Excel.

## 3.Elabore un grafo (en lenguaje java) sobre el mapa de la ciudad de Bogotá D.C., con la ubicación de alguna de las siguientes entidades (será asignada por el docente) :

- ### Portales de Transmilenio
- ### Utilice Google Maps para calcular la distancia en kilómetros de cada arista siguiendo una ruta válida. Uno de los nodos debe corresponder a la Universidad Manuela Beltrán Sede Bogotá.

|    ↓Inicio↓       | UMB           | Portal Sur   | Portal de las Americas | Portal 80   | Portal Norte | Portal 20 de Julio | Portal el Tunal | Portal Suba | Portal Usme |
|-----------|--------------|--------------|-------------------------|------------|-------------|-------------------|----------------|------------|------------|
| UMB       | VACIO        | VACIO        | VACIO                   | VACIO      | VACIO       | VACIO             | VACIO          | VACIO      | VACIO      |
| Portal Sur| 19,8Km       | VACIO        | 5,6Km                   | 20,9Km     | 30,8Km      | 13,3Km            | 8,2Km          | 27,5Km    | 16,8Km    |
| Portal de las Americas | 17,3Km | 5,7Km        | VACIO           | 13,7Km     | 26,5Km      | 14,0Km            | 9,5Km          | 24,8Km    | 18,2Km    |
| Portal 80 | 13,5Km       | 20,3Km      | 15,9Km                  | VACIO      | 14,1Km      | 21,5Km            | 20,3Km         | 9,6Km     | 28,9Km    |
| Portal Norte | 17,6Km    | 32,3Km      | 17,9Km                  | 14,1Km     | VACIO       | 28,2Km            | 29,8Km         | 8,9Km     | 33,4Km    |
| Portal 20 de Julio | 13,8Km | 10,4Km | 14,1Km                  | 20,3Km     | 22,9Km      | VACIO             | 6,0Km          | 23,7Km    | 8,4Km     |
| Portal el Tunal | 17,3Km  | 5,4Km       | 8,9Km                   | 20,7Km     | 28,0Km      | 6,7Km             | VACIO          | 25,4Km    | 8,3Km     |
| Portal el Suba | 16,6Km   | 24,0Km      | 19,0Km                  | 7,2Km      | 8,2Km       | 24,7Km            | 24,0Km         | VACIO     | 32,1Km    |
| Portal Usme | 17,5Km    | 14,1Km      | 15,6Km                  | 25,6Km     | 29,0Km      | 6,8Km             | 8,1Km          | 30,3Km    | VACIO     |

# Sesion 2

## 4 Elabore la matriz correspondiente para representar los nodos y distancias del tema seleccionado y muéstrela por pantalla.

## 5 Represente el Grafo de manera gráfica, (Dibújelo en la pantalla)
## 6. Busque en la guía y en libro del curso e implemente en el lenguaje de programación Java, el código del algoritmo Dijkstra para hallar la ruta más corta. Plantee un ejemplo dentro de su código de mínimo 10 nodos y 30 aristas.
## 7. Busque en la guía y en el libro del e implemente en el lenguaje de programación Java, el código de los algoritmos de Prim, Floyd Warshall. La implementación debe ser sobre el mismo proyecto(Sesión 1) que ha venido trabajando con grafos.
## El ejercicio siguiente se desarrollará con el software GrafosSitio de descarga: inicio – Grafos -software para la construcción, edición y análisis de grafos. (upv.es) Entrenar su manejo

<p align="center">
  <img src="https://github.com/AlanVasquezAriza/EstructuraDeDatos/assets/84252258/114d6786-bff5-477b-8e2e-a0fd2388a353" width="800" alt="WhatsApp Image 2023-10-29 at 12:44:12 AM" style="display: block; margin: 0 auto;">
</p>

# Sesion 3

## Preguntas Orientadoras
- ### ¿Cuales fueron los aprendizajes obtenidos al realizar esta guía?, liste como mínimo 3 aprendizajes yrelaciónelos con su futuro que hacer profesional.

- ### ¿Donde presento mayor dificultad resolviendo la guía? y como lo resolvieron cuales fueron las estrategias de solución?

## Presaberes

1) Sea G un grafo y ((x,y)=(y,x)) se dice que es:

    - a) Conexo

    - b) Dirigido

    - c) No Dirigido

    - d) Dígrafo
      
2) Cuál es el algoritmo capaz de resolver el problema de camino mínimo.

    - a. Algoritmo de Prim
  
    - b. Algoritmo de VanVourer
  
    - c. Algoritmo de Dijkstra
  
    - d. Algoritmo de Busqueda

3) ¿Qué clase tiene los siguientes atributos?
```
int peso;
Arista *siguiente;
Vertice *adyacente;
```
  
  
  - a) Vértice

    - b) Arista

    - c) Grafo

    - d) Nodo

# Estructura De Datos :shipit:

**Sesion 1:**

- Elabore un programa en lenguaje de programación Java que permita realizar una
búsqueda binaria sobre un consunto de datos ordenados. Defina un valor y realice
pruebas de búsqueda para arreglos de tamaño 100, 1000, 5000, 10000 y 100000
(recuerde que los arreglos deben estar ordenados). Tome los tiempos en cada
caso y realice una gráfica.

- El gerente de las salas de cine Cinemax desea conocer algunas estadísticas
respecto de las películas más vistas. Las mismas 15 películas son exhibidas en
cada una de las 7 salas de cine. Para cada sala se requiere almacenar el total de
personas que han asistido a ver cada película. Se requiere saber cuál es la mejor
combinación sala-película, más vista. Cual fue la película más vista.

**Sesion 2:**

- La gerencia de la empresa ABC, preocupada por las bajas remuneraciones de
su personal, ha decidido entregar una bonificación ascendiente al 5% del sueldo
a los 30 empleados con más baja remuneración. El gerente desea tener una lista
con el RUT de los beneficiados y, además, desea saber a cuánto asciende el
costo total de las bonificaciones. La empresa almacenará los datos del personal
en dos arreglos paralelos: uno contendrá el RUT de los 100 empleados y otro
estará en correspondencia con éste conteniendo el sueldo de cada uno.
Los arreglos son:
int rut[n];
float sueldo[n];
Implemente funciones que permitan:
  - Encontrar el empleado con la mayor bonificación,
  - Encontrar el empleado con la menor bonificación,
  - Encontrar un empleado a partir de su RUT

 ## Preguntas orientadoras

- ¿Cuales fueron los aprendizajes obtenidos al realizar esta guía?, liste como mínimo 3
aprendizajes y relaciónelos con su futuro que hacer profesional.

  - Al estudiar los diferentes tipos de algoritmos de ordenamiento, como el ordenamiento de burbuja, el ordenamiento por selección, el ordenamiento por inserción, el ordenamiento rápido, etc., aprenderás sobre la importancia de la eficiencia en los algoritmos. Este conocimiento es valioso en el desarrollo de software y la optimización de código en tu futuro profesional. Saber cuándo y por qué elegir un algoritmo de ordenamiento específico puede mejorar el rendimiento de tus aplicaciones.
  - Resolver ejercicios y problemas relacionados con algoritmos de ordenamiento te ayudará a desarrollar habilidades de resolución de problemas, que son esenciales en la programación y la ingeniería de software. Estas habilidades te serán útiles para abordar desafíos en tu carrera profesional, desde depurar código hasta diseñar soluciones eficientes.
  - A medida que trabajas en la guía y comparas diferentes algoritmos de ordenamiento en términos de tiempo de ejecución y eficiencia, ganarás una comprensión más profunda de cómo la optimización puede afectar el rendimiento de una aplicación. Esto te será útil en tu futuro profesional para diseñar sistemas eficientes y tomar decisiones informadas sobre el uso de recursos.

- ¿Donde presento mayor dificultad resolviendo la guía? y como lo resolvieron cuales fueron las
estrategias de solución?

  - Consultar recursos adicionales, como libros de programación o tutoriales en línea, para obtener una comprensión más profunda de los algoritmos de ordenamiento.
  - Practicar la implementación de los algoritmos en problemas específicos para ganar experiencia.
  - Trabajar en equipo y discutir los conceptos con otros programadores para obtener diferentes perspectivas y enfoques.
  - Utilizar herramientas de depuración y análisis de rendimiento para evaluar el funcionamiento de los algoritmos y resolver problemas específicos.

## Presaberes requeridos

- ¿Cuál de los algoritmos de ordenamiento estudiados hasta ahora es el más rápido para
ordenar grandes volúmenes de información?

- Enumere 3 ventajas que proporcionan los algoritmos de ordenamiento.

- Suponga que usted está realizando una búsqueda secuencial en la lista ordenada [3, 5, 6, 8,
11, 12, 14, 15, 17, 18]. ¿Si trata de buscar el 13 cuántas comparaciones necesitaría?
  
  a. 8

  b. 7

  **c. 10**

  d. 1

- Suponga que usted tiene que ordenar la siguiente lista de números: [19, 1, 9, 7, 3, 10, 13,
15, 8, 12]. ¿Cuál de las siguientes listas representa la lista parcialmente ordenada tras tres
pasadas completas del ordenamiento burbuja?

  a. [1, 9, 19, 7, 3, 10, 13, 15, 8, 12]

  **b. [1, 3, 7, 9, 10, 8, 12, 13, 15, 19]**

  c. [1, 7, 3, 9, 10, 13, 8, 12, 15, 19]

  d. [1, 9, 19, 7, 3, 10, 13, 15, 8, 12].


- El algoritmo mostrado es:

  ![image](https://github.com/AlanVasquezAriza/EstructuraDeDatos/assets/124604196/860770fc-05e4-4e8f-9700-7a0887623b1b)

  **a. Quicksort**
  
  b. Mergesort
  
  c. Selección
  
  d. Inserción

## Actividad de trabajo autonomo:

- Describir en media página la forma como trabaja la computación cuántica.

La computación cuántica es un campo de la informática que utiliza los principios de la mecánica cuántica para procesar información de manera fundamentalmente diferente a la computación clásica. Mientras que las computadoras tradicionales utilizan bits, que son unidades de información que pueden ser 0 o 1, las computadoras cuánticas utilizan qubits, que pueden representar un 0, un 1 o una superposición de ambos estados al mismo tiempo gracias a la propiedad de la superposición cuántica. Aquí te explicaremos cómo trabaja la computación cuántica de manera simplificada:

Qubits: Los qubits son los bloques fundamentales de la computación cuántica. A diferencia de los bits clásicos, que solo pueden estar en un estado de 0 o 1 en un momento dado, los qubits pueden estar en una superposición de estados. Esto significa que pueden representar múltiples valores simultáneamente.

Entrelazamiento: Otra propiedad clave de la computación cuántica es el entrelazamiento. Dos qubits pueden estar entrelazados, lo que significa que el estado de uno de ellos está instantáneamente relacionado con el estado del otro, independientemente de la distancia que los separe. Esto permite una comunicación cuántica segura y eficiente.

Puertas cuánticas: Al igual que las computadoras clásicas utilizan puertas lógicas (AND, OR, NOT) para realizar operaciones, las computadoras cuánticas utilizan puertas cuánticas para manipular los qubits. Estas puertas cuánticas pueden realizar transformaciones complejas y simultáneas en los qubits, lo que permite realizar cálculos mucho más rápidos para ciertas tareas.

Algoritmos cuánticos: La verdadera ventaja de la computación cuántica radica en los algoritmos cuánticos. Algunos algoritmos cuánticos, como el algoritmo de Shor y el algoritmo de Grover, son significativamente más eficientes que sus contrapartes clásicas para resolver problemas específicos, como la factorización de números grandes o la búsqueda no estructurada en bases de datos.

Interferencia cuántica: Los qubits también pueden experimentar interferencia cuántica, que es un fenómeno en el que las amplitudes de probabilidad de los estados cuánticos se combinan de manera constructiva o destructiva. Esto permite que los algoritmos cuánticos generen resultados correctos y precisos mediante la manipulación de las probabilidades.

Decoherencia: Uno de los desafíos más grandes en la computación cuántica es la decoherencia. Los qubits son extremadamente sensibles a su entorno, lo que puede hacer que pierdan su estado cuántico. Para abordar este problema, se requiere una tecnología de control y corrección de errores cuánticos avanzada.

Aplicaciones: La computación cuántica tiene el potencial de revolucionar campos como la criptografía, la simulación de sistemas cuánticos y la optimización de problemas complejos, como la logística y la investigación de nuevos medicamentos.

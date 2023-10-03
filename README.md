# Estructura De Datos :shipit:

## Sesion 1:

Desarrollar los siguientes puntos:

- Crear una clase Estudiantes con los siguientes atributos: nombres, apellidos, dirección, teléfono, carrera.
- Crear una clase GestionEstudiantes donde incluya un HashMap un código para el estudiante y la clase Estudiantes.

Debe existir un menú de gestión donde cree el estudiante y lo asigne al HashMap y utilizar métodos para lo siguiente:

- Inserta información.
- Consultar información,
- Modificar información
- Borrar información.
- Notas: las operaciones se deben realizar en el HashMap.


## Sesion 2:

Crear un programa para manejar cantantes famosos y sus discos más conocidos.

- Crea una clase denominada ListaCantantesFamosos que disponga de un atributo ArrayList listacantantesFamosos que contenga objetos de tipo cantanteFamoso.
- La clase debe tener un método que permita añadir objetos de tipo cantanteFamoso a la lista. Un objeto de tipo cantanteFamoso tendrá como atributos nombre (String) y discoconmasVentas (String), y los métodos para obtener y establecer los atributos.
- Crea una clase test con el método main que inicialice un objeto listacantantesFamosos y añade manualmente dos objetos de tipo cantanteFamoso a la lista. Usando iterator muestra los nombres de cada cantante y su disco con más ventas por pantalla
- Se debe pedir al usuario un nombre y disco con más ventas de otro cantante famoso, y una vez introducidos los datos mostrar la lista actualizada usando iterator.
- Una vez mostrada la lista actualizada, se debe dar opción a elegir entre volver a introducir los datos de otro cantante o salir del programa (se podrán introducir tantos datos de cantantes como se desee. Para ello usa un bucle while que dé opción a elegir al usuario)

Ajustar el ejercicio para que muestre un menú en donde el usuario pueda:
- Eliminar cantantes
- Modificar Nombre del cantante
- Incluir en el menú la posibilidad de generar una lista con los cantantes con más discos vendidos de mayor a menor.


## Preguntas orientadoras 

- ¿Cuales fueron los aprendizajes obtenidos al realizar esta guía?, liste como mínimo 3 aprendizajes y relaciónelos con su futuro que hacer profesional.
  - __Manejo de Estructuras de Datos__: Aprendimos cómo trabajar con estructuras de datos como HashMap para almacenar y gestionar información de manera eficiente. Esto es útil en futuros proyectos donde necesite organizar y acceder a datos de manera rápida.
    
  - __Interacción con el Usuario__: Aprendimos a crear un menú de gestión que permite al usuario interactuar con el programa y realizar acciones específicas. Esto es esencial para desarrollar aplicaciones con una interfaz de usuario amigable.
    
  - __Uso de ArrayList__: Se pulio el uso de la clase ArrayList para almacenar y gestionar una lista dinámica de objetos. Esto es importante para trabajar con colecciones de datos en aplicaciones reales.
    
  - __Iteración y Manipulación de Datos__: Aprendimos a recorrer y manipular elementos en un ArrayList utilizando iteradores. Esto es útil para realizar operaciones en lotes en una colección de datos.
- ¿Donde presento mayor dificultad resolviendo la guía? y como lo resolvieron cuales fueron las estrategias de solución?
    - __Sintaxis de Java__: Tuvimos dificultades para entender la sintaxis de Java, especialmente al declarar clases y métodos. Esto resultó en errores de compilación frecuentes. Para superar esta dificultad, abordamos la revisión detallada de la documentación oficial de Java y la consulta de recursos en línea que explicaban la sintaxis. Además, utilizamos herramientas de desarrollo que resaltaban los errores de sintaxis, lo que nos ayudó a corregirlos de manera efectiva.
    
    - **Lógica de Programación**: Encontramos desafíos al desarrollar la lógica para las operaciones de gestión de estudiantes, como agregar, modificar o eliminar datos. Comprender cómo manejar bucles y condicionales fue complicado. Para superar esta dificultad, optamos por dividir el problema en pasos más pequeños. Utilizamos un enfoque de descomposición de problemas, escribiendo pseudocódigo antes de la codificación real. Esta estrategia nos ayudó a aclarar la lógica de programación.
    
    - **Conceptos de Programación Orientada a Objetos**: A veces, enfrentamos dificultades para comprender y aplicar conceptos de programación orientada a objetos, como la creación de clases y el uso de estructuras de datos. Para mejorar nuestra comprensión de la programación orientada a objetos, recurrimos a tutoriales en línea, ejemplos prácticos y la revisión de conceptos fundamentales. También participamos en discusiones en grupo para aclarar dudas y consolidar el conocimiento.

## Presaberes requeridos

- Es más que un conjunto de caracteres alfanumérico generado a partir de un texto plano. Suelen tener una longitud finita y se caracterizan por ser irreversibles y determinísticos:

  a. String

  _**b. Hash**_

  c. Binario

  d. Hexadecimal

- La función de hash más conocida es MD5 y siempre que se aplique sobre un texto se obtendrá el mismo hash, es decir no importando el tamaño del texto siempre generará una cadena de caracteres de:
  
  a. 16
  
  b. 8
  
  _**c. 32**_
  
  d. 64

- A que estructura lineal corresponde la imagen?

  ![image](https://github.com/AlanVasquezAriza/EstructuraDeDatos/assets/124604196/dd94efae-b7a0-4da8-b973-45b57ed2a5cf)

  _**a. Pila**_

  b. Cola

  c. Lista

  d. Árbol
  


## Actividad de trabajo autonomo

Crear un informe de media página que describa como el Bitcoin encripta sus transacciones

# Informe: Cifrado de transacciones de Bitcoin

Como criptomoneda líder en el mundo, Bitcoin revolucionará la forma en que pensamos y realizamos transacciones financieras. La seguridad en Bitcoin es uno de sus pilares fundamentales, y gran parte de esta seguridad proviene del cifrado y la protección de las transacciones. En este informe, aprenderemos cómo Bitcoin cifra sus transacciones y por qué es un modelo a seguir en términos de seguridad en el mundo de las criptomonedas.

![image](https://github.com/AlanVasquezAriza/EstructuraDeDatos/assets/84252258/f6b9c740-02fe-4cac-8bb3-6c9d85a4eebb)
## Criptografía asimétrica: la base de Bitcoin

El cifrado de transacciones en Bitcoin se basa en el principio de **criptografía asimétrica**, un enfoque que implica el uso de dos claves diferentes:

- **Clave pública:** Esta clave es conocida por todos los participantes de la red y se utiliza para cifrar la información enviada en una transacción.

- **Clave privada:** Esta clave está oculta al propietario y se utiliza para descifrar la información cifrada. Sólo el propietario de la clave privada puede acceder a ella.

La combinación de estas dos claves permite transacciones seguras en la red Bitcoin, ya que sólo el beneficiario legítimo puede acceder a los fondos.

## Firma digital: prenda de identidad

Bitcoin utiliza una firma digital para verificar la identidad de los participantes en la transacción. Cuando un usuario quiere enviar monedas, crea una firma digital utilizando su clave privada. Esta firma se adjunta a la transacción y se puede verificar utilizando la clave pública del remitente. Esto garantiza que la persona que realmente hace el negocio es quien dice ser, evita el robo de identidad y utiliza un garante.

## Hashing: protección de la integridad

Para garantizar la integridad de los datos, Bitcoin utiliza una función hash criptográfica. Cada bloque de la cadena de bloques de Bitcoin contiene un hash de los datos del bloque anterior. Cualquier cambio en los datos del bloque anterior dará como resultado un hash completamente diferente, por lo que es muy difícil cambiar los datos sin detección. Esta marca es necesaria para evitar cambios maliciosos en las transacciones y garantizar la integridad de la cadena de bloques.

## Protocolo de comunicación segura

Bitcoin utiliza una conexión segura a través del protocolo **"HTTPS** para garantizar la privacidad de la información transmitida entre socios de transacciones. Además, la red Bitcoin utiliza una topología descentralizada, lo que dificulta que un atacante acceda a toda la información en la red. La combinación de **criptografía de extremo a extremo** y una red descentralizada garantiza la seguridad de la transacción y protege la privacidad del usuario.

## Se ha demostrado que el algoritmo funciona

La importancia de la seguridad en Bitcoin es el algoritmo de **prueba de trabajo (Proof of Work)**. Los mineros de Bitcoin luchan por resolver matemáticas complejas utilizando enormes cantidades de potencia informática. Cuando un minero resuelve un rompecabezas, agrega un nuevo bloque cerrado y es recompensado con monedas. Este proceso de "exageración" hace que la red sea segura y resistente a los ataques, ya que un atacante necesitaría una cantidad impar de potencia informática para interrumpir la red.

## Conclusión


<p align="center">
  <img src="https://revistas.uasb.edu.ec/index.php/foro/article/download/2800/2620/9713" alt="Texto alternativo">
</p>


El cifrado de transacciones de Bitcoin es un ejemplo fantástico de cómo la criptografía y la seguridad informática trabajan juntas para garantizar la privacidad, la integridad y la autenticidad en las transacciones financieras digitales. El uso de claves públicas y privadas, firmas digitales, hashes, protocolos de comunicación seguros y algoritmos de prueba de trabajo son pilares fundamentales del diseño de seguridad de Bitcoin.

Las criptomonedas evolucionan constantemente y mejoran sus propias características de seguridad para enfrentar nuevos desafíos. Estudiar y comprender el cifrado de Bitcoin es imprescindible para cualquier estudiante de ingeniería de programación que busque una comprensión más profunda de la tecnología y las criptomonedas. Bitcoin no sólo ha cambiado la forma en que pensamos sobre el dinero, sino también la forma en que entendemos la seguridad en el mundo digital.

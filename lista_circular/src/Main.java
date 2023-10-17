import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaCircular lista = new ListaCircular();

        int opcion;

        do {
            System.out.println("===== Menú de Lista Circular =====");
            System.out.println("1. Insertar elemento");
            System.out.println("2. Eliminar elemento");
            System.out.println("3. Actualizar elemento");
            System.out.println("4. Actualizar elemento por posicion");
            System.out.println("5. Buscar posición de un valor");
            System.out.println("6. Mostrar la lista");
            System.out.println("7. Salir");
            System.out.print("Elija una opción: ");

            try {
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el valor a insertar: ");
                        int valorInsertar = scanner.nextInt();
                        lista.insertar(valorInsertar);
                        break;

                    case 2:
                        System.out.print("Ingrese el valor a eliminar: ");
                        int valorEliminar = scanner.nextInt();
                        if (lista.eliminar(valorEliminar)) {
                            System.out.println("Valor eliminado exitosamente.");
                        } else {
                            System.out.println("El valor no se encontró en la lista.");
                        }
                        break;

                    case 3:
                        System.out.print("Ingrese el valor a actualizar: ");
                        int valorAntiguo = scanner.nextInt();
                        System.out.print("Ingrese el nuevo valor: ");
                        int valorNuevo = scanner.nextInt();
                        if (lista.actualizar(valorAntiguo, valorNuevo)) {
                            System.out.println("Valor actualizado exitosamente.");
                        } else {
                            System.out.println("El valor no se encontró en la lista.");
                        }
                        break;

                    case 4:
                        System.out.print("Ingrese la posición del elemento a actualizar: ");
                        int posicion = scanner.nextInt();
                        System.out.print("Ingrese el nuevo valor: ");
                        int valorNuevoPorPosicion = scanner.nextInt();
                        if (lista.actualizarPorPosicion(posicion, valorNuevoPorPosicion)) {
                            System.out.println("Valor actualizado exitosamente.");
                        } else {
                            System.out.println("La posición no es válida.");
                        }
                        break;

                    case 5:
                        System.out.print("Ingrese el valor a buscar: ");
                        int valorBuscar = scanner.nextInt();
                        posicion = lista.buscar(valorBuscar);
                        if (posicion != -1) {
                            System.out.println("El valor se encuentra en la posición " + posicion);
                        } else {
                            System.out.println("El valor no se encontró en la lista.");
                        }
                        break;

                    case 6:
                        System.out.print("Elementos de la lista: ");
                        lista.mostrar();
                        break;

                    case 7:
                        System.out.println("Saliendo del programa.");
                        break;

                    default:
                        System.out.println("Opción no válida. Por favor, elija una opción válida.");
                }
            } catch (Exception e) {
                System.out.println("Error: Entrada no válida. Por favor, ingrese un valor numérico.");
                scanner.nextLine(); // Limpiar la entrada incorrecta
                opcion = 0; // Restablecer la opción a un valor válido
            }
        } while (opcion != 7);

        scanner.close();
    }
}

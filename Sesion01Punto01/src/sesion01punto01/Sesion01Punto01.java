package sesion01punto01;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Sesion01Punto01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = -1;
        long[] searchTimes = new long[5];
        int[] listSizes = new int[5];
        int[] foundIndices = new int[5];
        int[] searchValues = new int[5];

        long minSearchTime = Long.MAX_VALUE;
        long maxSearchTime = Long.MIN_VALUE;
        int fastestSearchIndex = -1;
        int slowestSearchIndex = -1;

        boolean[] optionSelected = new boolean[5]; // Para controlar que cada opcion solo se pueda seleccionar una vez
        boolean reset = false;

        do {
            if (reset) {
                reset = false;
                Arrays.fill(optionSelected, false);
                size = -1;
                Arrays.fill(searchTimes, 0);
                Arrays.fill(listSizes, 0);
                Arrays.fill(foundIndices, 0);
                Arrays.fill(searchValues, 0);
                minSearchTime = Long.MAX_VALUE;
                maxSearchTime = Long.MIN_VALUE;
                fastestSearchIndex = -1;
                slowestSearchIndex = -1;
            } else {
                System.out.println("Tamano de la lista (100, 1000, 5000, 10000, 100000): ");
                if (!optionSelected[0]) System.out.println("1. 100");
                if (!optionSelected[1]) System.out.println("2. 1000");
                if (!optionSelected[2]) System.out.println("3. 5000");
                if (!optionSelected[3]) System.out.println("4. 10000");
                if (!optionSelected[4]) System.out.println("5. 100000");
                System.out.println("6. Mostrar tabla");
                System.out.println("7. Reiniciar");
            }

            System.out.print("Seleccione una opcion: ");
            int choice = scanner.nextInt();

            if (reset) {
                if (choice != 7) {
                    System.out.println("Seleccione la opcion 7 para reiniciar.");
                    continue;
                } else {
                    reset = false; // Reinicio completado
                }
            }

            if (choice >= 1 && choice <= 5) {
                if (optionSelected[choice - 1]) {
                    System.out.println("Esta opcion ya ha sido seleccionada.");
                    continue;
                }
                optionSelected[choice - 1] = true;
                size = getSizeForOption(choice);
            }

            switch (choice) {
                case 6:
                    System.out.println("Mostrando tabla...");
                    printSearchResults(listSizes, searchValues, foundIndices, searchTimes, fastestSearchIndex, slowestSearchIndex);
                    continue; // Vuelve al inicio del bucle sin reiniciar
                case 7:
                    System.out.println("Reiniciando...");
                    try {
                        Thread.sleep(2000); // Pausa de 2 segundos
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    System.out.println("Tamano de la lista (100, 1000, 5000, 10000, 100000): ");
                    System.out.println("1. 100");
                    System.out.println("2. 1000");
                    System.out.println("3. 5000");
                    System.out.println("4. 10000");
                    System.out.println("5. 100000");
                    System.out.println("6. Mostrar tabla");
                    System.out.println("7. Reiniciar");
                    reset = true;
                    continue; // Vuelve al inicio del bucle
                default:
                    if (size != -1) {
                        int[] randomList = generateRandomList(size);

                        try {
                            Thread.sleep(1000); // Pausa de 1 segundos durante la ordenacion
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }

                        long startTime = System.nanoTime();
                        quickSort(randomList, 0, randomList.length - 1);
                        long endTime = System.nanoTime();
                        long sortingTime = endTime - startTime;

                        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("La lista ha sido ordenada");
                        System.out.println("Numeros que se encuentran en la lista para hacer prueba de busqueda Binaria:");
                        System.out.print("[");
                        int numbersToDisplay = Math.min(10, randomList.length);
                        for (int i = 0; i < numbersToDisplay; i++) {
                            System.out.print(" -- " + randomList[i] + "");
                        }
                        System.out.print(" -- ]");
                        System.out.println("");

                        System.out.println("Tiempo de ordenamiento (Quicksort): " + sortingTime + " nanosegundos");
                        System.out.println("-------------------------------------------------------------------------------------------------------------------------");

                        System.out.print("Valor a buscar en la lista ordenada (o -1 para salir): ");
                        int searchValue = scanner.nextInt();

                        if (searchValue == -1) {
                            System.out.println("Saliendo del programa.");
                            printSearchResults(listSizes, searchValues, foundIndices, searchTimes, fastestSearchIndex, slowestSearchIndex);
                            return; // Termina el programa
                        }

                        startTime = System.nanoTime();
                        int index = binarySearch(randomList, searchValue);
                        endTime = System.nanoTime();
                        long searchTime = endTime - startTime;
                        searchTimes[choice - 1] = searchTime;
                        listSizes[choice - 1] = size;
                        searchValues[choice - 1] = searchValue;
                        foundIndices[choice - 1] = index;

                        if (searchTime < minSearchTime) {
                            minSearchTime = searchTime;
                            fastestSearchIndex = choice - 1;
                        }
                        if (searchTime > maxSearchTime) {
                            maxSearchTime = searchTime;
                            slowestSearchIndex = choice - 1;
                        }

                        System.out.println("Indice del elemento encontrado: " + index);
                        System.out.println("Tiempo de busqueda binaria: " + searchTime + " nanosegundos");
                        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
                    } else {
                        System.out.println("Opcion no valida. Por favor, seleccione una opcion valida.");
                    }
                    continue; // Vuelve al inicio del bucle
            }
        } while (true);
    }

    public static int[] generateRandomList(int size) {
        int[] randomList = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            randomList[i] = random.nextInt(1000000); // Numeros aleatorios entre 0 y 999999.
        }

        return randomList;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Elemento no encontrado
    }

    public static void printSearchResults(int[] listSizes, int[] searchValues, int[] foundIndices, long[] searchTimes, int fastestSearchIndex, int slowestSearchIndex) {
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Resultados de las busquedas:");
        System.out.println("Tamano de la lista\t| Numero Buscado\t| Indice Encontrado\t| Tiempo de Busqueda (ns)");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < listSizes.length; i++) {
            if (listSizes[i] != 0) {
                System.out.printf("%-20d\t| %-16d\t| %-20d\t| %-20d%n", listSizes[i], searchValues[i], foundIndices[i], searchTimes[i]);
            }
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
        if (fastestSearchIndex != -1 && slowestSearchIndex != -1) {
            System.out.println("Busqueda mas Rapida:");
            System.out.println("Tamano: " + listSizes[fastestSearchIndex]);
            System.out.println("Numero Buscado: " + searchValues[fastestSearchIndex]);
            System.out.println("Indice Encontrado: " + (foundIndices[fastestSearchIndex] != -1 ? foundIndices[fastestSearchIndex] : "No encontrado"));
            System.out.println("Tiempo: " + searchTimes[fastestSearchIndex] + " nanosegundos");
            System.out.println("-------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Busqueda mas Lenta:");
            System.out.println("Tamano: " + listSizes[slowestSearchIndex]);
            System.out.println("Numero Buscado: " + searchValues[slowestSearchIndex]);
            System.out.println("Indice Encontrado: " + (foundIndices[slowestSearchIndex] != -1 ? foundIndices[slowestSearchIndex] : "No encontrado"));
            System.out.println("Tiempo: " + searchTimes[slowestSearchIndex] + " nanosegundos");
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------------");
    }

    public static int getSizeForOption(int option) {
        switch (option) {
            case 1:
                return 100;
            case 2:
                return 1000;
            case 3:
                return 5000;
            case 4:
                return 10000;
            case 5:
                return 100000;
            default:
                return -1;
        }
    }
}
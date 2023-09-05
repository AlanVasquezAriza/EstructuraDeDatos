
package act01;

import java.util.Arrays;
import java.util.Random;

public class Act01 {

    public static void main(String[] args) {
        int n = 1000; // Tamaño de la lista de números aleatorios
        int[] listaNumeros = generarListaAleatoria(n);

        // Imprimir el número aleatorio generado
        System.out.println("Número aleatorio generado: " + listaNumeros[0]);

        // Medir y ordenar usando el algoritmo de Burbuja
        long startTime = System.currentTimeMillis();
        burbuja(listaNumeros.clone());
        long endTime = System.currentTimeMillis();
        long tiempoBurbuja = endTime - startTime;
        System.out.println("Tiempo de ejecución para Burbuja: " + tiempoBurbuja + " ms");

        // Medir y ordenar usando el algoritmo de Inserción
        startTime = System.currentTimeMillis();
        insercion(listaNumeros.clone());
        endTime = System.currentTimeMillis();
        long tiempoInsercion = endTime - startTime;
        System.out.println("Tiempo de ejecución para Inserción: " + tiempoInsercion + " ms");

        // Medir y ordenar usando el algoritmo de Selección
        startTime = System.currentTimeMillis();
        seleccion(listaNumeros.clone());
        endTime = System.currentTimeMillis();
        long tiempoSeleccion = endTime - startTime;
        System.out.println("Tiempo de ejecución para Selección: " + tiempoSeleccion + " ms");

        // Medir y ordenar usando el algoritmo de Shell Sort
        startTime = System.currentTimeMillis();
        shellSort(listaNumeros.clone());
        endTime = System.currentTimeMillis();
        long tiempoShellSort = endTime - startTime;
        System.out.println("Tiempo de ejecución para Shell Sort: " + tiempoShellSort + " ms");

        // Medir y ordenar usando el algoritmo de Quick Sort
        startTime = System.currentTimeMillis();
        quickSort(listaNumeros.clone(), 0, listaNumeros.length - 1);
        endTime = System.currentTimeMillis();
        long tiempoQuickSort = endTime - startTime;
        System.out.println("Tiempo de ejecución para Quick Sort: " + tiempoQuickSort + " ms");
    }

    public static int[] generarListaAleatoria(int n) {
        int[] lista = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            lista[i] = random.nextInt(6901) + 100; // Números aleatorios de 100 a 7000
        }
        return lista;
    }

    public static void burbuja(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void insercion(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void seleccion(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void shellSort(int[] arr) {
        int n = arr.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j <= high - 1; j++) {
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


}

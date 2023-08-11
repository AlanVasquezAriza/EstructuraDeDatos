package guia.pkg01;
public class ImprimirArreglo {

    public static <T> void imprimirArreglo2(T[] arreglo) {
        for (T elemento : arreglo) {
            System.out.println(elemento);
        }
    }

    public static void main(String[] args) {
        Integer[] numeros = {1, 2, 3, 4, 5};
        String[] palabras = {"Hola", "Mundo", "Java"};

        System.out.println("Números:");
        imprimirArreglo2(numeros);

        System.out.println("Palabras:");
        imprimirArreglo2(palabras);
    }
}

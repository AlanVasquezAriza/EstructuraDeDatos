package guia.pkg01;
public class Arreglo10N {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5 ,6 ,7 ,8 ,9 ,10};
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i]+ ", ");
        }
    }
}

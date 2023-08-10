package guia.pkg01;
public class Guia01 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5 ,6 ,7 ,8 ,9 ,10};
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i]+ ", ");
        }
    }
    public abstract class ClaseAbstracta {
    private int atributo1;
    protected String atributo2;
    public double atributo3;

    public ClaseAbstracta(int valor1, String valor2, double valor3) {
        this.atributo1 = valor1;
        this.atributo2 = valor2;
        this.atributo3 = valor3;
    }

    public abstract void metodoAbstracto();
}

}

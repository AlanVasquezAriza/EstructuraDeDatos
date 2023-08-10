package guia.pkg01;
public class Subclase extends ClaseAbstracta {
    public Subclase(int valor1, String valor2, double valor3) {
        super(valor1, valor2, valor3);
    }

    @Override
    public void metodoAbstracto() {
        System.out.println("Implementacion del metodo abstracto en la subclase.");
    }

    public void mostrarAtributos() {
        System.out.println("Atributo1: " + atributo1);
        System.out.println("Atributo2: " + atributo2);
        System.out.println("Atributo3: " + atributo3);
    }

    public static void main(String[] args) {
        Subclase subclase = new Subclase(10, "Hola", 3.14);
        subclase.mostrarAtributos();
        subclase.metodoAbstracto();
    }
}

package guia.pkg01;

public abstract class ClaseAbstracta {
    public int atributo1;
    protected String atributo2;
    public double atributo3;

    public ClaseAbstracta(int valor1, String valor2, double valor3) {
        this.atributo1 = valor1;
        this.atributo2 = valor2;
        this.atributo3 = valor3;
    }

    public abstract void metodoAbstracto();
}

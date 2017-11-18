package Figuras;

public class Cuadrilatero implements Figureable {

    public double lado1;
    public double lado2;
    public double lado3;
    public double lado4;

    public Cuadrilatero() {
    }

    public Cuadrilatero(double lado1, double lado2, double lado3, double lado4) {
        this.lado1 = lado1;//inicializa lado1
        this.lado2 = lado2;//inicializa lado2
        this.lado3 = lado3;//inicializa lado3
        this.lado4 = lado4;//inicializa lado4
    }

    @Override
    public double getLado1() {
        return lado1;
    }

    @Override
    public double getLado2() {
        return lado2;
    }

    @Override
    public double getLado3() {
        return lado3;
    }

    @Override
    public double getLado4() {
        return lado4;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = (getLado1() + getLado2() + getLado3() + getLado4());
        return perimetro;
    }

    @Override
    public double calcularArea() {
        throw new UnsupportedOperationException("Varia de cuadrilatero en cuadrilatero");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Las coordenadas ingresadas forman un cuadrilatero "+getClass().getSimpleName().toLowerCase());//muestra el nombre de la clase
        System.out.println("Perimetro: " + calcularPerimetro());
        System.out.println("Area: " + calcularArea());

        System.out.println("Valores de lados: ");
        System.out.println("Lado 1: " + getLado1());
        System.out.println("Lado 2: " + getLado2());
        System.out.println("Lado 3: " + getLado3());
        System.out.println("Lado 4: " + getLado4());

    }

}

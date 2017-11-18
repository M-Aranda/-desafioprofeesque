package Figuras;

public class Triangulo implements Figureable {

    public double lado1;
    public double lado2;
    public double lado3;

    public Triangulo() {
    }

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;//inicializa lado1
        this.lado2 = lado2;//inicializa lado2
        this.lado3 = lado3;//inicializa lado3

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
        throw new UnsupportedOperationException("No hay un cuarto lado en los triangulos.");
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = (getLado1() + getLado2() + getLado3());
        return perimetro;
    }

    @Override
    public double calcularArea() {
        double semiperimetro = calcularPerimetro() / 2;
        double area = semiperimetro * (semiperimetro - getLado1()) * (semiperimetro - getLado2()) * (semiperimetro - getLado3());
        double resultado = (double) Math.sqrt(area);
        return resultado;

    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Las coordenadas ingresadas forman un triangulo "+getClass().getSimpleName().toLowerCase());//muestra el nombre de la clase se
        System.out.println("Perimetro: " + calcularPerimetro());
        System.out.println("Area: " + calcularArea());

        System.out.println("Valores de lados: ");
        System.out.println("Lado 1: " + getLado1());
        System.out.println("Lado 2: " + getLado2());
        System.out.println("Lado 3: " + getLado3());

    }

}

package Triangulos;

import Figuras.Figureable;
import Figuras.Triangulo;

public class Isosceles extends Triangulo implements Figureable {

    public Isosceles() {
    }

    public Isosceles(double lado1, double lado2, double lado3) {
        super(lado1, lado2, lado3);
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = (getLado1() + getLado2() + getLado3());
        return perimetro;
    }

    @Override
    public double calcularArea() {
        double semiperimetro = calcularPerimetro() / 2;
        double area = (double) Math.sqrt(semiperimetro * (semiperimetro - getLado1()) * (semiperimetro - getLado2()) * (semiperimetro - getLado3()));
        return area;

    }

    public void mostrarInformacion() {
        System.out.println("Las coordenadas ingresadas forman un triangulo isosceles");
        System.out.println("Perimetro: " + calcularPerimetro());
        System.out.println("Area: " + calcularArea());

        System.out.println("Valores de lados: ");
        System.out.println("Lado 1: " + getLado1());
        System.out.println("Lado 2: " + getLado2());
        System.out.println("Lado 3: " + getLado3());

    }
}

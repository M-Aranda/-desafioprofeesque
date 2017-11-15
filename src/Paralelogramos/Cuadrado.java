package Paralelogramos;

import Figuras.Cuadrilatero;
import Figuras.Figureable;

public class Cuadrado extends Cuadrilatero implements Figureable {

    public Cuadrado() {
    }

    public Cuadrado(double lado1, double lado2, double lado3, double lado4) {
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = (lado1 + lado2 + lado3 + lado4);
        return perimetro;
    }

    @Override
    public double calcularArea() {
        double area = (lado1 * lado2);
        return area;
    }

}

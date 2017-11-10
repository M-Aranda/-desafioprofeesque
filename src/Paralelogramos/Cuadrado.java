package Paralelogramos;

import Figuras.Cuadrilatero;
import Figuras.Figureable;

public class Cuadrado extends Cuadrilatero implements Figureable {

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

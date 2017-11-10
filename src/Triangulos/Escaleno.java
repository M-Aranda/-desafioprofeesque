package Triangulos;

import Figura.Figureable;

public class Escaleno implements Figureable {

    private double lado1;
    private double lado2;
    private double lado3;

    @Override
    public double calcularPerimetro() {
        double perimetro = (lado1 + lado2 + lado3);
        return perimetro;
    }

    @Override
    public double calcularArea() {
        double semiperimetro = calcularPerimetro() / 2;
        double area = (double) Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
        return area;

    }
}



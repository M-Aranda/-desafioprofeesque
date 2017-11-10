
package Paralelogramos;

import Figura.Figureable;

public class Cuadrado implements Figureable {
    
    public double lado1;
    public double lado2;
    public double lado3;
    public double lado4;

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

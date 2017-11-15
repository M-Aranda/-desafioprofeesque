package Paralelogramos;

import Figuras.Cuadrilatero;
import Figuras.Figureable;

public class Rectangulo extends Cuadrilatero implements Figureable {

    public Rectangulo() {
    }
    
    
    public Rectangulo(double lado1, double lado2, double lado3, double lado4){}

    @Override
    public double calcularPerimetro() {
        double perimetro = (lado1 + lado2 + lado3 + lado4);
        return perimetro;

    }

    @Override
    public double calcularArea() {
        double area = (lado1 + lado2) * (lado3 + lado4);
        return area;

    }

}

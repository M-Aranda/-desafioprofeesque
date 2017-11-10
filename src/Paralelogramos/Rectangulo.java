
package Paralelogramos;
import Figura.Figureable;

public class Rectangulo implements Figureable{
    private double lado1;
    private double lado2;
    private double lado3;
    private double lado4;

    @Override
    public double calcularPerimetro() {
        double perimetro = (lado1 + lado2 + lado3 + lado4);
        return perimetro;
        
    }

    @Override
    public double calcularArea() {
        double area = (lado1 + lado2)* (lado3 + lado4);
        return area;
        
    }
    
    
}

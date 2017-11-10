
package Triangulos;

import Figuras.Figureable;
import Figuras.Triangulo;

public class Isosceles extends Triangulo implements Figureable{


    @Override
    public double calcularPerimetro() {
        double perimetro = (lado1 + lado2 + lado3)   ;
        return perimetro;    
    }

    @Override
    public double calcularArea() {
        double semiperimetro = calcularPerimetro() / 2;
        double area = (double) Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
        return area;

    }
}

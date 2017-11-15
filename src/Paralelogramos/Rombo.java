
package Paralelogramos;

import Figuras.Cuadrilatero;
import Figuras.Figureable;


public class Rombo extends Cuadrilatero implements Figureable{

    public Rombo() {
    }

    public Rombo(double lado1,double lado2, double lado3,double lado4){}

    @Override
    public double calcularPerimetro() {
        double perimetro= (lado1*4);
        return perimetro;
    }

    @Override
    public double calcularArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

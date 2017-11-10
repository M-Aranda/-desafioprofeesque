
package Paralelogramos;

import Figura.Figureable;


public class Rombo implements Figureable{
    
    public double lado1;
    public double lado2;
    public double lado3;
    public double lado4;

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

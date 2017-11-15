package No_Paralelogramos;

import Figuras.Cuadrilatero;
import Figuras.Figureable;

public class Trapecio extends Cuadrilatero implements Figureable {

    public Trapecio() {
    }

    public Trapecio(double lado1, double lado2, double lado3, double lado4) {
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = (lado1 + lado2 + lado3 + lado4);
        return perimetro;
    }

    @Override
    public double calcularArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

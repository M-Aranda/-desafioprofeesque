package Paralelogramos;

import Figuras.Cuadrilatero;


public class Rectangulo extends Cuadrilatero {

    public Rectangulo() {
    }

    public Rectangulo(double lado1, double lado2, double lado3, double lado4) {
        super(lado1, lado2, lado3, lado4);
    }



    @Override
    public double calcularArea() {
        double area = (getLado1() + getLado2()) * (getLado3() + getLado4());
        return area;

    }
    


}

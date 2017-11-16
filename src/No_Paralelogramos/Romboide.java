package No_Paralelogramos;

import Figuras.Figureable;
import Figuras.Cuadrilatero;

public class Romboide extends Cuadrilatero implements Figureable {

    public Romboide() {
    }

    public Romboide(double lado1, double lado2, double lado3, double lado4) {
        super(lado1, lado2, lado3, lado4);
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public double getLado4() {
        return lado4;
    }

    @Override
    public double calcularPerimetro() {

        double perimetro = (getLado1() + getLado2() + getLado3() + getLado4());
        return perimetro;
    }

    @Override
    public double calcularArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mostrarInformacion() {
        System.out.println("Las coordenadas ingresadas forman un cuadrilatero romboide");
        System.out.println("Perimetro: " + calcularPerimetro());
        System.out.println("Area: " + calcularArea());

        System.out.println("Valores de lados: ");
        System.out.println("Lado 1: " + getLado1());
        System.out.println("Lado 2: " + getLado2());
        System.out.println("Lado 3: " + getLado3());
        System.out.println("Lado 4 " + getLado4());

    }
}

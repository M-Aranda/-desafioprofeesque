package Paralelogramos;

import Figuras.Cuadrilatero;
import Figuras.Figureable;

public class Cuadrado extends Cuadrilatero implements Figureable {

    public Cuadrado() {
    }

    public Cuadrado(double lado1, double lado2, double lado3, double lado4) {
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
        double area = (getLado1() * getLado2());
        return area;
    }

    public void mostrarInformacion() {
        System.out.println("Las coordenadas ingresadas forman un cuadrilatero cuadrado");
        System.out.println("Perimetro: " + calcularPerimetro());
        System.out.println("Area: " + calcularArea());

        System.out.println("Valores de lados: ");
        System.out.println("Lado 1: " + getLado1());
        System.out.println("Lado 2: " + getLado2());
        System.out.println("Lado 3: " + getLado3());
        System.out.println("Lado 4: "+getLado4());

    }

}

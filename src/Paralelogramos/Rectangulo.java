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
    
    @Override
    public void mostrarInformacion() {
        System.out.println("Las coordenadas ingresadas forman un cuadrilatero rectangulo");
        System.out.println("Perimetro: " + calcularPerimetro());
        System.out.println("Area: " + calcularArea());

        System.out.println("Valores de lados: ");
        System.out.println("Lado 1: " + getLado1());
        System.out.println("Lado 2: " + getLado2());
        System.out.println("Lado 3: " + getLado3());
        System.out.println("Lado 4: " + getLado4());

    }

}

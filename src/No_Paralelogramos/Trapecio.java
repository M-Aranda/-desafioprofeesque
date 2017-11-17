package No_Paralelogramos;

import Figuras.Cuadrilatero;


public class Trapecio extends Cuadrilatero {

    public Trapecio() {
    }

    public Trapecio(double lado1, double lado2, double lado3, double lado4) {
        super(lado1, lado2, lado3, lado4);
    }



    @Override
    public double calcularArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void mostrarInformacion() {
        System.out.println("Las coordenadas ingresadas forman un cuadrilatero trapecio");
        System.out.println("Perimetro: " + calcularPerimetro());
        System.out.println("Area: " + calcularArea());

        System.out.println("Valores de lados: ");
        System.out.println("Lado 1: " + getLado1());
        System.out.println("Lado 2: " + getLado2());
        System.out.println("Lado 3: " + getLado3());
        System.out.println("Lado 4 " + getLado4());

    }
}

package No_Paralelogramos;


import Figuras.Cuadrilatero;
import java.util.Scanner;

public class Romboide extends Cuadrilatero {

    public Romboide() {
    }

    public Romboide(double lado1, double lado2, double lado3, double lado4) {
        super(lado1, lado2, lado3, lado4);
    }


    @Override
    public double calcularArea() {
        
        double base, altura, area;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese la base del romboide: ");
        base = Double.parseDouble(scan.nextLine());
        
        System.out.println("Ingrese la altura del romboide: ");
        altura = Double.parseDouble(scan.nextLine());
        
        area = (base * altura);
        return area;
    }
    
    @Override
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

package No_Paralelogramos;

import Figuras.Figureable;
import Figuras.Cuadrilatero;
import java.util.Scanner;

public class Romboide extends Cuadrilatero implements Figureable {

    public Romboide() {
    }

    public Romboide(double lado1, double lado2, double lado3, double lado4){}

    @Override
    public double calcularPerimetro() {

        double perimetro = (lado1 + lado2 + lado3 + lado4);
        return perimetro;
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

}

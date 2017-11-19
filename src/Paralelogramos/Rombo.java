package Paralelogramos;

import Figuras.Cuadrilatero;
import Formulas.Distancia;

public class Rombo extends Cuadrilatero {

    private int x0;
    private int x1;
    private int x2;
    private int x3;
    private int y0;
    private int y1;
    private int y2;
    private int y3;

    public Rombo() {
    }

    public Rombo(double lado1, double lado2, double lado3, double lado4) {
        super(lado1, lado2, lado3, lado4);
    }

    public Rombo(double lado1, double lado2, double lado3, double lado4, int x0, int x1, int x2, int x3, int y0, int y1, int y2, int y3) {
        super(lado1, lado2, lado3, lado4);
        this.x0 = x0;
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y0 = y0;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;

    }

    public int getX0() {
        return x0;
    }

    public int getX1() {
        return x1;
    }

    public int getX2() {
        return x2;
    }

    public int getX3() {
        return x3;
    }

    public int getY0() {
        return y0;
    }
    public int getY1(){
        return y1;
    }

    public int getY2() {
        return y2;
    }

    public int getY3() {
        return y3;
    }
    
    

    @Override
    public double calcularArea() {//area es diagonal 1 por diagonal 2 dividido 2
        Distancia ac= new Distancia(getX0(),getX2(),getY0(),getY2());
        double primera_diagonal=ac.calc_distancia();
        
        Distancia bd=new Distancia(getX1(),getX3(),getY1(),getY3());
        double segunda_diagonal=bd.calc_distancia();
        
        double area=(primera_diagonal*segunda_diagonal)/2;
        return area;
        
    }

}

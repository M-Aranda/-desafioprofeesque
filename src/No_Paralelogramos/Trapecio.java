package No_Paralelogramos;

import Figuras.Cuadrilatero;
import java.util.ArrayList;
import java.util.Collections;


public class Trapecio extends Cuadrilatero {

    public Trapecio() {
    }

    public Trapecio(double lado1, double lado2, double lado3, double lado4) {
        super(lado1, lado2, lado3, lado4);
    }



    @Override
    public double calcularArea() {
        ArrayList<Double>listaLados=new ArrayList<>();
        listaLados.add(getLado1());
        listaLados.add(getLado2());
        listaLados.add(getLado3());
        listaLados.add(getLado4());
        
        double baseLarTrapecio=Collections.max(listaLados);
        listaLados.remove(3);
        double baseCorTrapecio=Collections.max(listaLados);
        listaLados.remove(2);
        
        double bT=baseLarTrapecio-baseCorTrapecio;
        double perBT=bT+listaLados.get(0)+listaLados.get(1);
        double sPerBT=perBT/2;
        double res=sPerBT * (sPerBT - bT) * (sPerBT - listaLados.get(0)) * (sPerBT - listaLados.get(1));
        double areaT=(double) Math.sqrt(res);
        double h=(2*areaT)/bT;
        double area_trapecio=(h*(baseLarTrapecio+baseCorTrapecio)/2);
        return area_trapecio;
        
        
        
    }
    

}

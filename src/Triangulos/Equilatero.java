/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangulos;

import Figuras.Figureable;
import Figuras.Triangulo;

/**
 *
 * @author ngolott
 */
public class Equilatero extends Triangulo implements Figureable {

    public Equilatero() {
    }

public Equilatero(double lado1, double lado2, double lado3){}

    @Override
    public double calcularPerimetro() {
        double perimetro = (lado1 + lado2 + lado3);
        return perimetro;
    }

    @Override
    public double calcularArea() {
        double semiperimetro = calcularPerimetro() / 2;
        double area = semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3);
        double resultado = (double) Math.sqrt(area);
        return resultado;

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangulos;
import Figura.Figureable;
/**
 *
 * @author ngolott
 */
public class Equilatero implements Figureable{
private double lado1;
private double lado2;
private double lado3;

    @Override
    public double calcularPerimetro() {
    double perimetro = (lado1 + lado2 + lado3)   ;
    return perimetro;
    }

    @Override
    public double calcularArea() {
       double semiperimetro = calcularPerimetro() / 2;
       double area = semiperimetro*(semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3);
       double resultado = (double )Math.sqrt(area);
       return resultado;
    
}
}

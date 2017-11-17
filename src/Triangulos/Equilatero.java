/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangulos;

import Figuras.Triangulo;

/**
 *
 * @author ngolott
 */
public class Equilatero extends Triangulo {

    public Equilatero() {
    }

    public Equilatero(double lado1, double lado2, double lado3) {
        super(lado1, lado2, lado3);
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Las coordenadas ingresadas forman un triangulo equilatero");//muestra el nombre entero de la clase
        System.out.println("Perimetro: " + calcularPerimetro());
        System.out.println("Area: " + calcularArea());

        System.out.println("Valores de lados: ");
        System.out.println("Lado 1: " + getLado1());
        System.out.println("Lado 2: " + getLado2());
        System.out.println("Lado 3: " + getLado3());

    }

}

package Desafio_profeesque;

import Mensaje_inicial.Mensaje_de_inicio;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import Formulas.Distancia;
import Triangulos.Equilatero;

public class Desafio_profeesque {

    public static void main(String[] args) {

        Scanner respuesta = new Scanner(System.in);
        int op_salir = 0;
        int cantFiguras = 0;
        while (true) {
            if (op_salir == 2) {
                break;
            } else {

                int eleccion;
                while (true) {
                    try {
                        System.out.println("3 o 4 puntos?");
                        eleccion = Integer.parseInt(respuesta.nextLine());

                        if (eleccion == 3 || eleccion == 4) {
                            break;
                        }

                    } catch (Exception e) {
                        System.out.println("Debe responder 3 o 4");
                    }
                }
                Mensaje_de_inicio mensaje = new Mensaje_de_inicio();
                mensaje.mostrarMensajeDeInicio();

                Scanner input = new Scanner(System.in);

                List<Integer> valoresX = new ArrayList<>();//lista para valor x de coordenada
                List<Integer> valoresY = new ArrayList<>();//lista para valor y de coordenada

                int x;
                int y;

                int contador = 0;
                while (true) {
                    try {
                        System.out.print("Ingrese coordenada Nº" + (contador + 1) + ":");
                        String a = input.nextLine();
                        String[] valores = a.split(",");
                        String xs = valores[0];
                        String ys = valores[1];
                        x = Integer.parseInt(xs);
                        y = Integer.parseInt(ys);

                        valoresX.add(x);
                        valoresY.add(y);
                        contador++;

                    } catch (Exception e) {
                        System.out.println("Debe ingresar una coordenada valida");
                    }
                    if (eleccion == contador) {
                        break;
                    }
                }

                if (contador == 3) {
                    Distancia ab = new Distancia(valoresX.get(1), valoresX.get(0), valoresY.get(1), valoresY.get(0));
                    double lado1 = ab.calc_distancia();

                    Distancia bc = new Distancia(valoresX.get(2), valoresX.get(1), valoresY.get(2), valoresY.get(1));
                    double lado2 = bc.calc_distancia();

                    Distancia ac = new Distancia(valoresX.get(2), valoresX.get(0), valoresY.get(2), valoresY.get(0));
                    double lado3 = ac.calc_distancia();

                    if (lado1 == lado2 && lado2 == lado3 && lado3 == lado1) {
                        System.out.println("Las coordenadas ingresadas forman un triangulo equilatero.");
                        Equilatero te = new Equilatero(lado1, lado2, lado3);
                        System.out.println("Perimetro: " + te.calcularPerimetro() + "");
                        System.out.println("Area: " + te.calcularArea());

                    }

                    System.out.println("Las coordenadas ingresadas forman un triangulo.");
                    System.out.println("Perimetro: ");
                    System.out.println("Area: ");

                } else if (contador == 4) {

                    Distancia ab = new Distancia(valoresX.get(1), valoresX.get(0), valoresY.get(1), valoresY.get(0));
                    double lado1 = ab.calc_distancia();

                    Distancia bc = new Distancia(valoresX.get(2), valoresX.get(1), valoresY.get(2), valoresY.get(1));
                    double lado2 = bc.calc_distancia();

                    Distancia cd = new Distancia(valoresX.get(3), valoresX.get(2), valoresY.get(3), valoresY.get(2));
                    double lado3 = cd.calc_distancia();

                    Distancia ad = new Distancia(valoresX.get(3), valoresX.get(0), valoresY.get(3), valoresY.get(0));
                    double lado4 = ad.calc_distancia();

                    System.out.println(" Las coordenadas ingresadas forman un cuadrilatero.");
                    System.out.println("Perimetro: ");
                    System.out.println("Area: ");

                }

//                System.out.println(valoresX.get(0));//sout de prueba
//                //recordar que listadenombre.get(numero de indice); es para mostrar el valor de ese indice
//
//                for (int i = 0; i < valoresX.size(); i++) {//for de prueba
//
//                    System.out.println("Valor de X de coordenada Nº" + (i + 1) + ":" + valoresX.get(i));
//                }
//
//                for (int i = 0; i < valoresY.size(); i++) {//for de prueba
//                    System.out.println("Valor de Y de coordeada Nº" + (i + 1) + ":" + valoresY.get(i));
//                }
                cantFiguras++;
                System.out.println("para salir solo presione el numero 2");
                System.out.println("1.-  nueva figura");
                System.out.println("2.- salir");
                System.out.print("opción: ");
                op_salir = Integer.parseInt(respuesta.nextLine());
            }

        }
        System.out.println("Estadisticas:");
        System.out.println("-------------");
        System.out.println("Se crearon " + cantFiguras + " figuras");//se podria cambair mensaje dependiendo de si son una o varias
    }

}

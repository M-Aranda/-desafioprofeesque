package Desafio_profeesque;

import Mensaje_inicial.Mensaje_de_inicio;

import java.util.*;
import Formulas.*;
import Triangulos.*;
import No_Paralelogramos.*;
import Paralelogramos.*;

//import java.util.Scanner; 
//import java.util.ArrayList;
//import java.util.List;
//import Formulas.Distancia;
//import Triangulos.Equilatero;
//import Triangulos.Escaleno;
//import Triangulos.Isosceles;
//import No_Paralelogramos.Romboide;
//import No_Paralelogramos.Trapecio;
//import No_Paralelogramos.Trapezoide;
//import Paralelogramos.Cuadrado;
//import Paralelogramos.Rectangulo;
//import Paralelogramos.Rombo;

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
                        System.out.println("**************************");
                        System.out.println("     3 o 4 puntos?: ");
                        System.out.println("**************************");
                        eleccion = Integer.parseInt(respuesta.nextLine());

                        if (eleccion == 3 || eleccion == 4) {
                            break;
                        }

                    } catch (Exception e) {
                        System.out.println("Debe responder 3 o 4");
                    }
                }
                System.out.println("----------------------------------");
                Mensaje_de_inicio mensaje = new Mensaje_de_inicio();
                mensaje.mostrarMensajeDeInicio();
                System.out.println("----------------------------------");

                Scanner input = new Scanner(System.in);

                List<Integer> valoresX = new ArrayList<>();//lista para valor x de coordenada
                List<Integer> valoresY = new ArrayList<>();//lista para valor y de coordenada

                int x;
                int y;

                int contador = 0;
                while (true) {
                    try {
                        System.out.println("**************************");
                        System.out.println("Ingrese coordenada Nº" + (contador + 1) + ": ");
                        System.out.println("**************************");
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
                        Equilatero teq = new Equilatero(lado1, lado2, lado3);
                        teq.mostrarInformacion();

                    } else if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1) {
                        Escaleno tes = new Escaleno(lado1, lado2, lado3);
                        tes.mostrarInformacion();

                    } else if ((lado1 == lado2 && lado1 != lado3 && lado3 != lado2) || (lado2 == lado3 && lado1 != lado2 && lado1 != lado3) || (lado3 == lado1 && lado2 != lado3 && lado2 != lado1)) {
                        Isosceles tis = new Isosceles(lado1, lado2, lado3);
                        tis.mostrarInformacion();

                    }

                } else if (contador == 4) {

                    Distancia ab = new Distancia(valoresX.get(1), valoresX.get(0), valoresY.get(1), valoresY.get(0));
                    double lado1 = ab.calc_distancia();

                    Distancia bc = new Distancia(valoresX.get(2), valoresX.get(1), valoresY.get(2), valoresY.get(1));
                    double lado2 = bc.calc_distancia();

                    Distancia cd = new Distancia(valoresX.get(3), valoresX.get(2), valoresY.get(3), valoresY.get(2));
                    double lado3 = cd.calc_distancia();

                    Distancia ad = new Distancia(valoresX.get(3), valoresX.get(0), valoresY.get(3), valoresY.get(0));
                    double lado4 = ad.calc_distancia();



                    if (lado1 == lado2 && lado2 == lado3 && lado3 == lado4) {
                        Cuadrado cuad = new Cuadrado(lado1, lado2, lado3, lado4);
                        cuad.mostrarInformacion();

                    } else if (lado1 == lado3 && lado2 == lado4) {
                        Rectangulo rect = new Rectangulo(lado1, lado2, lado3, lado4);
                        rect.mostrarInformacion();

                    }//else if(aqui va la condicion del rombo//nota de marcelo: es que las diagonales){
//                System.out.println("Las coordenadas ingresadas forman un rectanglo");
//                        Rombo rombo = new Rombo(lado1, lado2, lado3, lado4);
//                        System.out.println("Perimetro: "+rombo.calcularPerimetro());
//                        System.out.println("Area: "+rombo.calcularArea());
                }

                int valorXdelVectordeTraslacion = 0;
                int valorYdelVectordeTraslacion = 0;

                while (true) {
                    try {
                        System.out.println("**************************");
                        System.out.println("Ingrese vector de traslacion:");
                        System.out.println("**************************");
                        String veT = input.nextLine();
                        String[] valorVeT = veT.split(",");
                        String vX = valorVeT[0];
                        String vY = valorVeT[1];
                        valorXdelVectordeTraslacion = Integer.parseInt(vX);
                        valorYdelVectordeTraslacion = Integer.parseInt(vY);

                        break;// vuelve a pedir vector de traslacion si hay error, si no lo hay se sale
                    } catch (Exception e) {
                        System.out.println("Debe ingresar un vector valido");
                    }

                }

                // el siguiente if y else if sirve para mostrar los resultados de la traslacion
                if (eleccion == 3) {
                    System.out.println("*********************************************************************");
                    System.out.println("La figura se ha trasladado exitosamente. Las nuevas coordenadas son: ");
                    System.out.println("*********************************************************************");
                    System.out.println("Punto 1: " + (valoresX.get(0) + valorXdelVectordeTraslacion) + "," + (valoresY.get(0) + valorYdelVectordeTraslacion));
                    System.out.println("Punto 2: " + (valoresX.get(1) + valorXdelVectordeTraslacion) + "," + (valoresY.get(1) + valorYdelVectordeTraslacion));
                    System.out.println("Punto 3: " + (valoresX.get(2) + valorXdelVectordeTraslacion) + "," + (valoresY.get(2) + valorYdelVectordeTraslacion));

                } else if (eleccion == 4) {
                    System.out.println("*********************************************************************");
                    System.out.println("La figura se ha trasladado exitosamente. Las nuevas coordenadas son: ");
                    System.out.println("*********************************************************************");
                    System.out.println("Punto 1: " + (valoresX.get(0) + valorXdelVectordeTraslacion) + "," + (valoresY.get(0) + valorYdelVectordeTraslacion));
                    System.out.println("Punto 2: " + (valoresX.get(1) + valorXdelVectordeTraslacion) + "," + (valoresY.get(1) + valorYdelVectordeTraslacion));
                    System.out.println("Punto 3: " + (valoresX.get(2) + valorXdelVectordeTraslacion) + "," + (valoresY.get(2) + valorYdelVectordeTraslacion));
                    System.out.println("Punto 4: " + (valoresX.get(3) + valorXdelVectordeTraslacion) + "," + (valoresY.get(3) + valorYdelVectordeTraslacion));

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

                while (true) {
                    try {
                        System.out.println("para salir solo presione el numero 2");
                        System.out.println("1.- Nueva figura");
                        System.out.println("2.- Salir");
                        System.out.print("Opción: ");
                        op_salir = Integer.parseInt(respuesta.nextLine());
                        if(op_salir==1 || op_salir==2){
                            break;
                        }

                    } catch (Exception e) {
                        System.out.println("Eso no es valido");
                    }
                }

            }

        }
        System.out.println("");//para dejar una linea vacia
        System.out.println("*******************");
        System.out.println("Estadisticas:");
        System.out.println("*******************");
        System.out.println("");//para dejar una linea vacia

        if (cantFiguras == 1) {
            System.out.println("Se creo " + cantFiguras + " figura");
        } else {
            System.out.println("Se crearon " + cantFiguras + " figuras");
        }

    }

}

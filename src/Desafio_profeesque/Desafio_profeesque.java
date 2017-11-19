package Desafio_profeesque;

import Mensaje_inicial.Mensaje_de_inicio;

import java.util.*;
import Formulas.*;
import Triangulos.*;
import No_Paralelogramos.*;
import Paralelogramos.*;

//imports utilizados:
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
                    }//java.lang.ArithmeticException
                    try {
                        if (eleccion == 3) {//control de flujo para determinar si los puntos del triangulo forman una recta
                            Pendiente p_1_2 = new Pendiente(valoresY.get(1), valoresY.get(0), valoresX.get(1), valoresX.get(0));
                            double pend_entre_p1_p2 = p_1_2.calcularPendiente();
                            Pendiente p_2_3 = new Pendiente(valoresY.get(2), valoresY.get(1), valoresX.get(2), valoresX.get(1));
                            double pend_entre_p2_p3 = p_2_3.calcularPendiente();

                            if (pend_entre_p1_p2 == pend_entre_p2_p3) {
                                System.out.println("Las coordenadas ingresadas forman una recta, por favor ingrese coordenadas nuevas.");
                                valoresX.clear();
                                valoresY.clear();
                                contador = 0;
                            } else if (pend_entre_p1_p2 != pend_entre_p2_p3 && contador == 3) {
                                break;
                            }
                        }

                    } catch (java.lang.ArithmeticException exc) {
                        System.out.println("El calculo de una de las pendientes no se pudo realizar (se intento dividir por cero)");
                        break;
                    }
                    try {
                        if (eleccion == 4) {//control de flujo para determinar si los puntos del cuadrilatero forman una recta
                            Pendiente p_1_2 = new Pendiente(valoresY.get(1), valoresY.get(0), valoresX.get(1), valoresX.get(0));
                            double pend_entre_p1_p2 = p_1_2.calcularPendiente();
                            Pendiente p_2_3 = new Pendiente(valoresY.get(2), valoresY.get(1), valoresX.get(2), valoresX.get(1));
                            double pend_entre_p2_p3 = p_2_3.calcularPendiente();
                            Pendiente p_3_4 = new Pendiente(valoresY.get(3), valoresY.get(2), valoresX.get(3), valoresX.get(2));
                            double pend_entre_p3_p4 = p_3_4.calcularPendiente();
                            if (pend_entre_p1_p2 == pend_entre_p2_p3 && pend_entre_p2_p3 == pend_entre_p3_p4) {
                                System.out.println("Las coordenadas ingresadas forman una recta, por favor ingrese coordenadas nuevas.");
                                valoresX.clear();
                                valoresY.clear();
                                contador = 0;
                            } else {// if (pend_entre_p1_p2 != pend_entre_p2_p3 || pend_entre_p2_p3 != pend_entre_p3_p4 || pend_entre_p3_p4 != pend_entre_p1_p2) && contador == 4) <-- porcion de codigo removida
                                break;
                            }
                        }

                    } catch (java.lang.ArithmeticException exc) {
                        System.out.println("El calculo de una de las pendientes no se pudo realizar (se intento dividir por cero)");
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

                    //control de flujo para crear triangulos
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

                } else if (contador == 4) {//control de flujo para crear cuadrilateros

                    Distancia ab = new Distancia(valoresX.get(1), valoresX.get(0), valoresY.get(1), valoresY.get(0));
                    double lado1 = ab.calc_distancia();

                    Distancia bc = new Distancia(valoresX.get(2), valoresX.get(1), valoresY.get(2), valoresY.get(1));
                    double lado2 = bc.calc_distancia();

                    Distancia cd = new Distancia(valoresX.get(3), valoresX.get(2), valoresY.get(3), valoresY.get(2));
                    double lado3 = cd.calc_distancia();

                    Distancia ad = new Distancia(valoresX.get(3), valoresX.get(0), valoresY.get(3), valoresY.get(0));
                    double lado4 = ad.calc_distancia();

                    //los siguientes if pueden crear paralelogramos
                    if ((lado1 == lado2 && lado2 == lado3 && lado3 == lado4) ) {// le puse esto, pero aun sacandoselo no hace nada cuando las coordenadas debiesen ser un cuadrado (valoresX.get(0) == valoresX.get(1) && valoresX.get(2) == valoresX.get(3) && valoresY.get(0) == valoresY.get(3) && valoresY.get(1) == valoresY.get(2))
                        Cuadrado cuad = new Cuadrado(lado1, lado2, lado3, lado4);//crea cuadrado
                        cuad.mostrarInformacion();

                    } else if ((lado1 == lado3 && lado2 == lado4) && (valoresX.get(0) == valoresX.get(1) && valoresX.get(2) == valoresX.get(3) && valoresY.get(0) == valoresY.get(3) && valoresY.get(1) == valoresY.get(2))) {
                        Rectangulo rect = new Rectangulo(lado1, lado2, lado3, lado4);//crea rectangulo
                        rect.mostrarInformacion();
                    } else if ((lado1 == lado2 && lado2 == lado3 && lado3 == lado4) && (valoresX.get(0) != valoresX.get(1) && valoresX.get(2) != valoresX.get(3) && valoresX.get(0) == valoresX.get(2) && valoresY.get(1) == valoresY.get(3))) {
                        Rombo romb = new Rombo(lado1, lado2, lado3, lado4,valoresX.get(0),valoresX.get(1),valoresX.get(2),valoresX.get(3),valoresY.get(0),valoresY.get(1),valoresY.get(2),valoresY.get(3));//crea rombo
                        romb.mostrarInformacion();
                    }  else if ((lado1 == lado3 && lado2 == lado4) && (valoresX.get(0) != valoresX.get(1) && valoresX.get(2) != valoresX.get(3) && valoresX.get(0) == valoresX.get(2) && valoresY.get(1) == valoresY.get(3))) {
                        Romboide romboi = new Romboide(lado1, lado2, lado3, lado4); //crea romboide
                        romboi.mostrarInformacion();

                        //los 2 if else que vienen crean no parapelolgramos
                    } else if ((lado1 == lado3 && lado2 != lado4) || (lado1 != lado3 && lado2 == lado4)) {
                        Trapecio trap = new Trapecio(lado1, lado2, lado3, lado4);
                        trap.mostrarInformacion();//crea trapecio
                    } else if (lado1 != lado2 && lado1 != lado3 && lado1 != lado4 && lado2 != lado3 && lado2 != lado4 && lado3 != lado4) {
                        Trapezoide trapez = new Trapezoide(lado1, lado2, lado3, lado4);//crea trapezoide
                        trapez.mostrarInformacion();

                    }

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
                        if (op_salir == 1 || op_salir == 2) {
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

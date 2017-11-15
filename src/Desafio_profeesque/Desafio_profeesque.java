package Desafio_profeesque;

import Mensaje_inicial.Mensaje_de_inicio;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import Formulas.Distancia;
import Triangulos.Equilatero;
import Triangulos.Escaleno;
import Triangulos.Isosceles;
import No_Paralelogramos.Romboide;
import No_Paralelogramos.Trapecio;
import No_Paralelogramos.Trapezoide;
import Paralelogramos.Cuadrado;
import Paralelogramos.Rectangulo;
import Paralelogramos.Rombo;

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
                        System.out.println("3 o 4 puntos?: ");
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
                        System.out.print("Ingrese coordenada Nº" + (contador + 1) + ": ");
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
                    
                    System.out.println("Valores de lados: ");
                    System.out.println(lado1);
                    System.out.println(lado2);
                    System.out.println(lado3);

                    if (lado1 == lado2 && lado2 == lado3 && lado3 == lado1) {
                        System.out.println("Las coordenadas ingresadas forman un triangulo equilatero.");
                        Equilatero teq=  new Equilatero(lado1, lado2, lado3);
                        System.out.println("Perimetro: " + teq.calcularPerimetro() + "");
                        System.out.println("Area: " + teq.calcularArea());

                    } else if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1) {
                        System.out.println("Las coordenadas ingresadas forman un triangulo escaleno.");
                        Escaleno tes = new Escaleno(lado1, lado2, lado3);
                        System.out.println("Perimetro: " + tes.calcularPerimetro());
                        System.out.println("Area: " + tes.calcularArea());

                    } else if ((lado1 == lado2 && lado1 != lado3 && lado3 != lado2) || (lado2 == lado3 && lado1 != lado2 && lado1 != lado3) || (lado3 == lado1 && lado2 != lado3 && lado2 != lado1)) {
                        System.out.println("Las coordenadas ingresadas forman un triangulo isosceles.");
                        Isosceles tis=new Isosceles(lado1,lado2,lado3);
                        System.out.println("Perimetro: "+tis.calcularPerimetro());
                        System.out.println("Area: "+tis.calcularArea());

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
                    
                    System.out.println("Valores de lados: ");
                    System.out.println(lado1);
                    System.out.println(lado2);
                    System.out.println(lado3);
                    System.out.println(lado4);
                    
                    if(lado1 == lado2 && lado2 == lado3 && lado3 == lado4) {
                        System.out.println("Las coordenadas ingresadas forman un cuadrado");
                        Cuadrado cuad = new Cuadrado(lado1, lado2, lado3, lado4);
                        System.out.println("Perimetro: "+cuad.calcularPerimetro());
                        System.out.println("Area: "+cuad.calcularArea());
                        
                    }else if(lado1 == lado3 && lado2 == lado4){
                        System.out.println("Las coordenadas ingresadas forman un rectanglo");
                        Rectangulo rect = new Rectangulo(lado1, lado2, lado3, lado4);
                        System.out.println("Perimetro: "+rect.calcularPerimetro());
                        System.out.println("Area: "+rect.calcularArea());
                        
                }//else if(aqui va la condicion del rombo){
//                System.out.println("Las coordenadas ingresadas forman un rectanglo");
//                        Rombo rombo = new Rombo(lado1, lado2, lado3, lado4);
//                        System.out.println("Perimetro: "+rombo.calcularPerimetro());
//                        System.out.println("Area: "+rombo.calcularArea());
                }

                int valorXdelVectordeTraslacion = 0;
                int valorYdelVectordeTraslacion = 0;

                while (true) {
                    try {
                        System.out.println("Ingrese vector de traslacion:");
                        String veT = input.nextLine();
                        String[] valorVeT = veT.split(",");
                        String vX = valorVeT[0];
                        String vY = valorVeT[1];
                        valorXdelVectordeTraslacion = Integer.parseInt(vX);
                        valorYdelVectordeTraslacion = Integer.parseInt(vY);

                        break;// no estoy seguro de que esto vuelva a pedir el vector si hay un error
                    } catch (Exception e) {
                        System.out.println("Debe inngresar un vector valido");
                    }

                }
                System.out.println("La figura se ha trasladado exitosamente. Las nuevas coordenadas son: ");
                System.out.println("Punto 1: " + (valoresX.get(0) + valorXdelVectordeTraslacion) + "," + valoresY.get(0) + valorYdelVectordeTraslacion);
                System.out.println("Punto 2: " + (valoresX.get(1) + valorXdelVectordeTraslacion) + "," + valoresY.get(1) + valorYdelVectordeTraslacion);
                System.out.println("Punto 3: " + (valoresX.get(2) + valorXdelVectordeTraslacion) + "," + valoresY.get(2) + valorYdelVectordeTraslacion);
                System.out.println("Punto 4: " + (valoresX.get(3) + valorXdelVectordeTraslacion) + "," + valoresY.get(3) + valorYdelVectordeTraslacion);

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

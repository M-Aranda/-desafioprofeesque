
package Desafio_profeesque;

import Mensaje_inicial.Mensaje_de_inicio;

import java.util.Scanner;

public class Desafio_profeesque {


    public static void main(String[] args) {
        
        Scanner respuesta = new Scanner(System.in);
        
        
        int eleccion;
        while(true){
            try {
                System.out.println("3 o 4 puntos?");
                eleccion=Integer.parseInt(respuesta.nextLine());
                
                if (eleccion==3 || eleccion==4){
                break;
            }
                
            } catch (Exception e) {
                System.out.println("Debe responder 3 o 4");
            }
}
        
        
        
        Mensaje_de_inicio mensaje=new Mensaje_de_inicio();
        mensaje.mostrarMensajeDeInicio();

        Scanner input= new Scanner(System.in);

        
        
        int x;
        int y;
        
        int contador=0;
        while(true){
            try {
                String a=input.nextLine();
                    String[]valores=a.split(",");
                    String xs=valores[0];
                    String ys=valores[1];
                    x=Integer.parseInt(xs);
                    y=Integer.parseInt(ys);
                    contador++;
                    
                    
            } catch (Exception e) {
                System.out.println("Debe ingresar una coordenada valida");
            }
            if(eleccion==contador){
                break;
            }
        }
        
        
        
        
        
        
    }
    
}

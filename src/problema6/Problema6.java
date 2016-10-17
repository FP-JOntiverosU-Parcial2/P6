/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema6;
import java.util.*;
/**
 *
 * @author jaime
 */
public class Problema6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int h,s,o;
        h=solicitarDato("numero de horas: ");
        s=solicitarDato("salario: ");
        o=operacion(h,s);
        System.out.println("Gracias por usar el programa");
    }
    public static int solicitarDato(String d){
        int miDato;
        System.out.println("Introduce el " + d);
        Scanner teclado= new Scanner(System.in);
        miDato=teclado.nextInt();
        return miDato;
    }
    public static int operacion(int h, int s){
        int r=0;
        if (h<=40){r= h*s;}
        if (h>=48){r= ((h*s)*2);}
        if (h>48) {r= ((h*s)*3);}
       System.out.println("El pago de " + h + " horas por " + s + " pesos a la semana es igual a: " + r + " pesos");
        return r;
        
        }
}

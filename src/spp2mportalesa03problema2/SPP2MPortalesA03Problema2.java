/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2mportalesa03problema2;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class SPP2MPortalesA03Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Encontrar el arcotangete de un numero");
        //declarar variables
         double num, arc;
         //entrada del teclado
     Scanner teclado= new Scanner (System.in);
     //solicitar datos
         System.out.println("Introduce el numero");
         num =teclado.nextDouble();
         //operacion con metodo Math.atan para obtener el arco tangente de un numero
         arc= Math.atan(num);
         //resultado
         System.out.println("El resultado de arctan es " +arc);
    }
    
}

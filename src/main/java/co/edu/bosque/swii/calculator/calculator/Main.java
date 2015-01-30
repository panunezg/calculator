/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.bosque.swii.calculator.calculator;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Main {
  /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number1,number2;
        Scanner scanner = new Scanner(System.in);
         System.out.println("ingresar numero :");
        number1= scanner.nextInt();
        System.out.println("ingresar numero :");
        number2= scanner.nextInt();
        Calculador c = new Calculador();
        System.out.println(c.sumar(number1, number2));
         System.out.println(c.restar(number1, number2));
         System.out.println(c.multiplicar(number1, number2));
         System.out.println(c.dividir(number1, number2));
        
    }
   
}

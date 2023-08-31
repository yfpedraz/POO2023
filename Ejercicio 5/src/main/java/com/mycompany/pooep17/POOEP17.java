/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooep17;

// Ejercicio propuesto No 17
/**
 * Programa que calcula el area y el perimetro de un circulo
 * @author YONNATTANTH
 */
import java.util.Scanner;
public class POOEP17 {

    public static void main(String[] args) {
        System.out.println("Ingrese radio = ");
        Scanner entrada = new Scanner(System.in);
        double radio = entrada.nextDouble();
        
        double area = Math.PI*Math.pow(radio, 2);
        
        double perimetr = 2*Math.PI*radio ;        
        System.out.println("El area es = " + area);
        System.out.println("El perimetro es = "+ perimetr);
        
    }
}

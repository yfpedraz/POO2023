/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooep14;

//Ejercicio propuesto 14
/**
 *Programa que calcula el cuadrado y el cubo de un numero
 * @author YONNATTANTH
 */
import java.util.Scanner;

        
public class POOEP14 {
    
    

    public static void main(String[] args) {
        
        System.out.println("Ingrese base = ");
        Scanner entrada = new Scanner(System.in);
        double base = entrada.nextDouble();
        double exponentec = 2; //Exponente para calcular el cuadtado
        double resultadoa = Math.pow(base, exponentec); //calculo del cuadrado
        double exponenteq = 3; //Exponente para calcular el cubo
        double resultadob = Math.pow(base, exponenteq); //Calculo del cubo       
        System.out.println("El cuadrado del núemro es = " + resultadoa);
        System.out.println("El cubo del núemro es = " + resultadob);
    }      
}
    
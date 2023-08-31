/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooer4;

import java.util.Scanner;
public class POOER4 {

    
// Ejercicio resuelto numero 4
// Yonnattanth fernando pedraza Obando

// Ejercicio propuesto No 4
/**
 * Programa que calcula la edad a partir de una edad dada por consola
 * @author YONNATTANTH
 */
    
    public static void main(String[] args) {
        int edjuan, edalber, edana, edmama; //edad de Juan
        
        System.out.println("Ingrese la edad de Juan: "); // Imprime por pantalla
        Scanner entrada = new Scanner(System.in);
        edjuan = entrada.nextInt();
        
        
        edalber = 2*(edjuan/3); // edad de alberto
        edana = 4*(edjuan/3); //edad de Ana
        edmama = edjuan + edalber + edana; //edad de mama
        System.out.println("Juan = " + edjuan );
        System.out.println("Alberto = " + edalber );
        System.out.println("Ana = " + edana );
        System.out.println("Mama = " + edmama );
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooep12;

// Ejercicio propuesto No 12
/**
Programa para calcular salrio bruto, retencion y salario neto.
 */
public class POOEP12 {

    public static void main(String[] args) {
        
        int ht; //horas trabajada
        double vh, prf, sb, rf, sn;
        
        ht = 48; //Horas trabajadas
        vh = 5000; // Valor por hora
        prf = 0.125; // Porcentaje de retención
        
        sb = ht*vh; // Salario Base
        rf = sb*prf; // Retención en la fuente
        sn = sb - rf; // salario Neto
        
        
        System.out.println("El salario bruuto del empleado es`: " + sb);
        System.out.println("La retención en la fuente del empeleado es`: " + rf);
        System.out.println("El salario neto del empeleado es`: " + sn);
    }
}
    

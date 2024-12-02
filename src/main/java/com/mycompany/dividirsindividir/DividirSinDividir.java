/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dividirsindividir;

/**
 *
 * @author Jose Ramos
 */
public class DividirSinDividir {

    public static void main(String[] args) {
        // Con multiplicacion *
        int dividendo = 31;
        int divisor = 5;
        int cociente = getCociente(dividendo, divisor);
        int residuo = getResiduo(dividendo, divisor, cociente);
        
        System.out.println("Cociente = " + cociente);
        System.out.println("Residuo = " + residuo);
    }

    private static int getCociente(int divid, int divis) {
        int coci = 0;
        
        for(int a = 0; a * divis <= divid; a++) {
            coci = a;
        }
        return coci;
    }

    private static int getResiduo(int dividendo, int divisor, int cociente) {
        return dividendo - divisor*cociente;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carlos;

import java.util.Scanner;

/**
 *
 * @author ce182
 */
public class Carlos {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el rango: ");
            int num = scanner.nextInt();
            if (num < 1) {
                System.out.println("La cantidad de números debe ser >= 1.");
                return;
            }   System.out.println("La Serie de Fibonacci de " + num + " números:");
            int numero1 = 0, numero2 = 1;
            System.out.print(numero1 + " ");
            for (int i = 1; i < num; i++) {
                System.out.print(numero2 + " ");
                
                
                int nextNumero = numero1 + numero2;
                
                
                numero1 = numero2;
                numero2 = nextNumero;
            }
        }
    }
}

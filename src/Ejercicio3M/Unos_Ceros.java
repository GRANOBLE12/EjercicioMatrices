/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3M;

import java.util.Scanner;

/**
 *
 * @author ANDRES
 */
public class Unos_Ceros {

    int Matriz[][] = new int[3][3];
    Scanner in = new Scanner(System.in);

    void llenarMatriz() {
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                if (i == j) {
                    Matriz[i][j] = 1; 
                } else {
                    Matriz[i][j] = 0;
                }
            }
        }
    }

    void mostrarMatriz() {
        System.out.println("Matriz:");
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                System.out.print(Matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

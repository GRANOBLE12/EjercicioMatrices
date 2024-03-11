/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1M;

import java.util.Scanner;

/**
 *
 * @author ANDRES
 */
public class Letras {
    String [][] letras=new String [4][2];
    Scanner in=new Scanner(System.in);
    
    void guardarLetras(){
        System.out.println("Por favor, ingrese 8 letras:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Ingrese la letra para la posición [" + (i+1) + "][" + (j+1) + "]: ");
                letras[i][j] = in.next();
            }
        }
    }
    void listar(){
        System.out.println("Información ordenada:");
        for(int i = 0; i < letras.length; i++) {
            System.out.println(letras[i][0] + " - " + letras[i][1]);       
        }
    } 
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2M;

import java.util.Scanner;

public class Notas {
    double notas[][] = new double[3][2];
    Scanner in = new Scanner(System.in);

    void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Registrar notas");
            System.out.println("2. Sumar notas por fila");
            System.out.println("3. Calcular promedio de notas");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = in.nextInt();

            switch (opcion) {
                case 1:
                    registrarNotas();
                    break;
                case 2:
                    sumarNotasPorFila();
                    break;
                case 3:
                    calcularPromedioNotas();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 4);
    }

    void registrarNotas() {
        System.out.println("Registro de 6 notas");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Digite la nota para la posición [" + (i + 1) + "][" + (j + 1) + "]");
                notas[i][j] = in.nextDouble();
            }
        }
    }

    void sumarNotasPorFila() {
        for (int i = 0; i < notas.length; i++) {
            double suma = 0; 
            for (int j = 0; j < notas[i].length; j++) {
                suma += notas[i][j];
            }
            System.out.println("La suma de las notas en la fila " + (i + 1) + " es: " + suma);
        }
    }

    void calcularPromedioNotas() {
        double sumaTotal = 0;
        double promedio=0;
        int totalnotas=0;
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                sumaTotal += notas[i][j];
                totalnotas++;
            }
        }
        promedio = sumaTotal / totalnotas;
        System.out.println("El promedio de todas las notas es: " + promedio);
    }
}
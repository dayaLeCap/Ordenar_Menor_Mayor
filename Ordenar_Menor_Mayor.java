package com.example.ejercicio_diagrama_flujo;



import java.util.Scanner;
import java.util.Arrays;

public class Ordenar_Menor_Mayor {


    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Order the numbers from least to greatest");
        System.out.println(" ");
        int[] numbers = {100, 10, 2, 0, -1, 4, 3, 1000};

        // Implementación del algoritmo de ordenación por selección
        for (int i = 0; i < numbers.length - 1; i++) {
            int indexMenor = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[indexMenor]) {
                    indexMenor = j;
                }
            }
            // Intercambiar el elemento encontrado con el primer elemento
            int temp = numbers[indexMenor];
            numbers[indexMenor] = numbers[i];
            numbers[i] = temp;
        }

        // Imprimir el array ordenado
        System.out.println("The numbers from smallest to largest are:" +Arrays.toString(numbers));
        System.out.println("");
        System.out.println("Made by Dayana and Daniela:");
        System.out.println("");
        System.out.println("Thanks you:");
    }
}


package com.example;

import java.util.Arrays;

public class AppArrays {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Estudos sobre criação de matrizes e vetores no java");

        int vetor[] = {1, 2, 3};
        System.out.println(Arrays.toString(vetor));
        System.out.println();
        
        int vetor2[] = new int[3];
        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = i + 1;
        }
        System.out.println(Arrays.toString(vetor2));
        System.out.println();

        int matriz[][] = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = i * matriz.length + j + 1;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

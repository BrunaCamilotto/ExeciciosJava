package com.ifsc.ctds;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] matriz = new int[2][4];

        System.out.println("Digite os elementos da matriz 2x4:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = teclado.nextInt();
            }
        }

        System.out.println("Matriz 2x4:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        teclado.close();
    }
}

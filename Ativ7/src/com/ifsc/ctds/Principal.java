package com.ifsc.ctds;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número N para exibir a tabuada até N: ");
        int N = teclado.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println("Tabuada de " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }

        teclado.close();
    }
}

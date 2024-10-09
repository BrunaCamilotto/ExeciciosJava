package com.ifsc.ctds;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] A = new double[7];
        double soma = 0;
        double maior = 0;
        double menor = 0;

        System.out.println("Digite 7 valores numéricos:");

        for (int i = 0; i < 7; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            A[i] = teclado.nextDouble();
            soma += A[i];

            if (i == 0) {
                maior = menor = A[i];
            } else {
                if (A[i] > maior) maior = A[i];
                if (A[i] < menor) menor = A[i];
            }
        }

        double media = soma / 7;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

        teclado.close();
    }
}
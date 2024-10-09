package com.ifsc.ctds;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Por favor, insira o número inicial do intervalo: ");
        int limiteInferior = teclado.nextInt();

        System.out.print("Agora, insira o número final do intervalo: ");
        int limiteSuperior = teclado.nextInt();

        System.out.println("Números primos encontrados entre " + limiteInferior + " e " + limiteSuperior + ":");
        for (int num = limiteInferior; num <= limiteSuperior; num++) {
            if (ehPrimo(num)) {
                System.out.println(num);
            }
        }

        teclado.close();
    }

    public static boolean ehPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}

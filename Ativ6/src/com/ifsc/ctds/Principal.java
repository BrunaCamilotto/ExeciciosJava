package com.ifsc.ctds;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = teclado.nextInt();
        int soma = 0;
        StringBuilder detalhes = new StringBuilder();

        for (int i = 1; i <= numero; i++) {
            soma += i;
            detalhes.append(i);
            if (i < numero) {
                detalhes.append(" + ");
            }
        }

        System.out.println(detalhes.toString() + " = " + soma);
        
        teclado.close();
    }
}

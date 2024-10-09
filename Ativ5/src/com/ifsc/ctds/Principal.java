package com.ifsc.ctds;

public class Principal {

    public static void main(String[] args) {
        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            soma += i;
        }

        System.out.println("A soma dos números inteiros de 1 a 100 é: " + soma);
    }
}

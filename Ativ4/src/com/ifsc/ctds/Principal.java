package com.ifsc.ctds;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o sal�rio atual do funcion�rio: ");
        double salarioAtual = teclado.nextDouble();

        System.out.print("Digite o valor do sal�rio m�nimo: ");
        double salarioMinimo = teclado.nextDouble();

        Funcionario funcionario = new Funcionario(salarioAtual, salarioMinimo);
        double salarioReajustado = funcionario.calcularSalarioReajustado();

        System.out.println("Sal�rio reajustado: " + salarioReajustado);

        teclado.close();
    }
}

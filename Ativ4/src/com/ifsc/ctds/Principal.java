package com.ifsc.ctds;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o salário atual do funcionário: ");
        double salarioAtual = teclado.nextDouble();

        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = teclado.nextDouble();

        Funcionario funcionario = new Funcionario(salarioAtual, salarioMinimo);
        double salarioReajustado = funcionario.calcularSalarioReajustado();

        System.out.println("Salário reajustado: " + salarioReajustado);

        teclado.close();
    }
}

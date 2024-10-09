package com.ifsc.ctds;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = teclado.nextDouble();

        System.out.print("Digite o salário por hora: ");
        double salarioPorHora = teclado.nextDouble();

        Funcionario funcionario = new Funcionario(horasTrabalhadas, salarioPorHora);
        double salarioTotal = funcionario.calcularSalarioTotal();

        System.out.println("Salário total: " + salarioTotal);

        teclado.close();
    }
}

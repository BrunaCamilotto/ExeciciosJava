package com.ifsc.ctds;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o n�mero de horas trabalhadas no m�s: ");
        double horasTrabalhadas = teclado.nextDouble();

        System.out.print("Digite o sal�rio por hora: ");
        double salarioPorHora = teclado.nextDouble();

        Funcionario funcionario = new Funcionario(horasTrabalhadas, salarioPorHora);
        double salarioTotal = funcionario.calcularSalarioTotal();

        System.out.println("Sal�rio total: " + salarioTotal);

        teclado.close();
    }
}

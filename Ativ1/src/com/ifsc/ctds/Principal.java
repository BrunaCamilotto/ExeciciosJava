package com.ifsc.ctds;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 

        System.out.print("Digite o valor do empréstimo: ");
        double valorEmprestimo = teclado.nextDouble();
        System.out.print("Digite o número de parcelas: ");
        int numParcelas = teclado.nextInt();
        System.out.print("Digite o salário do solicitante: ");
        double salario = teclado.nextDouble();
        Emprestimo emprestimo = new Emprestimo(valorEmprestimo, numParcelas, salario);
        boolean aprovado = emprestimo.aprovarEmprestimo();

        if (aprovado) {
            System.out.println("Empréstimo aprovado!");
        } else {
            System.out.println("Empréstimo reprovado. O valor da parcela excede 30% do salário.");
        }

        teclado.close();
    }
}

package com.ifsc.ctds;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 

        System.out.print("Digite o valor do empr�stimo: ");
        double valorEmprestimo = teclado.nextDouble();
        System.out.print("Digite o n�mero de parcelas: ");
        int numParcelas = teclado.nextInt();
        System.out.print("Digite o sal�rio do solicitante: ");
        double salario = teclado.nextDouble();
        Emprestimo emprestimo = new Emprestimo(valorEmprestimo, numParcelas, salario);
        boolean aprovado = emprestimo.aprovarEmprestimo();

        if (aprovado) {
            System.out.println("Empr�stimo aprovado!");
        } else {
            System.out.println("Empr�stimo reprovado. O valor da parcela excede 30% do sal�rio.");
        }

        teclado.close();
    }
}

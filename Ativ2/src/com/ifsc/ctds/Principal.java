package com.ifsc.ctds;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = teclado.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = teclado.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = teclado.nextDouble();

        System.out.print("Digite a quarta nota: ");
        double nota4 = teclado.nextDouble();

        Aluno aluno = new Aluno(nota1, nota2, nota3, nota4);
        aluno.calcularMedia();

        if (aluno.estaAprovado()) {
            System.out.println("Aluno aprovado com média: " + aluno.getMedia());
        } else {
            System.out.println("Aluno em exame com média: " + aluno.getMedia());

            System.out.print("Digite a nota do exame: ");
            double notaExame = teclado.nextDouble();

            aluno.calcularMediaExame(notaExame);

            if (aluno.estaAprovadoAposExame()) {
                System.out.println("Aluno aprovado no exame com média: " + aluno.getMedia());
            } else {
                System.out.println("Aluno reprovado no exame com média: " + aluno.getMedia());
            }
        }

        teclado.close();
    }
}

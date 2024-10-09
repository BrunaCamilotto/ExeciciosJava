package com.ifsc.ctds;

public class Emprestimo {
    private double valorEmprestimo;
    private int numParcelas;
    private double salario;


    public Emprestimo(double valorEmprestimo, int numParcelas, double salario) {
        this.valorEmprestimo = valorEmprestimo;
        this.numParcelas = numParcelas;
        this.salario = salario;
    }

   
    private double calcularParcela() {
        return valorEmprestimo / numParcelas;
    }

    public boolean aprovarEmprestimo() {
        double valorParcela = calcularParcela();
        double limiteParcela = salario * 0.30; 
        return valorParcela <= limiteParcela;
    }
}

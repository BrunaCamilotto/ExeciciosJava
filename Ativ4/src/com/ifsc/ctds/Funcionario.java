package com.ifsc.ctds;

public class Funcionario {
    private double salarioAtual;
    private double salarioMinimo;

    public Funcionario(double salarioAtual, double salarioMinimo) {
        this.salarioAtual = salarioAtual;
        this.salarioMinimo = salarioMinimo;
    }

    public double calcularSalarioReajustado() {
        double salarioMinimos = salarioAtual / salarioMinimo;
        double percentualReajuste = 0;

        if (salarioMinimos < 3) {
            percentualReajuste = 0.50;
        } else if (salarioMinimos >= 3 && salarioMinimos <= 10) {
            percentualReajuste = 0.20;
        } else if (salarioMinimos > 10 && salarioMinimos <= 20) {
            percentualReajuste = 0.15;
        } else {
            percentualReajuste = 0.10;
        }

        return salarioAtual * (1 + percentualReajuste);
    }
}

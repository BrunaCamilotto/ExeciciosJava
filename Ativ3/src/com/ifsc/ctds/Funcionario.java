package com.ifsc.ctds;

public class Funcionario {
    private double horasTrabalhadas;
    private double salarioPorHora;

    public Funcionario(double horasTrabalhadas, double salarioPorHora) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioPorHora = salarioPorHora;
    }

    public double calcularSalarioTotal() {
        double horasSemanais = horasTrabalhadas / 4;
        double horasExtras = 0;

        if (horasSemanais > 40) {
            horasExtras = (horasSemanais - 40) * 4;
        }

        double salarioBase = horasTrabalhadas * salarioPorHora;
        double salarioExtra = horasExtras * salarioPorHora * 0.5;

        return salarioBase + salarioExtra;
    }
}

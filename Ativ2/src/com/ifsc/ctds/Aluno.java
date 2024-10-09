package com.ifsc.ctds;

public class Aluno {
    private double nota1, nota2, nota3, nota4, media;

    public Aluno(double nota1, double nota2, double nota3, double nota4) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    public void calcularMedia() {
        this.media = (nota1 + nota2 + nota3 + nota4) / 4;
    }

    public double getMedia() {
        return this.media;
    }

    public boolean estaAprovado() {
        return this.media >= 7;
    }

    public void calcularMediaExame(double notaExame) {
        this.media = (this.media + notaExame) / 2;
    }

    public boolean estaAprovadoAposExame() {
        return this.media >= 5;
    }
}

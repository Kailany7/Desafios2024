package com.Desafios.Desafio3;

public class Funcionario {
    private String nome;
    private double salarioBruto;
    private double taxa;

    public Funcionario(String nome, double salarioBruto, double taxa) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.taxa = taxa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double obterSalarioLiquido() {
        return salarioBruto * (1 - taxa);
    }

    public void aumentoSalario(double porcentagem) {
        salarioBruto *= (1 + porcentagem / 100);
    }

    @Override
    public String toString() {
        return String.format("Funcionário: %s | Salário Bruto: R$ %.2f | Salário Líquido: R$ %.2f", nome, salarioBruto, obterSalarioLiquido());
    }
}

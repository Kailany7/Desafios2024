package com.Desafios.Desafio3;

public class ServicoFuncionario {
    public double calcularSalarioLiquido(Funcionario funcionario) {
        return funcionario.obterSalarioLiquido();
    }
    public void aumentarSalario(Funcionario funcionario, double porcentagem) {
        funcionario.aumentoSalario(porcentagem);
    }
}

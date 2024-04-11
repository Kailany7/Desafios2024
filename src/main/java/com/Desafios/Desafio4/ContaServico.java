package com.Desafios.Desafio4;

public class ContaServico {
    public void depositar(ContaBancaria contaBancaria, double valor) {
        contaBancaria.deposito(valor);
    }

    public void sacar(ContaBancaria contaBancaria, double valor) {
        contaBancaria.saque(valor);
    }

    public static boolean contaCadastrada() {
        return false;
    }
    public static double obterSaldo(int numeroConta){
        return 0;
    }
}

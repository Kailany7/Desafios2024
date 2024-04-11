package com.Desafios.Desafio4;

import javax.swing.*;

public class ContaBancaria {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    public ContaBancaria() {
    }
    public ContaBancaria(int numeroConta, String nomeTitular, double depositoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = depositoInicial;
    }


    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "numeroConta=" + numeroConta +
                ", nomeTitular='" + nomeTitular + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    public void deposito(double valor){
        saldo += valor;
    }

    public void saque(double valor){
        if (saldo >= valor + 5) { // Considerando a taxa de R$5.00 para saques
            saldo -= (valor + 5);
            JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Saldo insuficiente para saque.");
        }
    }
    public void alterarNomeTitular(String novoNome) {
        this.nomeTitular = novoNome;
        JOptionPane.showMessageDialog(null, "Nome do titular alterado para: " + novoNome);
    }



}

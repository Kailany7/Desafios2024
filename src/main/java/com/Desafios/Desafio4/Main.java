package com.Desafios.Desafio4;

import javax.swing.*;

import static com.Desafios.Desafio4.ContaServico.obterSaldo;

public class Main {
    public static void main(String[] args) {
        String opcaoCadastro = JOptionPane.showInputDialog(
                "Bem-vindo ao sistema bancário!\n" +
                        "Você deseja criar uma nova conta?\n" +
                        "1. Sim\n" +
                        "2. Não"
        );

        ContaBancaria conta;

        if (opcaoCadastro.equals("1")) {
            // Criar uma nova conta
            conta = criarConta();
        } else {
            // Usar uma conta existente
            conta = usarContaExistente();
        }

        // Se a conta não foi criada, finalizar o programa
        if (conta == null) {
            return;
        }

        // Interagir com o usuário para realizar operações
        realizarOperacoes(conta);
    }

    public static ContaBancaria criarConta() {
        // Solicitar informações para criar a conta
        int numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta:"));
        String nomeTitular = JOptionPane.showInputDialog("Digite o nome do titular da conta:");
        double depositoInicial = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito inicial:"));

        // Criar a conta bancária
        ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular, depositoInicial);

        JOptionPane.showMessageDialog(null, "Conta criada com sucesso!");

        return conta;
    }

    public static ContaBancaria usarContaExistente() {

        if (ContaServico.contaCadastrada ()) {
            int numeroConta = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da conta existente:"));
            String nomeTitular = JOptionPane.showInputDialog("Digite o nome do titular da conta:");


            double saldo = obterSaldo(numeroConta); // Supondo que exista uma função para obter o saldo

            // Criar a conta bancária
            ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular, saldo);

            JOptionPane.showMessageDialog(null, "Conta selecionada com sucesso!");

            return conta;
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, realize seu cadastro");

            return null;
        }
    }

    public static void realizarOperacoes(ContaBancaria conta) {
        ContaServico contaServico = new ContaServico();

        while (true) {
            // Exibir menu de operações
            String escolha = JOptionPane.showInputDialog(
                    "Escolha a operação:\n" +
                            "1. Depósito\n" +
                            "2. Saque\n" +
                            "3. Alterar nome do titular\n" +
                            "4. Mostrar dados da conta\n" +
                            "5. Sair"
            );

            // Verificar escolha do usuário
            switch (escolha) {
                case "1":
                    double valorDeposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito:"));
                    contaServico.depositar(conta, valorDeposito);
                    JOptionPane.showMessageDialog(null, "Depósito realizado com sucesso!");
                    break;
                case "2":
                    double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque:"));
                    contaServico.sacar(conta, valorSaque);
                    break;
                case "3":
                    String novoNome = JOptionPane.showInputDialog("Digite o novo nome do titular:");
                    conta.alterarNomeTitular(novoNome);
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, conta);
                    break;
                case "5":
                    JOptionPane.showMessageDialog(null, "Saindo do programa.");
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Escolha inválida!");
            }
        }
    }


}

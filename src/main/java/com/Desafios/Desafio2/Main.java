package com.Desafios.Desafio2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ServicoTarefa servico = new ServicoTarefa ();
        int opcao;

        do {
            opcao = exibirMenu();
            switch (opcao) {
                case 1:

                    String nomeTarefa = JOptionPane.showInputDialog("Digite o nome da tarefa:");
                    servico.adicionarTarefa(nomeTarefa);
                    break;
                case 2:
                    // Visualiza todas as tarefas cadastradas
                    servico.visualizarTarefas();
                    break;
                case 3:
                    String nomeTarefaRemover = JOptionPane.showInputDialog("Digite o nome da tarefa a remover:");
                    servico.removerTarefa(nomeTarefaRemover);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saindo do programa...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida, por favor digite uma opção válida.");
            }
        } while (opcao != 4);
    }

    private static int exibirMenu() {
        String menu = "Escolha uma opção:\n" +
                "1. Adicionar Tarefa\n" +
                "2. Visualizar Tarefas\n" +
                "3. Remover Tarefa\n" +
                "4. Sair";
        String input = JOptionPane.showInputDialog(menu);
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return 0;
        }



    }

}

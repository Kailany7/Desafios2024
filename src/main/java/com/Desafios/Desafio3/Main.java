package com.Desafios.Desafio3;

import javax.swing.*;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Kai", 8000, 0.1);
        Funcionario funcionario2 = new Funcionario("Lany", 6000, 0.15);


        JOptionPane.showMessageDialog(null, "Detalhes dos funcionários:\n" + funcionario1 + "\n" + funcionario2);


        ServicoFuncionario servico = new ServicoFuncionario();


        servico.aumentarSalario(funcionario2, 10);

        // Exibindo os  detalhes dos funcionários após o aumento de 10%
        JOptionPane.showMessageDialog(null, "Detalhes dos funcionários após o aumento de 10%:\n" + funcionario1 + "\n" + funcionario2);

        DecimalFormat df = new DecimalFormat ("#.##");
        JOptionPane.showMessageDialog(null, "Salários líquidos:\n" +
                "Salário líquido de " + funcionario1.getNome() + " é R$ " + df.format(servico.calcularSalarioLiquido(funcionario1)) + "\n" +
                "Salário líquido de " + funcionario2.getNome() + " é R$ " + df.format(servico.calcularSalarioLiquido(funcionario2)));
    }
}

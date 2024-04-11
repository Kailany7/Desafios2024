package com.Desafios.Desafio1.Exercicio2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog ( null, "Digite um número de 1 a 7 para representar o dia da semana: " );
        int numero = Integer.parseInt ( input );

        DiaDaSemana dia = new DiaDaSemana ( numero ); // Está variavel 'numero' está capturando a entrada de usuário
        String nomeDia = dia.obterNomeDia ();
        JOptionPane.showMessageDialog ( null, "Referente a : " + nomeDia );


    }
}

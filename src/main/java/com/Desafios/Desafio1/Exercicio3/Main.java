package com.Desafios.Desafio1.Exercicio3;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite um número para realizarmos uma contagem usando diferentes tipos de loops:  ");
        int numero = Integer.parseInt(input);

        EstruturaLoop el = new EstruturaLoop(numero);

        JOptionPane.showMessageDialog(null, "Iniciamos com loop for");
        EstruturaLoop.forLoop();

        JOptionPane.showMessageDialog(null, " Agora o loop while");
        EstruturaLoop.whileLoop();

        JOptionPane.showMessageDialog(null, " E por fim o loop do-while");
        EstruturaLoop.doWhileLoop();

    }
}

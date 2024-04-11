package com.Desafios.Desafio1.Exercicio3;

import javax.swing.*;

public class EstruturaLoop {
    private static int numero; // Usando a variável 'static' para facilitar o acesso dos métodos estáticos.

    public EstruturaLoop (int numero) {
        this.numero = numero;
    }

    public static void forLoop() {
        String aux1 = "";
        for (int i = 0; i < numero; i++) {
            aux1 = (aux1 + "for: " + i + "\n");
        }
        JOptionPane.showMessageDialog(null, aux1);
    }

    public static void whileLoop() {
        String aux2 = "";
        int contadorWhile = 0;
        while (contadorWhile < numero) {
            aux2 = (aux2 + "while: " + contadorWhile + "\n");
            contadorWhile++;
        }
        JOptionPane.showMessageDialog(null, aux2);
    }

    public static void doWhileLoop() {
        String aux3 = "";
        int contadorDoWhile = 0;
        do {
            aux3 = (aux3 + "doWhile: " + contadorDoWhile + "\n");
            contadorDoWhile++;
        } while (contadorDoWhile < numero);
        JOptionPane.showMessageDialog(null, aux3);
    }

}

package com.Desafios.Desafio1.Exercicio1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
            String input = JOptionPane.showInputDialog("Por favor, insira um número para determinarmos se é positivo, negativo ou neutro.:");
            int numero = Integer.parseInt(input);

            VerificarNumero verificarNumero = new VerificarNumero(numero);
            verificarNumero.exibirResuldado();




    }
}

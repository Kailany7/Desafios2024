package com.Desafios.Desafio1.Exercicio1;

import javax.swing.*;

public class VerificarNumero {
    private int numero;

    public VerificarNumero(int numero) {
        this.numero = numero;
    }

    public void exibirResuldado() {
        String mensagem;
        if (numero > 0) {
            mensagem = "O número é Positivo";
        } else if (numero < 0) {
            mensagem = "O número é Negativo";
        } else {
            mensagem = "O número é Neutro";
        }
        JOptionPane.showMessageDialog(null, mensagem);
    }
}

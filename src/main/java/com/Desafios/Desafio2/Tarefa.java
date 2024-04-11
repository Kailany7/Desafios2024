package com.Desafios.Desafio2;

public class Tarefa {
    private String nome;

    public Tarefa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String toString() {
        return "Tarefa: " + nome;
    }
}

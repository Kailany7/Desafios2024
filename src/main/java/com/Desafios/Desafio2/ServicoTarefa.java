package com.Desafios.Desafio2;

import javax.swing.*;
import java.util.HashSet;
import java.util.Set;

public class ServicoTarefa {
    private Set<Tarefa> tarefas;

    public ServicoTarefa() {

        this.tarefas = new HashSet<> ();
    }

    public void adicionarTarefa(String nomeTarefa) {
        //If e else para conferir se tem tarefa com o mesmo nome.
        Tarefa novaTarefa = new Tarefa ( nomeTarefa );
        if (!tarefas.contains ( novaTarefa )) {
            tarefas.add ( novaTarefa );
            JOptionPane.showMessageDialog ( null, "Tarefa adicionada com sucesso!" );
        } else {
            JOptionPane.showMessageDialog ( null, "Já existe uma tarefa com esse nome!" );
        }
    }

    public void visualizarTarefas() {
        if (tarefas.isEmpty ()) {
            JOptionPane.showMessageDialog ( null, "Não há tarefas cadastradas." );
        } else {
            StringBuilder listaTarefas = new StringBuilder (); // Para que seja possível armazenar as tarefas
            tarefas.forEach ( tarefa -> listaTarefas.append ( tarefa ).append ( "\n" ) );
            JOptionPane.showMessageDialog ( null, listaTarefas.toString () );

        }
    }

    public void removerTarefa(String nomeTarefa) {
        Tarefa tarefaRemover = new Tarefa ( nomeTarefa );
        if (tarefas.remove ( tarefaRemover )) {
            JOptionPane.showMessageDialog ( null, "Tarefa removida com sucesso!" );
        } else {
            JOptionPane.showMessageDialog ( null, "Tarefa não encontrada!" );
        }
    }
}

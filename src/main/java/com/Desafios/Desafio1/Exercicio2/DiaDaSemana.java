package com.Desafios.Desafio1.Exercicio2;

public class DiaDaSemana {
    private int numero; // A variável 'numero' para representar os dias da semana

    //Constantes para representar os dias por números
    public static final int DOMINGO = 1;
    public static final int SEGUNDA_FEIRA = 2;
    public static final int TERCA_FEIRA = 3;
    public static final int QUARTA_FEIRA = 4;
    public static final int QUINTA_FEIRA = 5;
    public static final int SEXTA_FEIRA = 6;
    public static final int SABADO = 7;

    public DiaDaSemana (int numero) {
        this.numero = numero;
    }

    public String obterNomeDia() {
        String diaSemana;

        switch (numero) {
            case DOMINGO:
                diaSemana = "Domingo";
                break;
            case SEGUNDA_FEIRA:
                diaSemana = "Segunda-feira";
                break;
            case TERCA_FEIRA:
                diaSemana = "Terça-feira";
                break;
            case QUARTA_FEIRA:
                diaSemana = "Quarta-feira";
                break;
            case QUINTA_FEIRA:
                diaSemana = "Quinta-feira";
                break;
            case SEXTA_FEIRA:
                diaSemana = "Sexta-feira";
                break;
            case SABADO:
                diaSemana = "Sábado";
                break;
            default:
                diaSemana = "Número inválido";
                break;
        }
        return diaSemana;





    }
}

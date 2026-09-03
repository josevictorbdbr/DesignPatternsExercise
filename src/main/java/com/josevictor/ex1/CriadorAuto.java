package com.josevictor.ex1;

public class CriadorAuto extends Criador {

    private String segurado;
    private double valorFipe;
    private int idadeCondutor;
    private int tempoHabilitacao;
    private double coberturaTerceiros;

    public CriadorAuto(String segurado, double valorFipe, int idadeCondutor, int tempoHabilitacao, double coberturaTerceiros){
        this.segurado = segurado;
        this.valorFipe = valorFipe;
        this.idadeCondutor = idadeCondutor;
        this.tempoHabilitacao = tempoHabilitacao;
        this.coberturaTerceiros = coberturaTerceiros;
    }

    @Override
    protected Apolice criarApolice() {
        return new ApoliceAuto("AUTO-",segurado, valorFipe, idadeCondutor, tempoHabilitacao, coberturaTerceiros);
    }
}

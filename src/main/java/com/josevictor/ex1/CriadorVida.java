package com.josevictor.ex1;

public class CriadorVida extends Criador {

    private String segurado;
    private int idade;
    private boolean fumante;
    private double capitalSegurado;
    private boolean possuiAtestado;

    public CriadorVida(String segurado, int idade, boolean fumante, double capitalSegurado, boolean possuiAtestado) {
        this.segurado = segurado;
        this.idade = idade;
        this.fumante = fumante;
        this.capitalSegurado = capitalSegurado;
        this.possuiAtestado = possuiAtestado;
    }

    @Override
    protected Apolice criarApolice() {
        return new ApoliceVida("VID-", segurado, idade, fumante, capitalSegurado, possuiAtestado);
    }
}

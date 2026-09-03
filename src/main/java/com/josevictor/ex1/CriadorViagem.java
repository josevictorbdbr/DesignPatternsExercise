package com.josevictor.ex1;

public class CriadorViagem extends Criador {

    private String segurado;
    private int diasViagem;
    private boolean internacional;
    private double coberturaAssistenciaMedica;
    private boolean possuiPassaporte;

    public CriadorViagem(String segurado, int diasViagem, boolean internacional, double coberturaAssistenciaMedica, boolean possuiPassaporte){
        this.segurado = segurado;
        this.diasViagem = diasViagem;
        this.internacional = internacional;
        this.coberturaAssistenciaMedica = coberturaAssistenciaMedica;
        this.possuiPassaporte = possuiPassaporte;
    }

    @Override
    protected Apolice criarApolice() {
        return new ApoliceViagem("VIA-", segurado, diasViagem, internacional, coberturaAssistenciaMedica, possuiPassaporte);
    }
}

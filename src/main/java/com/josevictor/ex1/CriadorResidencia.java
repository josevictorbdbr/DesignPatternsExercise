package com.josevictor.ex1;

public class CriadorResidencia extends Criador{

    private String segurado;
    private double valorImovel;
    private boolean altoPadrao;
    private boolean possuiDocumentoImovel;

    public CriadorResidencia(String segurado, double valorImovel, boolean altoPadrao, boolean possuiDocumentoImovel){
        this.segurado = segurado;
        this.valorImovel = valorImovel;
        this.altoPadrao = altoPadrao;
        this.possuiDocumentoImovel = possuiDocumentoImovel;
    }

    @Override
    protected Apolice criarApolice(){
        return new ApoliceResidencia("RES-",segurado, valorImovel, altoPadrao, possuiDocumentoImovel);
    }
}

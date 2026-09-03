package com.josevictor.ex1;

import java.util.Arrays;
import java.util.List;

public class ApoliceAuto extends Apolice {

    private double valorFipe;
    private int idadeCondutor;
    private int tempoHabilitacao;
    private double coberturaTerceiros;

    public ApoliceAuto(String numero, String segurado, double valorFipe, int idadeCondutor, int tempoHabilitacao, double coberturaTerceiros){
        super(numero, segurado);
        this.valorFipe = valorFipe;
        this.idadeCondutor = idadeCondutor;
        this.tempoHabilitacao = tempoHabilitacao;
        this.coberturaTerceiros = coberturaTerceiros;
    }

    @Override
    public double calcularPremio(){
        double premioAnual = valorFipe * 0.08;

        if (idadeCondutor < 25) {
            premioAnual *= 1.30;
        }
        if (tempoHabilitacao < 2) {
            premioAnual *= 1.20;
        }

        return premioAnual / 12;
    }

    @Override
    public boolean validarCobertura(){
        return coberturaTerceiros >= 50000;
    }

    @Override
    public List<String> listarDocumentos(){
        return Arrays.asList("CNH", "CRLV", "Comprovante de residencia");
    }
}

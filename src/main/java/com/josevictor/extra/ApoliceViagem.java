package com.josevictor.extra;
import java.util.Arrays;
import java.util.List;

public class ApoliceViagem extends Apolice {

    private int diasViagem;
    private boolean internacional;
    private double coberturaAssistenciaMedica;
    private boolean possuiPassaporte;

    public ApoliceViagem(String numero, String segurado, int diasViagem, boolean internacional, double coberturaAssistenciaMedica, boolean possuiPassaporte){
        super(numero, segurado);
        this.diasViagem = diasViagem;
        this.internacional = internacional;
        this.coberturaAssistenciaMedica = coberturaAssistenciaMedica;
        this.possuiPassaporte = possuiPassaporte;
    }

    @Override
    public double calcularPremio(){

        double premio = diasViagem * 15;

        if (internacional) {
            premio += 150;
        }

        return premio;
    }

    @Override
    public boolean validarCobertura(){

        if (internacional) {
            return coberturaAssistenciaMedica >= 50000 && possuiPassaporte;
        }

        return true;
    }

    @Override
    public List<String> listarDocumentos() {

        if (internacional) {
            return Arrays.asList("Itinerario de viagem", "Passaporte");
        }

        return Arrays.asList("Itinerario de viagem");
    }
}

package com.josevictor.ex1;
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
            premio += 100;
        }

        return premio;
    }

    @Override
    public boolean validarCobertura(){

        if (internacional) {
            return coberturaAssistenciaMedica >= 30000 && possuiPassaporte;
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

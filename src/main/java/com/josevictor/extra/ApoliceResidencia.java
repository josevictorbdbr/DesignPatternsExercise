package com.josevictor.extra;
import java.util.Arrays;
import java.util.List;

public class ApoliceResidencia extends Apolice {

    private double valorImovel;
    private boolean altoPadrao;
    private boolean possuiDocumentoImovel;

    public ApoliceResidencia(String numero, String segurado, double valorImovel, boolean altoPadrao, boolean possuiDocumentoImovel){
        super(numero, segurado);
        this.valorImovel = valorImovel;
        this.altoPadrao = altoPadrao;
        this.possuiDocumentoImovel = possuiDocumentoImovel;
    }

    @Override
    public double calcularPremio(){

        double premioAnual = valorImovel * 0.015;

        if (altoPadrao) {
            premioAnual *= 1.25;
        }

        return premioAnual / 12;
    }

    @Override
    public boolean validarCobertura() {
        return possuiDocumentoImovel;
    }

    @Override
    public List<String> listarDocumentos() {
        return Arrays.asList("Escritura ou contrato de locacao", "Comprovante de residencia");
    }
}

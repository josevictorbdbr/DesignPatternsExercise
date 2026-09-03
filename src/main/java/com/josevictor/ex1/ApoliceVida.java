package com.josevictor.ex1;

import java.util.Arrays;
import java.util.List;

public class ApoliceVida extends Apolice{

    private int idade;
    private boolean fumante;
    private double capitalSegurado;
    private boolean possuiAtestado;

    public ApoliceVida(String numero, String segurado, int idade, boolean fumante, double capitalSegurado, boolean possuiAtestado){
            super(numero, segurado);
            this.idade = idade;
            this.fumante = fumante;
            this.capitalSegurado = capitalSegurado;
            this.possuiAtestado = possuiAtestado;
    }


    @Override
    public double calcularPremio() {
        double premio = (idade * 12) + (capitalSegurado * 0.002);

        if (fumante) {
            premio *= 1.50;
        }

        return premio;
    }

    @Override
    public boolean validarCobertura() {
        if (capitalSegurado > 500000) {
            return possuiAtestado;
        }

        return true;
    }

    @Override
    public List<String> listarDocumentos() {
        if (capitalSegurado > 500000) {
            return Arrays.asList("Identidade", "CPF", "Atestado médico");
        }
        return Arrays.asList("Identidade", "CPF");
    }
}

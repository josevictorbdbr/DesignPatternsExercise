package com.josevictor.extra;

import java.time.LocalDate;
import java.util.List;

public abstract class Apolice{

    private static int contador = 1000;
    protected String numero;
    protected String segurado;
    protected LocalDate dataEmissao;

    public Apolice(String prefixo, String segurado) {
        this.numero = prefixo + contador++;
        this.segurado = segurado;
        this.dataEmissao = LocalDate.now();
    }

    public abstract double calcularPremio();
    public abstract boolean validarCobertura();
    public abstract List<String> listarDocumentos();

    public String gerarResumo(){
        return "Numero da apolice: " + numero + "\nSegurado: " + segurado + "\nData de emissão: " + dataEmissao +
                "\nPremio: R$ " + String.format("%.2f", calcularPremio()) + "\nDocumentos exigidos: " + String.join(", ", listarDocumentos());
    }
}

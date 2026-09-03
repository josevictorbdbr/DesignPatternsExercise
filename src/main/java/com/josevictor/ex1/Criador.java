package com.josevictor.ex1;

public abstract class Criador {

    protected abstract Apolice criarApolice();

    public final String processarContratacao(){
        Apolice apolice = criarApolice();

        if (!apolice.validarCobertura()) {
            return "Contratacao rejeitada" + apolice.segurado + ": cobertura ou documentacao não atendida.";
        }

        return apolice.gerarResumo();
    }
}

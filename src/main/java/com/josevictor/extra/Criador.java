package com.josevictor.extra;

import java.util.ArrayList;
import java.util.List;

public abstract class Criador {

    private final List<ObservadorApolice> observadores = new ArrayList<>();
    protected abstract Apolice criarApolice();

    public final String processarContratacao(){
        Apolice apolice = criarApolice();

        if (!apolice.validarCobertura()) {
            return "Contratacao rejeitada" + apolice.segurado + ": cobertura ou documentacao não atendida.";
        }

        for(ObservadorApolice observador : observadores) {
            observador.apoliceContratada(apolice);
        }

        return apolice.gerarResumo();
    }

    public void adicionarObservador(ObservadorApolice observador) {
        observadores.add(observador);
    }
}

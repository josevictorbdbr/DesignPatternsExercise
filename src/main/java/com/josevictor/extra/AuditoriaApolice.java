package com.josevictor.extra;

public class AuditoriaApolice implements ObservadorApolice {
    @Override
    public void apoliceContratada(Apolice apolice) {
        System.out.println("Auditoria: Apólice contratada com sucesso!");
    }
    
}

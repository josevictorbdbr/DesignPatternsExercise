package com.josevictor.extra;

public class NotificadorApolice implements ObservadorApolice {
    @Override
    public void apoliceContratada(Apolice apolice) {
        System.out.println("Notificador: Enviando notificação de apólice contratada.");
    }
    
}

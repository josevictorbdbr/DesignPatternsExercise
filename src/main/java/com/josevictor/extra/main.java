package com.josevictor.extra;

public class main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        Criador auto = new CriadorAuto(
                "Vandercleiton automoveis",
                60000,
                24,
                1,
                80000
        );

        Criador residencial = new CriadorResidencia(
                "Vandercleiton residencias",
                400000,
                true,
                true
        );

        Criador vida = new CriadorVida(
                "Vandercleiton Vida",
                35,
                true,
                300000,
                false
        );

        Criador viagem = new CriadorViagem(
                "Vandercleiton Viagems",
                10,
                true,
                50000,
                true
        );

        viagem.adicionarObservador(new AuditoriaApolice());
        viagem.adicionarObservador(new NotificadorApolice());

        System.out.println("\nApolice auto: ");
        System.out.println(cliente.emitirApolice(auto));

        System.out.println("\nApolice residencia: ");
        System.out.println(cliente.emitirApolice(residencial));

        System.out.println("\napolice vida: ");
        System.out.println(cliente.emitirApolice(vida));

        System.out.println("\napolice viagem: ");
        System.out.println(cliente.emitirApolice(viagem));
    }
}

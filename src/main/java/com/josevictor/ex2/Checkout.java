package com.josevictor.ex2;

import java.util.ArrayList;
import java.util.List;

public class Checkout {
    private FabricaCheckout fabrica;
    private List<ObservadorCheckout> observadores = new ArrayList<>();

    public Checkout(FabricaCheckout fabrica) {
        this.fabrica = fabrica;
    }

    public void adicionarObservador(ObservadorCheckout observador) {
        observadores.add(observador);
    }

    public void finalizarPedido(Pedido pedido) {
        DocumentoFiscal doc = fabrica.criarDocumento();
        Pagamento pag = fabrica.criarPagamento();
        Etiqueta etiq = fabrica.criarEtiqueta();

        doc.gerar(pedido);
        pag.processar(pedido);
        etiq.gerar();

        for (ObservadorCheckout observador : observadores) {
            observador.pedidoFinalizado(pedido);
        }
    }
}

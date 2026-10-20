package com.josevictor.ex2;

public class AuditoriaCheckout implements ObservadorCheckout {
    @Override
    public void pedidoFinalizado(Pedido pedido) {
        System.out.println("Auditoria: pedido de R$ " + pedido.valor + " finalizado.");
    }
}

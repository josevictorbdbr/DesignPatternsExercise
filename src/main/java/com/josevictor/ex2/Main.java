package com.josevictor.ex2;

public class Main{
    public static void main(String[] args){
        Pedido pedidoBR = new Pedido();
        pedidoBR.valor = 100.0;
        pedidoBR.origem = "SP";
        pedidoBR.destino = "RJ";
        pedidoBR.essencial = false;

        Checkout checkoutBrasil = new Checkout(new FabricaBrasil());
        checkoutBrasil.adicionarObservador(new AuditoriaCheckout());
        checkoutBrasil.finalizarPedido(pedidoBR);

        Pedido pedidoEUA = new Pedido();
        pedidoEUA.valor = 200.0;
        pedidoEUA.origem = "NY";
        pedidoEUA.destino = "CA";
        pedidoEUA.essencial = false;

        FabricaEUA fabricaEUA = new FabricaEUA();
        Checkout checkoutEUA = new Checkout(fabricaEUA);
        checkoutEUA.finalizarPedido(pedidoEUA);

        Pedido pedidoAlemanha = new Pedido();
        pedidoAlemanha.valor = 300.0;
        pedidoAlemanha.origem = "Berlin";
        pedidoAlemanha.destino = "Munich";
        pedidoAlemanha.essencial = true;

        FabricaAlemanha fabricaAlemanha = new FabricaAlemanha();
        Checkout checkoutAlemanha = new Checkout(fabricaAlemanha);
        checkoutAlemanha.finalizarPedido(pedidoAlemanha);
    }
}

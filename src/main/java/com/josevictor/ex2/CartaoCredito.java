package com.josevictor.ex2;

public class CartaoCredito implements Pagamento{
    public void processar(Pedido pedido){
        System.out.println("Cartao de credito AVS aprovado. Valor: " + pedido.valor);
    }
}

package com.josevictor.ex2;

public class Pix implements Pagamento{
    public void processar(Pedido pedido){
        double valorComDesconto = pedido.valor * 0.95;
        System.out.println("Pix processado. Valor com desconto: " + valorComDesconto);
    }
}

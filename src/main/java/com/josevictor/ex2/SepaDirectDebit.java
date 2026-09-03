package com.josevictor.ex2;

public class SepaDirectDebit implements Pagamento{
    public void processar(Pedido pedido){
        System.out.println("SEPA Direct Debit processado. Valor: " + pedido.valor);
    }
}

package com.josevictor.ex2;

public class NotaFiscal implements DocumentoFiscal{
    public void gerar(Pedido pedido){
        int icms = 18;
        String cfop = "5.102";
        if(!pedido.origem.equals(pedido.destino)){
            icms = 12;
            cfop = "6.102";
        }
        System.out.println("CFOP: " + cfop + " | ICMS: " + icms + "% | Chave: 11112222333344445555666677778888999900001111");
    }
}

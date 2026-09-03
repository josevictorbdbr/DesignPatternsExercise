package com.josevictor.ex2;

public class SalesInvoice implements DocumentoFiscal{
    public void gerar(Pedido pedido){
        double tax = 0.0;
        if(pedido.destino.equals("CA")){
            tax = 7.25;
        }else if(pedido.destino.equals("TX")){
            tax = 6.25;
        }
        System.out.println("Sales Invoice EIN: 1234567 | Sales Tax: " + tax + "%");
    }
}

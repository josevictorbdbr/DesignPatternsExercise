package com.josevictor.ex2;

public class VATInvoice implements DocumentoFiscal{
    public void gerar(Pedido pedido){
        int vat = 19;
        if(pedido.essencial){
            vat = 7;
        }
        System.out.println("VAT Invoice VAT-ID: DE12345 | Umsatzsteuer: " + vat + "%");
    }
}

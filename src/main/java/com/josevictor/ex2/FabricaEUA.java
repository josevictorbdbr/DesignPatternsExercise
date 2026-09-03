package com.josevictor.ex2;

public class FabricaEUA implements FabricaCheckout{
    public DocumentoFiscal criarDocumento(){
        return new SalesInvoice();
    }
    public Pagamento criarPagamento(){
        return new CartaoCredito();
    }
    public Etiqueta criarEtiqueta(){
        return new USPS();
    }
}

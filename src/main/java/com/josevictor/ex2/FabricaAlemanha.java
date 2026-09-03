package com.josevictor.ex2;

public class FabricaAlemanha implements FabricaCheckout{
    public DocumentoFiscal criarDocumento(){
        return new VATInvoice();
    }
    public Pagamento criarPagamento(){
        return new SepaDirectDebit();
    }
    public Etiqueta criarEtiqueta(){
        return new DeutschePost();
    }
}
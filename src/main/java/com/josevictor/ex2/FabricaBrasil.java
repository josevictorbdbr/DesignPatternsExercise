package com.josevictor.ex2;

public class FabricaBrasil implements FabricaCheckout{
    public DocumentoFiscal criarDocumento(){
        return new NotaFiscal();
    }
    public Pagamento criarPagamento(){
        return new Pix();
    }
    public Etiqueta criarEtiqueta(){
        return new Correios();
    }
}

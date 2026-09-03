package com.josevictor.ex2;

public class Checkout{
    private FabricaCheckout Fabrica;

    public Checkout(FabricaCheckout Fabrica){
        this.Fabrica = Fabrica;
    }

    public void finalizarPedido(Pedido pedido){
        DocumentoFiscal doc = Fabrica.criarDocumento();
        Pagamento pag = Fabrica.criarPagamento();
        Etiqueta etiq = Fabrica.criarEtiqueta();
        doc.gerar(pedido);
        pag.processar(pedido);
        etiq.gerar();
    }
}

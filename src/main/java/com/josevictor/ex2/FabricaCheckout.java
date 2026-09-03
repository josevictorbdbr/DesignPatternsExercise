package com.josevictor.ex2;

public interface FabricaCheckout{
    DocumentoFiscal criarDocumento();
    Pagamento criarPagamento();
    Etiqueta criarEtiqueta();
}

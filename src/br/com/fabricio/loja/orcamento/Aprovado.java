package br.com.fabricio.loja.orcamento;

import java.math.BigDecimal;

public class Aprovado extends  SituacaoOrcamento{
    public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.02"));
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}

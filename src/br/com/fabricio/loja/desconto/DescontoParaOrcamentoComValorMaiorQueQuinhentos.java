package br.com.fabricio.loja.desconto;

import br.com.fabricio.loja.Orcamento;

import java.math.BigDecimal;

public class DescontoParaOrcamentoComValorMaiorQueQuinhentos extends Desconto {
    public DescontoParaOrcamentoComValorMaiorQueQuinhentos(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    public boolean deveAlicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 1;
    }
}

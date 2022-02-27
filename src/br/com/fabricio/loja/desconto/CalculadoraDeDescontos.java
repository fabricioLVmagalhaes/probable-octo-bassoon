package br.com.fabricio.loja.desconto;

import br.com.fabricio.loja.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {
    public BigDecimal calcular(Orcamento orcamento) {
        BigDecimal desconto = new DescontoParaOrcamentoComMaisDeCincoItens(
                new DescontoParaOrcamentoComValorMaiorQueQuinhentos(new SemDesconto())
        ).calcular(orcamento);
        return desconto;
    }
}

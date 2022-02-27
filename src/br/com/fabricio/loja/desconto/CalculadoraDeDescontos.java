package br.com.fabricio.loja.desconto;

import br.com.fabricio.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {
    public BigDecimal calcular(Orcamento orcamento) {
        BigDecimal cadeiaDeDescontos = new DescontoParaOrcamentoComMaisDeCincoItens(
                new DescontoParaOrcamentoComValorMaiorQueQuinhentos(new SemDesconto())
        ).efetuarCalcular(orcamento);
        return cadeiaDeDescontos;
    }
}

package br.com.fabricio.loja.imposto;

import br.com.fabricio.loja.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    public BigDecimal calcular(Orcamento orcamento);
}

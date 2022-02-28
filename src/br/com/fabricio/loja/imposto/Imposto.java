package br.com.fabricio.loja.imposto;

import br.com.fabricio.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Imposto {

    private Imposto outro;

    public Imposto(Imposto outro) {
        this.outro = outro;
    }

    protected abstract BigDecimal realiarCalculo(Orcamento orcamento);

    public BigDecimal calcular(Orcamento orcamento) {

        BigDecimal valorImposto = realiarCalculo(orcamento);
        BigDecimal valorDoOutorInposto = outro == null ? BigDecimal.ZERO : outro.realiarCalculo(orcamento);

        return valorImposto.add(valorDoOutorInposto);
    }
}

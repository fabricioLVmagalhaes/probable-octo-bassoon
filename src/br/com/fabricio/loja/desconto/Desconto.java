package br.com.fabricio.loja.desconto;

import br.com.fabricio.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }
    public BigDecimal calcular(Orcamento orcamento) {
        if (deveAlicar(orcamento)){
            return efetuarCalcular(orcamento);
        }
        return proximo.calcular(orcamento);
    }
    protected abstract BigDecimal efetuarCalcular(Orcamento orcamento);
    protected abstract boolean deveAlicar(Orcamento orcamento);
}

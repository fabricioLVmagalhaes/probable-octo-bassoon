package br.com.fabricio.loja.desconto;

import br.com.fabricio.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto{
    public SemDesconto() {
        super(null);
    }

    public BigDecimal efetuarCalcular(Orcamento orcamento) {

        return BigDecimal.ZERO;
    }

    @Override
    public boolean deveAlicar(Orcamento orcamento) {
        return true;
    }
}

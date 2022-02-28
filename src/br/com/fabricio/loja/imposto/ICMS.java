package br.com.fabricio.loja.imposto;

import br.com.fabricio.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ICMS extends Imposto {

    public ICMS() {
        super(null);
    }

    public ICMS(Imposto outro) {
        super(outro);
    }

    @Override
    public BigDecimal realiarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}

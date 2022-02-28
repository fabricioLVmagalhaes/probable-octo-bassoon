package br.com.fabricio.loja.imposto;

import br.com.fabricio.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS extends Imposto {

    public ISS() {
        super(null);
    }

    public ISS(Imposto outro) {
        super(outro);
    }

    public BigDecimal realiarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}

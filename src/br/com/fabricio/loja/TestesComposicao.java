package br.com.fabricio.loja;

import br.com.fabricio.loja.orcamento.ItemOrcamento;
import br.com.fabricio.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesComposicao {
    public static void main(String[] args) {
        Orcamento antigo = new Orcamento();
        antigo.adicionarIem(new ItemOrcamento(new BigDecimal("200")));
        antigo.reprovar();

        Orcamento novo = new Orcamento();
        novo.adicionarIem(new ItemOrcamento(new BigDecimal("500")));
        novo.adicionarIem(antigo);

        System.out.println(novo.getValor());

    }
}

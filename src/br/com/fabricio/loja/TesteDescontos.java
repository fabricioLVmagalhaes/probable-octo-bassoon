package br.com.fabricio.loja;

import br.com.fabricio.loja.desconto.CalculadoraDeDescontos;
import br.com.fabricio.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDescontos {
    public static void main(String[] args) {
        Orcamento orcamentoPrimeiro = new Orcamento(new BigDecimal("200"),6);
        Orcamento orcamentoSegundo = new Orcamento(new BigDecimal("1000"),1);
        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.calcular(orcamentoPrimeiro));
        System.out.println(calculadora.calcular(orcamentoSegundo));

    }
}

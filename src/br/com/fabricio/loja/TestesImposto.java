package br.com.fabricio.loja;

import br.com.fabricio.loja.imposto.CalculadoraDeImpostos;
import br.com.fabricio.loja.imposto.ICMS;
import br.com.fabricio.loja.imposto.ISS;
import br.com.fabricio.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImposto {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();

        System.out.println(calculadora.calcular(orcamento, new ISS(new ICMS())));
    }
}

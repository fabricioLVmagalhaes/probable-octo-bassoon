package br.com.fabricio.loja;

import br.com.fabricio.loja.http.JavaHttpClient;
import br.com.fabricio.loja.orcamento.Orcamento;
import br.com.fabricio.loja.orcamento.RegistroDeOrcamento;

import java.math.BigDecimal;

public class TestesAdapter {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());
        registro.registrar(orcamento);
    }

}

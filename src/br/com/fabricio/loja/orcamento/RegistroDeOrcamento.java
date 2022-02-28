package br.com.fabricio.loja.orcamento;

import br.com.fabricio.loja.DomainException;
import br.com.fabricio.loja.http.HttpAdapter;

import java.util.Map;

public class RegistroDeOrcamento {

    private HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento) {
        if (orcamento.isNotFinalizado()) {
            throw new DomainException("Orcamento nao finalizado!");
        }
        String url = "htt://api.externa/orcamento";
        Map<String, Object> dados =
                Map.of("valor", orcamento.getValor(), "quantidadeDeItens", orcamento.getQuantidadeItens());
        http.post(url, dados);
    }
}

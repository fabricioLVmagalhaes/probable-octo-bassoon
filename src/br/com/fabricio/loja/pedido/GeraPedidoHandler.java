package br.com.fabricio.loja.pedido;

import br.com.fabricio.loja.orcamento.Orcamento;

import java.time.LocalDateTime;

public class GeraPedidoHandler {
    //construtor com injecao de dependencias

    public void execute(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeDeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        System.out.println("Salvar pedido no banco de dados");
        System.out.println("Enviar email com dados do novo pedido");
    }
}

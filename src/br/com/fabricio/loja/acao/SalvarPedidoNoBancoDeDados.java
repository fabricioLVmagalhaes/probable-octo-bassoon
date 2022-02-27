package br.com.fabricio.loja.acao;

import br.com.fabricio.loja.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido {
    public void executarAcao(Pedido pedido) {
        System.out.println("Salvando pedidos no banco de dados");
    }
}

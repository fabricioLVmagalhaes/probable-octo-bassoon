package br.com.fabricio.loja.acao;

import br.com.fabricio.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido{
    public void executarAcao(Pedido pedido) {
        System.out.println("Enviando email com dados do pedido");
    }
}

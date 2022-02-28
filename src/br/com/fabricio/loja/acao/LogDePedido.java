package br.com.fabricio.loja.acao;

import br.com.fabricio.loja.pedido.Pedido;

public class LogDePedido implements AcaoAposGerarPedido{
    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Pedido foi geradoL " + pedido);
    }
}

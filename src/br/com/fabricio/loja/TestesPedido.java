package br.com.fabricio.loja;

import br.com.fabricio.loja.pedido.GeraPedido;
import br.com.fabricio.loja.pedido.GeraPedidoHandler;

import java.math.BigDecimal;

public class TestesPedido {
    public static void main(String[] args) {
        String ciente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int quantidadeDeIntes = Integer.parseInt(args[2]);

        GeraPedido gerador = new GeraPedido(ciente, valorOrcamento, quantidadeDeIntes);
        GeraPedidoHandler handler = new GeraPedidoHandler(/*dependencias*/);
        handler.execute(gerador);
    }
}

package br.com.fabricio.loja.orcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Orcamento implements Orcavel {
    private BigDecimal valor;
    private SituacaoOrcamento situacao;
    private List<Orcavel> itens;

    public Orcamento() {
        this.valor = BigDecimal.ZERO;
        this.itens = new ArrayList<>();
        this.situacao = new EmAnalise();
    }

    public Orcamento(BigDecimal valor, int quantidade) {
        this();
        for (int i = 0; i < quantidade; i++) {
            var item = new ItemOrcamento(valor);
            this.adicionarIem(item);
        }
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDescontoExtra = this.situacao.calcularDescontoExtra(this);


        this.valor = this.valor.subtract(valorDescontoExtra);
    }

    public void aprovar() {
        this.situacao.aprovar(this);
    }

    public void reprovar() {
        this.situacao.reprovar(this);
    }

    public void finalizar() {
        this.situacao.finalizar(this);
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidadeItens() {
        return itens.size();
    }

    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }

    public boolean isNotFinalizado() {
        return !(situacao instanceof Finalizado);
    }

    public void adicionarIem(Orcavel item) {
        this.valor = valor.add(item.getValor());
        this.itens.add(item);
    }
}

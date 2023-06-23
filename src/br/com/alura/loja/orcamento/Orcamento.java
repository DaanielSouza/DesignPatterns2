package br.com.alura.loja.orcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.loja.orcamento.situacao.EmAnalise;
import br.com.alura.loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento implements Orcavel {

  private BigDecimal valor = BigDecimal.ZERO;
  private SituacaoOrcamento situacao = new EmAnalise();
  private List<Orcavel> itens = new ArrayList<Orcavel>();

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
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    return valor;
  }

  public int getQuantidadeItens() {
    return this.itens.size();
  }

  public SituacaoOrcamento getSituacao() {
    return situacao;
  }

  public void setSituacao(SituacaoOrcamento situacao) {
    this.situacao = situacao;
  }

  public void addItem(Orcavel item) {
    this.itens.add(item);
    this.valor = this.valor.add(item.getValor());
  }

  public void addItens(List<Orcavel> itens) {
    itens.forEach(e -> {
      this.addItem(e);
      this.valor = this.valor.add(e.getValor());
    });
  }
}

package br.com.alura.loja;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesComposicao {

  public static void main(String[] args) {
    Orcamento antigo = new Orcamento();
    antigo.addItem(new ItemOrcamento("Teste", BigDecimal.TEN));
    antigo.reprovar();

    Orcamento novo = new Orcamento();
    novo.addItem(new ItemOrcamento("Teste", BigDecimal.TEN));
    novo.addItem(antigo);

    System.out.println(novo.getValor());
  }
}

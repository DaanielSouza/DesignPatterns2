package br.com.alura.loja;

import br.com.alura.loja.http.JavaHttpClient;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.orcamento.RegistroDeOrcamento;

import java.math.BigDecimal;

public class TestesAdapter {
  public static void main(String[] args) {
    Orcamento orcamento = new Orcamento();
    orcamento.addItem(new ItemOrcamento("Teste", BigDecimal.ONE));
    orcamento.aprovar();
    orcamento.finalizar();

    RegistroDeOrcamento registroDeOrcamento = new RegistroDeOrcamento(new JavaHttpClient());
  }
}

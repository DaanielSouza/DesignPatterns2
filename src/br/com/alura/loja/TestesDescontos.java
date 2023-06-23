package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.desconto.CalculadoraDeDescontos;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesDescontos {

  public static void main(String[] args) {
    Orcamento primeiro = new Orcamento();
    primeiro.addItem(new ItemOrcamento("Teste", new BigDecimal("200")));
    Orcamento segundo = new Orcamento();
    segundo.addItem(new ItemOrcamento("Teste", new BigDecimal("1000")));
    Orcamento terceiro = new Orcamento();
    terceiro.addItem(new ItemOrcamento("Teste", new BigDecimal("500")));

    CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
    System.out.println(calculadora.calcular(primeiro));
    System.out.println(calculadora.calcular(segundo));
    System.out.println(calculadora.calcular(terceiro));
  }

}

package br.com.alura.loja.orcamento;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public class ItemOrcamento implements Orcavel {
  private String nome;
  private BigDecimal valor;
}

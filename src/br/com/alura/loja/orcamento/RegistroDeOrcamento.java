package br.com.alura.loja.orcamento;

import br.com.alura.loja.DomainException;
import br.com.alura.loja.http.HttpAdapter;
import br.com.alura.loja.orcamento.situacao.Finalizado;
import br.com.alura.loja.orcamento.situacao.SituacaoOrcamento;

import java.util.Map;

public class RegistroDeOrcamento {

  private final HttpAdapter httpAdapter;

  public RegistroDeOrcamento(HttpAdapter httpAdapter) {
    this.httpAdapter = httpAdapter;
  }

  public void registrar(Orcamento orcamento) {
    if (isNotFinalizado(orcamento.getSituacao()))
      throw new DomainException("Status finalizado!");

    String url = "http://testes/orcamento";
    Map<String, Object> dados = Map.of(
        "valor", orcamento.getValor(),
        "quantidadeItens", orcamento.getQuantidadeItens()
    );
    httpAdapter.post(url, dados);
  }

  public boolean isNotFinalizado(SituacaoOrcamento situacao) {
    return !(situacao instanceof Finalizado);
  }
}

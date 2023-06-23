package br.com.alura.loja.http;

import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter {
  @Override
  public void post(String url, Map<String, Object> dados) {
    try {
      URL urlApi = new URL(url);
      URLConnection urlConnection = urlApi.openConnection();
      urlConnection.connect();
    } catch (Exception e) {
      throw new RuntimeException("Erro de requisicao!");
    }

  }
}

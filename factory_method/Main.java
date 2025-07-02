public class Main {
  public static void main(String[] args) {
    Logistica logistica_marinha = new LogisticaMarinha();
    Logistica logistica_rodoviaria = new LogisticaRodoviaria();
    Transporte transporte = logistica_marinha.criarLogistica();
    transporte.enviar();
    transporte = logistica_rodoviaria.criarLogistica();
    transporte.enviar();
  }
}
public class LogisticaRodoviaria implements Logistica {

  @Override
  public Transporte criarLogistica() {
    return new TransporteRodoviario();
  }

}

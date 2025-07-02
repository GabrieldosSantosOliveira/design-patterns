public class LogisticaMarinha implements Logistica {

  @Override
  public Transporte criarLogistica() {
    return new TransporteMarinho();
  }

}

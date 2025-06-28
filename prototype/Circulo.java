public class Circulo implements Prototype {
  private double raio;

  public Circulo() {
  }

  public Circulo(int raio) {
    this.raio = raio;
  }

  public Circulo(final Circulo circulo) {
    if (circulo != null)
      this.raio = circulo.raio;
  }

  public Circulo clone() {
    return new Circulo(this);
  }

  public void setRaio(double raio) {
    this.raio = raio;
  }

  @Override
  public String toString() {
    return "Circulo [raio=" + raio + "]";
  }
}

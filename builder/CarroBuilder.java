public class CarroBuilder {
  private Carro carro = null;

  public CarroBuilder() {
    this.carro = new Carro();
  }

  public CarroBuilder setCor(String cor) {
    this.carro.setCor(cor);
    return this;
  }

  public CarroBuilder setMarca(String marca) {
    this.carro.setMarca(marca);
    return this;

  }

  public CarroBuilder setModelo(String modelo) {
    this.carro.setModelo(modelo);
    return this;

  }

  public CarroBuilder setTipo_de_motor(String tipo_de_motor) {
    this.carro.setTipo_de_motor(tipo_de_motor);
    return this;

  }

  public CarroBuilder setAro_roda(String aro_roda) {

    this.carro.setAro_roda(aro_roda);
    return this;
  }

  public Carro build() {
    return this.carro;
  }
}

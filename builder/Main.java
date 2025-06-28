public class Main {
  public static void main(String[] args) {
    Carro carro = new Carro("vermelha", "Fiat", "Fastback", "combustão", "18");
    CarroBuilder carbuilder = new CarroBuilder();
    Carro carro2 = carbuilder.setAro_roda("18")
        .setTipo_de_motor("Combustão")
        .setModelo("FastBack")
        .setMarca("Fiat")
        .setCor("vermelha")
        .build();
    System.out.println(carro);
    System.out.println(carro2);

  }
}

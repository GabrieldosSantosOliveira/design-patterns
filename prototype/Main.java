public class Main{
  public static void main(String[] args) {
    Circulo circulo = new Circulo(10);
    Circulo circulo2 = circulo.clone();
    circulo.setRaio(2);
    System.out.println(circulo);
    System.out.println(circulo2);
  }
}
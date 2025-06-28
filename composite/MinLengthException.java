public class MinLengthException extends Exception {
  public MinLengthException(int n) {
    super("O texto tem menos de " + n + " caracteres");
  }
}

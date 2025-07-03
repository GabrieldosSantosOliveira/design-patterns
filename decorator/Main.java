public class Main {
  public static void main(String[] args) {
    EncryptionDecorator encryptionDecorator = new EncryptionDecorator(new FileDataSource("arquivo.txt"));
    encryptionDecorator.writeData("Bom dia");
    String message = encryptionDecorator.readData();
    System.out.println(message);
  }
}
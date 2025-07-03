public class Main {
  public static void main(String[] args) {
    Database database = new DatabaseProxy(new DatabaseImpl());
    database.connect();
  }
}
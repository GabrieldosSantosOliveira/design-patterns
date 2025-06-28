public class Main {
  public static void main(String[] args) {
    Database database = Database.connect();
    Database database1 = Database.connect();
    Database database3 = Database.connect();

    System.out.println(database);
    System.out.println(database1);
    System.out.println(database3);
  }
}

import java.time.LocalDateTime;

public class DatabaseProxy implements Database {
  private Database database = null;

  public DatabaseProxy(Database database) {
    this.database = database;
  }

  @Override
  public void connect() {
    System.out.println("Realizado a conecção ao banco de dados " + LocalDateTime.now().toString());
    this.database.connect();
    System.out.println("Terminado a conecção ao banco de dados " + LocalDateTime.now().toString());
  }
}

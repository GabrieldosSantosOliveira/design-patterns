public class Database {
  private static Database _instance = null;

  private Database() {
    System.out.println("Iniciado a conecção");
  }

  public static Database connect() {
    if (_instance == null) {
      _instance = new Database();
    }
    return _instance;
  }


}

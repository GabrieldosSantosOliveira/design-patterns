public class Main {
  public static void main(String[] args) {
    Storage storageMap = new StorageHashMap();
    storageMap.setItem("bom", "anao");
    System.out.println(storageMap.getItem("bom"));
  }
}
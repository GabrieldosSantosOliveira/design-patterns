public class Main {
  public static void main(String[] args) {
    List<Integer> linkedList = new LinkedList<>();
    linkedList.add(1);
    linkedList.add(2);
    linkedList.add(3);
    linkedList.add(4);
    while (linkedList.hasNext()) {
      System.out.println(linkedList.getNext());
    }
    linkedList.reset();
    linkedList.clear();
    linkedList.add(5);
    linkedList.add(3);
    linkedList.add(2);
    linkedList.add(1);
    while (linkedList.hasNext()) {
      System.out.println(linkedList.getNext());
    }

  }
}

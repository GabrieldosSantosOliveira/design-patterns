public class Display implements Subscriber {

  @Override
  public void updateSubscribe(long temperatura) {
    System.out.println(temperatura);
  }

}

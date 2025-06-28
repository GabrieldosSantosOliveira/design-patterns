public interface Publisher {
  public void subscribe(Subscriber subscriber);

  public void removeSubscriber(Subscriber subscriber);
  public void notifySubscribers();
}

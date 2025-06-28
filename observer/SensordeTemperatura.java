import java.util.ArrayList;
import java.util.List;

public class SensordeTemperatura implements Publisher {
  private List<Subscriber> subscribers = new ArrayList<>();
  private long temperatura;

  public SensordeTemperatura(long temperatura) {
    this.temperatura = temperatura;

  }

  public void aumentarTemperatura() {
    temperatura++;
    notifySubscribers();
  }

  public void diminuirTemperatura() {
    temperatura--;
    notifySubscribers();
  }

  @Override
  public void subscribe(Subscriber subscriber) {
    subscribers.add(subscriber);
  }

  @Override
  public void removeSubscriber(Subscriber subscriber) {
    subscribers.remove(subscriber);
  }

  @Override
  public void notifySubscribers() {
    for (Subscriber subscriber2 : subscribers) {
      subscriber2.updateSubscribe(temperatura);
    }
  }
}

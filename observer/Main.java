public class Main {
  public static void main(String[] args) {
    SensordeTemperatura sensordeTemperatura = new SensordeTemperatura(10);
    sensordeTemperatura.subscribe(new Display());
    sensordeTemperatura.aumentarTemperatura();
    sensordeTemperatura.aumentarTemperatura();
    sensordeTemperatura.diminuirTemperatura();
    sensordeTemperatura.diminuirTemperatura();
    sensordeTemperatura.diminuirTemperatura();
    sensordeTemperatura.aumentarTemperatura();
    sensordeTemperatura.aumentarTemperatura();
    sensordeTemperatura.aumentarTemperatura();
    sensordeTemperatura.aumentarTemperatura();
  }
}

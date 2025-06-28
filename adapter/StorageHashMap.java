import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class StorageHashMap implements Storage {
  private Map<String, String> map = new HashMap<>();

  @Override
  public void setItem(String key, String value) {
    map.put(key, value);
  }

  @Override
  public Optional<String> getItem(String key) {
    String value = map.get(key);
    if (value == null) {
      return Optional.empty();
    }
    return Optional.of(value);
  }

  @Override
  public void removeItem(String key) {
    map.remove(key);
  }
}

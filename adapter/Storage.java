import java.util.Optional;

public interface Storage {
  void setItem(String key, String value);

  Optional<String> getItem(String key);

  void removeItem(String key);
}

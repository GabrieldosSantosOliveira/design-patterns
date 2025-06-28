import java.util.Optional;

public interface Validation {
  public Optional<Exception> validate(String name);
}
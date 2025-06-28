import java.util.Optional;

public class MinLengthValidation implements Validation {
  private int min;

  public MinLengthValidation(int min) {
    this.min = min;
  }

  @Override
  public Optional<Exception> validate(String name) {
    if (name.length() < min) {
      return Optional.of(new MinLengthException(min));
    }
    return Optional.empty();
  }

}
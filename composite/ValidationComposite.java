import java.util.List;
import java.util.Optional;

public class ValidationComposite implements Validation {
  private List<Validation> validations = null;;

  public ValidationComposite(List<Validation> validations) {
    this.validations = validations;
  }

  @Override
  public Optional<Exception> validate(String name) {
    for (Validation validation : validations) {
      Optional<Exception> exception = validation.validate(name);
      if (exception.isPresent()) {
        return exception;
      }
    }
    return Optional.empty();
  }

}

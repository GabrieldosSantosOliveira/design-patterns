import java.util.Optional;
import java.util.regex.Pattern;

public class EmailValidation implements Validation {
  private String regex = "^(?!\\.)(?!.*\\.\\.)([A-Za-z0-9_'+\\-\\.]*[A-Za-z0-9_+\\-])@([A-Za-z0-9][A-Za-z0-9\\-]*\\.)+[A-Za-z]{2,}$";

  @Override
  public Optional<Exception> validate(String name) {
    if (Pattern.matches(regex, name)) {
      return Optional.empty();
    }
    return Optional.of(new EmailError());
  }

}

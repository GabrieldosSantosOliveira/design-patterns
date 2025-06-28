import java.util.ArrayList;
import java.util.List;

public class ValidationBuilder {
  private List<Validation> validations;

  public ValidationBuilder() {
    this.validations = new ArrayList<>();
  }

  public ValidationBuilder setValidation(Validation validation) {
    this.validations.add(validation);
    return this;
  }

  public ValidationComposite build() {
    return new ValidationComposite(validations);
  }
}

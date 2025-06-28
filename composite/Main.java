import java.util.Optional;

public class Main {
  public static void main(String[] args) {
    EmailValidation emailValidation = new EmailValidation();
    MinLengthValidation minLengthValidation = new MinLengthValidation(12);
    ValidationComposite validationComposite = new ValidationBuilder()
        .setValidation(minLengthValidation)
        .setValidation(emailValidation)
        .build();
    Optional<Exception> a = validationComposite.validate("bom dia");
    Optional<Exception> b = validationComposite.validate("qualquer_coisa_acordou_do_sono");
    Optional<Exception> c = validationComposite.validate("renata_malvada@gmail.com");
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);

  }
}

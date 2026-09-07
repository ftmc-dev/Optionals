import java.util.Optional;

public class Exercise5 {
    public static void main(String[] args) {
        Optional<String> email = Optional.of("alice@mail.com");
        Optional<String> emailVide = Optional.empty();

        if (email.isPresent()) {
            System.out.println("Email");
        }

        emailVide.ifPresentOrElse(
                (vide) -> System.out.println("Email: " + emailVide),
                () -> System.out.println("Aucun email reseigne"));
    }
}

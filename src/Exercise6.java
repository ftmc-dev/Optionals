import java.util.Optional;

public class Exercise6 {
    public static void main(String[] args) {
        Optional<String> nom = Optional.of("java");

        nom.map(String::toUpperCase);


        Optional<String> vide = Optional.empty();
        Optional<String> reultatVide = null;
        System.out.println(reultatVide.orElse(" (vide) "));
    }
}

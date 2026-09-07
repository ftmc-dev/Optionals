import java.util.Optional;

public class Exercise1 {
    public static void main(String[] args) {
        String prenom = "Alice";
        String nomFamille = null;

        Optional<String> prenomnom = Optional.of(prenom);

        Optional<String> optPrenom = null;

        Optional<String> nomFamiile = Optional.ofNullable(nomFamille);

        Optional<String> optNom = null;

        Optional<String> optVide = Optional.empty();

        System.out.println(prenom);
        System.out.println(nomFamille);
        System.out.println(optVide);

    }
}

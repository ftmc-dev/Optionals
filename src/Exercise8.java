import java.util.Optional;

public class Exercise8 {

    static String afficherVille(Adresse adresse) {
        if (adresse != null) {
            String ville = adresse.getVille();
            if (ville != null) {
            return ville.toUpperCase();
            }
        }
        String ville = Optional.ofNullable(adresse).map(Adresse::getVille).orElse("Ville Iconnue");
        
        return "VILLE INCONNUE";
        
    }

    static class Adresse {
        private String ville;

        Adresse(String ville) {
            this.ville = ville;
        }

        String getVille() {
            return ville;
        }
    }

    public static void main(String[] args) {

        System.out.println(afficherVille(new Adresse("Paris")));
        System.out.println(afficherVille(new Adresse(null)));
        System.out.println(afficherVille(null));
    }
}




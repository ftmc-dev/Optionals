import java.util.Optional;

public class Exercise3 {
    public static void main(String[] args) {
        Optional<String> pseudo = Optional.of("dev_java");
        
        if(pseudo.isPresent()) {
            System.out.println(pseudo.get());
        }
        if(pseudo.isEmpty()) {
            System.out.println(pseudo.orElse("anonyme"));
        }
        
        String resultat1 = null;
        
        Optional<String> calculerPseudocodeParDefaut = Optional.ofNullable("dev_java");
        System.out.println(calculerPseudocodeParDefaut.orElseGet(()->"pseudo"));
        
        String resultat2 = null;

        System.out.println(resultat2);
        System.out.println(resultat1);
    }
    
    static String calculerPseudocodeParDefaut() {
        System.out.println("Calcul du pseudocode par defaut (couteux) ....");
        return "anonyme";
    }
}

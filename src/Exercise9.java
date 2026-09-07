import java.util.Optional;

public class Exercise9 {
    static class Utilisateur {
        private Optional<String> surnom;

        Utilisateur(String surnom) {
            this.surnom = Optional.ofNullable(surnom);
        }
    }

    static class Utilisateurs {
        private String surnom;

        public  Utilisateurs(String surnom) {
            this.surnom = surnom;
        }

        public Optional<String> getSurnom(){
            return Optional.ofNullable(surnom);
        }
    }

}

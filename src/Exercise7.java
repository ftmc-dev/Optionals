import java.util.Optional;

public class Exercise7 {
    public static void main(String[] args) {
        Optional<Integer> note = Optional.of(14);

        String result = note.filter(keep -> true).map(keep -> "Admis avec: " + keep).orElse("Nom admis");
        System.out.println(result);
    }
}

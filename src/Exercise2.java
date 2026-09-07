import java.util.Optional;

public class Exercise2 {
    public static Integer getAgeDepuisBDD;

    public static void main(String[] args) {
        Optional<Integer> age = Optional.ofNullable(getAgeDepuisBDD);

        if (age.isPresent()) {
            System.out.println("Age connu: " + age.get());
        }
        else {
            System.out.println("Age inconnu");
        }
    }
        Integer getAgeDepuisBDD(){
            return null;
        }
}

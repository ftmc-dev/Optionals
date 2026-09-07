import java.util.Optional;

public class CreatingOptionals {
    static String name = "Fosso Mirenda";
    int age;

    static Optional<String> myName = Optional.of(name);

    static Optional<String> empty = Optional.empty();

    Optional<Integer> nulls = Optional.ofNullable(age);

    static String value = empty.get();

    public static  void main(String[] args) {

        System.out.println(value);
        System.out.println(myName.get());
    }

}

import java.util.Optional;
public class Username {
    String name;

    public Username(String name) {
        this.name = name;
    }

    public String getUsername(String name) {
        Optional<String> username = Optional.ofNullable(name);
        username.orElse("Guest");
        return name;
    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    PrimaryClass primaryClass = new PrimaryClass();

    if (primaryClass.getMaster() == null) {
        System.out.println("There is no supervisor for this primary class");
    }else {

        System.out.println(primaryClass.getMaster().getName());
    }
}


public static class PrimaryClass {
    Supervisor master;

    public Supervisor getMaster() {
        return master;
    }

    public void setMaster(Supervisor master) {
        this.master = master;
    }
}

public static class Supervisor {
    String name = "Fosso Mirenda";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
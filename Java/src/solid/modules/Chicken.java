package solid.modules;

public class Chicken extends Animal {
    public Chicken(String name) {
        super();
        this.setName(name);
        this.setKind("Chicken");
    }

    @Override
    public String makeSound() {
        return "Cluck";
    }

}

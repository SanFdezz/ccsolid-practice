package solid.modules;

public class Chicken extends Animal {
    public Chicken(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Cluck";
    }

}

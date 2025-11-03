package solid.modules;

import solid.interfaces.WithTeeths;

public class Cat extends Animal implements WithTeeths {
    public Cat(String name) {
        super();
        this.setName(name);
        this.setKind("Cat");
    }

    @Override
    public String makeSound() {
        return "Meaw";
    }

    @Override
    public int numberOfTeeths() {
        return 24;
    }

    @Override
    public String toString() {
        return super.toString()+" and has "+numberOfTeeths()+" teeths";
    }
}

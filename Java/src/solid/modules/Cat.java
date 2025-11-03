package solid.modules;

import solid.interfaces.WithTeeths;

public class Cat extends Animal implements WithTeeths {
    public Cat(String name) {
            super(name);
        }

    @Override
    public String makeSound() {
        return "Meaw";
    }

    @Override
    public int numberOfTeeths() {
        return 24;
    }
}

package solid.modules;

import solid.interfaces.WithTeeths;

public class Dog extends Animal implements WithTeeths {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Woof! Woof!";
    }

    @Override
    public int numberOfTeeths() {
        return 30;
    }
}

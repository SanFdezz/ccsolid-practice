package solid.modules;

import solid.interfaces.WithTeeths;

public class Dog extends Animal implements WithTeeths {
    public Dog(String name) {
        super();
        this.setName(name);
        this.setKind("Dog");
    }

    @Override
    public String makeSound() {
        return "Woof! Woof!";
    }

    @Override
    public int numberOfTeeths() {
        return 30;
    }

    @Override
    public String toString() {
        return super.toString()+" and has "+numberOfTeeths()+" teeths";
    }
}

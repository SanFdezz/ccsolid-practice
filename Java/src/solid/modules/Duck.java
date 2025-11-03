package solid.modules;

import solid.interfaces.Flying;

public class Duck extends Animal implements Flying {

    public Duck(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Quack";
    }

    @Override
    public int flightDistance() {
        return 5000;
    }


}

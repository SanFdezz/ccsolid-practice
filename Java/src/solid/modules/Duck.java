package solid.modules;

import solid.interfaces.Flying;

public class Duck extends Animal implements Flying {

    public Duck(String name) {
        super();
        this.setName(name);
        this.setKind("Duck");
    }

    @Override
    public String makeSound() {
        return "Quack";
    }

    @Override
    public int flightDistance() {
        return 5000;
    }

    @Override
    public String toString() {
        return super.toString()+" and has a flight distance of "+flightDistance();
    }
}

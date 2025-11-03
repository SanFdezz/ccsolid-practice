package solid.modules;

public abstract class Animal {

    private String name;
    private String kind;

    public Animal() {}

    public String getName() {
        return this.name;
    }

    public String getKind() {
        return this.kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String makeSound();

    @Override
    public String toString() {
        return "The animal is a "+getKind()+", called "+getName()+" that makes this sound: "+makeSound();
    }

}

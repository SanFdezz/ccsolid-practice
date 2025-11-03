package solid.modules;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract String makeSound();

    /* public static void animalSound(String animalName, String type) {
        Animal animal = new Animal(animalName);
        String sound = animal.makeSound(type);
        String name = animal.getName();

        System.out.println("El sonido que hace " + name + " es " + sound);
    }

    public static void animalTeeths(String animalName, String type) {
        Animal animal = new Animal(animalName);
        int totalTeeth = animal.getNumberOfTeeths(type);
        String name = animal.getName();

        System.out.println(name + " tiene " + totalTeeth + " dientes");
    }

    public static void animalflightDistance(String animalName, String type) {
        Animal animal = new Animal(animalName);
        int flightMeters = animal.flightDistance(type);
        String name = animal.getName();

        System.out.println(name + " puede volar " + flightMeters + " metros");
    } */

}

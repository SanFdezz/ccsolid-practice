import cleancode.Calculadora;
import cleancode.Operation;
import solid.modules.*;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Katty");
        System.out.println(cat1.toString());
        Dog dog1 = new Dog("Bull");
        System.out.println(dog1.toString());
        Chicken chicken1 = new Chicken("Chicken");
        System.out.println(chicken1.toString());
        Duck duck1 = new Duck("Duck");
        System.out.println(duck1.toString());

        System.out.println(Calculadora.operation(10,2, Operation.MULTIPLICATION));

    }
}
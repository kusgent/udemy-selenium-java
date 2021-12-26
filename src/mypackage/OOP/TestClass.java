package mypackage.OOP;

public class TestClass {

    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.name = "Barsik";
        dog.name = "Sharik";

        cat.color = "Black";
        dog.color = "Brown";

        cat.walk("Backyard");
        dog.walk("Park");

        cat.feed("Milk");
        dog.sit();

        System.out.println("Cat name is " + cat.name);
        System.out.println("Dog name is " + dog.name);

        System.out.println();

        dog.var = 11;

        System.out.println(dog.getWeight());

    }

}

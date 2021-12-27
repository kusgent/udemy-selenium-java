package mypackage.AbstractClasses;

public class TestClass {

    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();

        dog.walk("Park");
        dog.saySmth();
        dog.sit();

        cat.walk("Backyard");
        cat.eat();

    }

}

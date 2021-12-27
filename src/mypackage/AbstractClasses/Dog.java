package mypackage.AbstractClasses;

public class Dog extends Animals {
    @Override
    public void saySmth() {
        System.out.println("Woof!");
    }

    @Override
    public void eat() {
        System.out.println("I like meat!");
    }

    public void sit() {
        System.out.println("I'm sitting.");
    }
}

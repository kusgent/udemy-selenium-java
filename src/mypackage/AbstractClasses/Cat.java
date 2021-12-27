package mypackage.AbstractClasses;

public class Cat extends Animals {
    @Override
    public void saySmth() {
        System.out.println("Meow!");
    }

    @Override
    public void eat() {
        System.out.println("I like milk!");
    }
}

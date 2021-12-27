package mypackage.OOP;

public class Cat extends Animals {

    public void feed(String feed) {
        System.out.println("I like: " + feed);
    }

    @Override
    public void sound() {
        System.out.println("Mew mew mew");
    }

}

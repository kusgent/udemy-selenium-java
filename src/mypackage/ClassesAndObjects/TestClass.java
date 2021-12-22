package mypackage.ClassesAndObjects;

public class TestClass {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.color = "Black";
        car1.length = 5000;
        car1.height = 2000;
        car1.width = 2000;

        car1.addWeight(50);
        car1.drive(120);

        car1.addWeight(700);
        car1.drive(100);

        Car car2 = new Car();
        car2.color = "White";
        car2.addWeight(66);
        Car car3 = new Car();
        car3.color = "Red";

        car2.drive(80);
        car3.drive(50);

        Car car4 = new Car("Grey");
        System.out.println("Car color is " + car4.color);

        Car car5 = new Car("Yellow", 1500, 1300, 3000);
        System.out.println(car5.color + " " + car5.height + " " + car5.width + " " + car5.length + " ");

        System.out.println();
        System.out.println(Car.var);
//        Car.var = 100;
        System.out.println(car1.var);
        System.out.println(car2.var);
        System.out.println(car3.var);
        System.out.println(car4.var);
        System.out.println(car5.var);

        Car.method();

        System.out.println(String.format("New %s.", "string"));

    }

}

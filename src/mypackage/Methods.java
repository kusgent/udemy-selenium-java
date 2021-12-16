package mypackage;

public class Methods {

    public static void main(String[] args) {

        int a = 13;
        int b = 3;
        int sum;

        sum = getSum(a, b);
        System.out.println(sum);

        sum = getSum(15, 63);
        System.out.println(sum);
        System.out.println(getSum(3, 373));

        showSum(15, 6, 45);
        showSum(35, 78, 67);

        saySmth();

        sayHello("Ilya");
        String test_name = "Robot";
        sayHello(test_name);

        showSumToPerson("Ilya", 45,4,5);

        boolean result = showSum(45,45,45);
        System.out.println(result);

    }

    static int getSum(int x, int y) {
        int sum;
        sum = x + y;
        return sum;
    }

    static boolean showSum(int x, int y, int z) {
        int sum = x + y + z;
        System.out.println("Sum is: " + sum);
        return true;
    }

    static void saySmth() {
        System.out.println();
        System.out.println("Hello!");
        System.out.println("I'm running!");
        System.out.println("You see me!");
    }

    static void sayHello(String name) {
        System.out.println();
        System.out.println("Hello, " + name + "!");
        System.out.println("I'm your program!");
        System.out.println("Nice to meet you!");
    }

    static void showSumToPerson(String name, int a, int b, int c) {
        System.out.println("Start of program!");
        sayHello(name);
        showSum(a, b, c);
        System.out.println("End of program!");
    }

}

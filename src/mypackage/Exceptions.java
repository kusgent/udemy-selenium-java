package mypackage;

public class Exceptions {

    public static void main(String[] args) {

        devide(10,5);

        System.out.println();

        try {
            devideThrow(10,0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

    }

    public static void devide(int a, int b) {
        try {
            System.out.println("Result is: " + a/b);
        } catch (ArithmeticException e) {
            System.out.println("Problem!");
        } finally {
            System.out.println("Finish!");
        }
    }

    public static void devideThrow(int x, int y) throws ArithmeticException {
        if(y == 0) {
            throw new ArithmeticException("Cannot devide by zero!");
        } else {
            System.out.println("Result is: " + x/y);
        }
    }

}

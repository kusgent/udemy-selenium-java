package mypackage;

public class Conditions {

    public static void main(String[] args) {

        int i = 4;

        System.out.println("Start of program");

        if (i > 10) {
            System.out.println("i > 10");
            i++;
            System.out.println(i);
        }

        else if (i <= 10 && i > 5) {
            System.out.println("i <= 10 && i > 5");
            i--;
            System.out.println(i);
        }

        else {
            System.out.println("i <= 5");
        }

        System.out.println("End of program");

        System.out.println();

        i = 95;

        if (i > 50) {
            System.out.println("i > 50");
            if (i > 90) {
                System.out.println("i > 90");
            }
            else {
                System.out.println("i <= 90");
            }
        }
        else {
            System.out.println("i <= 50");
        }

        System.out.println();

        i = 4;

        switch (i) {
            case 1:
                System.out.println("Then number is 1");
                break;
            case 2:
                System.out.println("Then number is 2");
                break;
            case 3:
                System.out.println("Then number is 3");
                break;
            default:
                System.out.println("I don't know the number");
        }

    }

}

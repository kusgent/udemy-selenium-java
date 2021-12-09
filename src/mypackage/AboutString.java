package mypackage;

import java.util.Arrays;
import java.util.Locale;

public class AboutString {

    public static void main(String[] args) {

        String s = "Hello World!";
        System.out.println(s.equals("Hello World!"));
        System.out.println(s.equals("Hello!"));

        String s2 = "Hello";
        System.out.println(s.equals(s2));

        s = "text";
        s2 = "TEXT";
        System.out.println(s.equalsIgnoreCase(s2));

        s = "TeXt";
        System.out.println();
        System.out.println(s);
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());

        System.out.println();
        System.out.println(s.charAt(1));
        System.out.println(s.indexOf("Xt"));

        s = "Hello World!";
        System.out.println();
        System.out.println(s.contains("Hello"));
        System.out.println(s.contains("text"));
        System.out.println(s.length());

        System.out.println();
        System.out.println(s.startsWith("H"));
        System.out.println(s.startsWith("d"));
        System.out.println(s.endsWith("l"));
        System.out.println(s.endsWith("!"));

        s = "Hello,world";
        System.out.println();
        String[] array = s.split(",");
        System.out.println(array[0] + "!" + array[1] + "!");
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(Arrays.toString(array));

        String str = "My name is %s! I'm %d years old!";
        int age = 31;
        String name = "Ilya";

        System.out.println();
        System.out.println(String.format(str, name, age));
        System.out.println(String.format(str, "Petya", 77));

        String age2 = "30";
        int a = Integer.parseInt(age2);

        System.out.println();
        System.out.println(a * 3);

        s = "Hello, world!";
        System.out.println();
        System.out.println(s.substring(1, 5));
        System.out.println(s.substring(7));
        System.out.println(s.substring(7, s.length() - 2));

        String s1 = "Hello ";
        s2 = "world";
        String s3 = "!";
        String res;

        res = s1 + s2 + s3;
        System.out.println(res);

        res = s1.concat(s2).concat(s3);
        System.out.println(res);

    }

}

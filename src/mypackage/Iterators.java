package mypackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterators {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(100);
        list.add(15);

        Iterator<Integer> iterator = list.iterator();

//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.hasNext());

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

}

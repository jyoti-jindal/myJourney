package oops.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterating {

    public static void main(String[] args) {
        String x = "abc";
        String y = "abc";
        x.concat(y);
        System.out.println(x);

        System.out.println(x);
        List<String> list1 = new ArrayList<String>();
        list1.add("foo");
        List<String> list2 = list1;
        List<String> list3 = new ArrayList<String>(list2);
        list1.clear();
        list2.add("bar");
        list3.add("baz");
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);


    }
}

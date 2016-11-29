package core.java.Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Surreallistic on 15.05.2016.
 */
public class App_Set {

    public static void main(String[] args) {

        Set<String> set1 = new TreeSet<>();

        set1.add("Dog");
        set1.add("Cat");
        set1.add("antelope");
        set1.add("Bear");


        // Iteration
        for(String e : set1) {
            System.out.println(e);
        }

        // Does set contain item

        System.out.println(set1.contains("Dog"));

        System.out.println(set1.isEmpty() + "\n----------------------");

        // Intersection
        Set<String> set2 = new TreeSet<>();

        set2.add("Dog");
        set2.add("giraffe");
        set2.add("antelope");
        set2.add("ant");

        Set<String> intersection = new HashSet<>(set1);

        System.out.println(intersection);

        System.out.println(intersection.removeAll(set2));

        System.out.println(intersection);

    }
}

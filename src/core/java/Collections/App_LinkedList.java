package core.java.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Surreallistic on 15.05.2016
 */
public class App_LinkedList {

    public static void main(String[] args) {

        List <Integer> arrayList = new ArrayList<>();
        List <Integer> linkedList = new LinkedList();

        doTiming("ArrayList", arrayList);
        doTiming("LinkedList", linkedList);

    }

    private static void doTiming(String type, List<Integer> list) {

        long start = System.currentTimeMillis();

        for(int i=0; i<1E5; i++) {
            list.add(0, i);
        }

        long end = System.currentTimeMillis();

        System.out.println("Time taken: " + (end - start) + " for " + type);

    }
}

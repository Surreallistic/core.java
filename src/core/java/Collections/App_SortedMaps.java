package core.java.Collections;

import java.util.*;

/**
 * Created by Surreallistic on 15.05.2016.
 */
public class App_SortedMaps {

    public static void main(String[] args) {

        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        Map<Integer, String> treeMap = new TreeMap<Integer, String>();
        Map<Integer, String> linedMap = new LinkedHashMap<Integer, String>();

        testMap(hashMap);
        testMap(treeMap);
        testMap(linedMap);

    }

    static void testMap(Map<Integer, String> map) {

        map.put(1, "Random 1");
        map.put(2, "Random 2");
        map.put(4, "Random 4");
        map.put(3, "Random 3");
        map.put(45, "Random 10");
        map.put(43, "Random 8");
        map.put(5, "Random 5");
        map.put(6, "Random 6");
        map.put(23, "Random 7");
        map.put(8, "Random 8");
        map.put(111, "Random 2");
        map.put(9, "Random 35");


        for(Integer key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        System.out.println("---------------------------------------");

    }
}

package core.java.Collections;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Surreallistic on 15.05.2016.
 */
public class App_HashMap {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(5, "five");
        map.put(4, "four");
        map.put(4, "three");
        map.put(2, "two");

        for(Map.Entry<Integer, String> one : map.entrySet()) {
            System.out.println(one.getValue() + " : " + one.getKey());
        }

    }
}

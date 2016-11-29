package core.java.Collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Surreallistic on 15.05.2016.
 */
public class App_ArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(112);
        numbers.add(53400);
        numbers.add(2);

        for(Integer x : numbers) { System.out.println(x); }

        numbers.remove(0);

        for(Integer x : numbers) { System.out.println(x); }

        List value = new ArrayList<Integer>();

    }
}

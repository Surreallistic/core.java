package core.java.Generics;

import javax.crypto.Mac;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Created by Surreallistic on 24.04.2016.
 */

class Machine {
    public String toString() {
        return "I'm a machine !";
    }

    void start() {
        System.out.println("Machine Started.");
    }
}

class Camera extends Machine {
    public String toString() {
        return "I'm a camera !";
    }

    void start() {
        System.out.println("Camera Started.");
    }
}

public class AppGenerics {

    public static void main(String[] args) {

        List<Camera> list1 = new ArrayList<>();

        list1.add(new Camera());
        list1.add(new Camera());

        List<Machine> list2 = new ArrayList<>();

        list2.add(new Camera());
        list2.add(new Machine());

        showList(list2);

    }

    public static void showList(List<? super Camera> list) {
        for(Object value : list) {
            System.out.println(value);
        }
    }
}

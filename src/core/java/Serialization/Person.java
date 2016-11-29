package core.java.Serialization;

import java.io.Serializable;

/**
 * Created by Surreallistic on 08.05.2016.
 */

public class Person implements Serializable {

    private static int count;
    private int id;
    private transient String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                "count" + count +
                '}';
    }
}

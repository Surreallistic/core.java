package core.java.Collections;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Surreallistic on 15.05.2016.
 */

class Person {

    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return name != null ? name.equals(person.name) : person.name == null;

    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}

public class App_CustomMapsSets {

    public static void main(String[] args) {

        Person p1 = new Person(1, "Sue");
        Person p2 = new Person(2, "Tom");
        Person p3 = new Person(3, "Jack");
        Person p4 = new Person(1, "Sue");


        Map<Person, Integer> map = new LinkedHashMap<>();

        map.put(p1, 1);
        map.put(p2, 2);
        map.put(p4, 4);

        for(Person i : map.keySet()) {
            System.out.println("KEY: " + i + ". VALUE: " + map.get(i));
        }
    }
}

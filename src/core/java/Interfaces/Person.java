package core.java.Interfaces;

/**
 * Created by Surreallistic on 24.04.2016.
 */
public class Person implements Info {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void greet() {
        System.out.println("Hello there");
    }

    @Override
    public void showInfo() {
        System.out.println("Name is: " + name);
    }
}

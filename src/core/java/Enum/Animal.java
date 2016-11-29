package core.java.Enum;

/**
 * Created by Surreallistic on 03.05.2016.
 */
public enum Animal {

    CAT("Tom"), DOG("Fe0g0yg"), MOUSE("mice");

    private String name;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}

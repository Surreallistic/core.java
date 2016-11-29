package core.java.StaticFinal;

/**
 * Created by Surreallistic on 23.04.2016.
 */

class Thing {
    private String name; // instance variable
    private static String desc;
    public static final String LUCK = "You're lucky!";
    private static int count = 0;
    private int id;

    public Thing(String name) {
        this.name = name;
        id = count;
        count++;
    }

    public String printName() {
        return name + " " + id;
    }

    public static int getCount() {
        return count;
    }

    public static void printDesc() { System.out.println(desc); }
}

public class AppStaticFinal {

    public static void main(String[] args) {

        Thing newThing = new Thing("name");
        System.out.println(newThing.printName());

        Thing secondThing = new Thing("Nick");
        secondThing.printName();

        System.out.println(newThing.getCount());
        System.out.println(Thing.LUCK);
    }
}

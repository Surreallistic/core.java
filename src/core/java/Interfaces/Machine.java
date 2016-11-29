package core.java.Interfaces;

/**
 * Created by Surreallistic on 24.04.2016.
 */
public class Machine implements Info {

    private static int id = 1;

    public Machine() {
        id++;
    }

    public void start() {
        System.out.println("Machine Started.");
    }

    @Override
    public void showInfo() {
        System.out.println("Machine ID is: " + id);
    }
}

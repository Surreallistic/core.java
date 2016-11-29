package core.java.AbstractClasses;

/**
 * Created by Surreallistic on 02.05.2016.
 */
public abstract class Machine {

    private int id;

    public String getId() {
        return "Your ID is: " + id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract void start();

    public abstract void doStuff();

    public abstract void shutdown();

    public void run() {
        start();
        doStuff();
        shutdown();
    }
}

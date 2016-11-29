package core.java.PassingByValue;

/**
 * Created by Surreallistic on 14.05.2016.
 */
public class App {

    public static void main(String[] args) {

        App app = new App();

        int value = 8;
        app.show(value);

    }

    void show(int value) {

        System.out.println(value);

    }
}

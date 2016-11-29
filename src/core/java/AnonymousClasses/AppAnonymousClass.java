package core.java.AnonymousClasses;

interface interfeejs {

    void methooodd();
}

/**
 * Created by Surreallistic on 30.04.2016.
 */

class Machine {

    void start() {
        System.out.println("Machine starting...");
    }
}

public class AppAnonymousClass {

    public static void main(String[] args) {

        Machine machine1 = new Machine() {
            void start() {
                System.out.println("Camera snappign....");
            }
        };
        machine1.start();

        interfeejs good = new interfeejs() {
            @Override
            public void methooodd() {
                System.out.println("inside override method ");
            }
        };

        good.methooodd();


    }
}

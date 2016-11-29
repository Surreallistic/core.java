package core.java.Polymorphism;

/**
 * Created by Surreallistic on 24.04.2016.
 */
class Car {
    void start() {
        System.out.println("String a car.");
    }
}

class Engine extends Car {
    void start() {
        System.out.println("Engine starts.");
    }

    void goForIt() {
        System.out.println("Mistake");
    }
}


public class AppPolymorph {

    public static void main(String[] args) {

        Engine engine1 =
                new Engine();

        //upcasting
        Car car1 = engine1;
        car1.start();
        //downcasting
        Car car2 = new Engine();
        Engine engine2 = (Engine) car2;
        engine2.goForIt();
        engine2.start();
    }

}

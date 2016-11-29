package core.java.InnerClasses;

/**
 * Created by Surreallistic on 03.05.2016.
 */
public class Robot {

    private int id;

    public Robot(int id) {
        this.id = id;
    }

    void start() {
        System.out.println("Starting robot " + id);
        Brain brain = new Brain();
        brain.startAI();

        class Temp {
            void doJob() {
                System.out.println(id);
            }
        }

    }

    private class Brain { //nested class
        void startAI() {
            System.out.println("You have made an AI !! " + "Robot ID: " + id);
        }
    }

    static class battery {
        void charge() {
            System.out.println("Battery charging..");
        }
    }

    static class CPU{
        void charge() {
            System.out.println("CPU creating an AI");
        }
    }
}

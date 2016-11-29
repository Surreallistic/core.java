package core.java.InnerClasses;

/**
 * Created by Surreallistic on 03.05.2016.
 */
public class AppInner {

    public static void main(String[] args) {

        Robot robo1 = new Robot(1);
        robo1.start();

        //Robot.Brain brain = robo1.new Brain(); //weird o.O
        //brain.startAI();

        Robot.CPU battery = new Robot.CPU(); // inner static class of Robot
        battery.charge();
    }
}
